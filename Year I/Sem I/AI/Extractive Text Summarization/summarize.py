from string import punctuation
from collections import Counter 
from sklearn.feature_extraction.text import ENGLISH_STOP_WORDS as stop_words
import pandas as pd
    
def tokenizer(s):
    tokens = []
    for word in s.split(' '):
        tokens.append(word.strip().lower())
        
    return tokens

def sent_tokenizer(s):
    sents = []
    for sent in s.split('.'):
        sents.append(sent.strip())
        
    return sents

def count_words(tokens):
    word_counts = {}
    for token in tokens:
        if token not in stop_words and token not in punctuation:
            if token not in word_counts.keys():
                word_counts[token] = 1
            else:
                word_counts[token] += 1
                
    return word_counts

def word_freq_distribution(word_counts):
    freq_dist = {}
    max_freq = max(word_counts.values())
    for word in word_counts.keys():  
        freq_dist[word] = (word_counts[word]/max_freq)
        
    return freq_dist

def score_sentences(sents, freq_dist, max_len=40):
    sent_scores = {}  
    for sent in sents:
        words = sent.split(' ')
        for word in words:
            if word.lower() in freq_dist.keys():
                if len(words) < max_len:
                    if sent not in sent_scores.keys():
                        sent_scores[sent] = freq_dist[word.lower()]
                    else:
                        sent_scores[sent] += freq_dist[word.lower()]
                        
    return sent_scores

def summarize(sent_scores, k):
    top_sents = Counter(sent_scores) 
    summary = ''
    scores = []
    
    top = top_sents.most_common(k)
    
    for t in top: 
        summary += t[0].strip() + '. '
        scores.append((t[1], t[0]))
        
    return summary[:-1], scores

def main():
  # Take input from the user
  text = input('\nEnter the text to be summarized: ')
  no_of_sentences = int(input('Enter the no. of senetences in the summary: '))

  if not text:
      return
  if not no_of_sentences:
      return
  
  tokens = tokenizer(text)
  sentences = sent_tokenizer(text)
  word_counts = count_words(tokens)
  freq_dist = word_freq_distribution(word_counts)
  sentence_scores = score_sentences(sentences, freq_dist)
  summary, summary_sent_scores = summarize(sentence_scores, no_of_sentences)

  print('Extractive Text Summarization')
  print('Input text: ' , text)
  print('Input number of sentences in summary: ', no_of_sentences)

  print('\nSummary sentence score for the top ' + str(no_of_sentences) + ' sentences: ')
  data = []
  for score in summary_sent_scores: 
    data.append([score[1], score[0]])
  
  df = pd.DataFrame(data, columns = ['Sentence', 'Score'])
  print(df)
  print('\nSummary: ' + summary)

main()