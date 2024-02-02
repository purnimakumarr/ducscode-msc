/**
 * @author Purnima Kumar
 * @date 28-09-2023
 */

/*
AIM: To analyze Insertion Sort algorithm.

SOP:
1. Count the number of key comparisons for various inputs and plot the graph.
2. For every input size n, run the algorithm with 10 different sets of data points generated randomly.
3. Compute the minimum, maximum, and the average number of key comparisons for each input size.
4. Plot the graph for each case best, worst, and average number of comparisons.
5. n varies from 10 to 100 in steps of 5.

Algorithm function:
Insertion-Sort(A)
  for j = 2 to A.length
  key = A[j] 
  // Insert A[j] into the sorted sequence A[1...j-1]
  i = j - 1
  while i > 0 and A[i] > key
    A[i + 1] = A[i]
    i = i - 1
  A[i + 1] = key
*/

#include<iostream>
#include<cstdlib>
#include <bits/stdc++.h>

using namespace std;

int SIZE = 10;

int insertionSort(int *arr, int s) {
  int j, key, comp = 0;
  for(int i = 1; i < s; i++) {
    key = arr[i];
    j = i - 1;
    while(j >= 0) {
      comp++; // counting comparisons
      if(key < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      } else {
        break;
      }
    }
    arr[j + 1] = key;
  }
  return comp;
}

int generateRandomArray(int* arr, int s) {
  for(int i = 0; i < s; i++) {
    arr[i] = rand() % 200; // Genrate a random number within the range of 1 and 200
  }
}

int printArray(int* arr, int s) {
  for(int j = 0; j < s; j++) {
    cout<<arr[j]<<"\t";
  }
}

int main() {
  int arr[SIZE];
  int comp, comparisons[10], totalComp, min, max;
  float average, sum = 0;

  cout<<"FOR INPUT SIZE "<<SIZE<<endl;
  cout<<"==================\n";

  for(int j = 0; j < 10; j++) {
    for(int i = 0; i < SIZE; i++) {
      generateRandomArray(arr, SIZE);
    }
    if(j == 0) {
      // Best Case
      sort(arr, arr + SIZE);
    } else if(j == 1) {
      // Worst Case
      sort(arr, arr + SIZE, greater<int>());
    }
    cout<<"\nInput Array "<<j + 1<< " : ";
    printArray(arr, SIZE);
    comparisons[j] = insertionSort(arr, SIZE);
    cout<<"\nSorted Array "<<j + 1<< " : ";
    printArray(arr, SIZE); 
    cout<<"\nComparisons: "<<comparisons[j]<<endl;
  }

  sort(comparisons, comparisons + 10);

  cout<<"\nMinimum comparisons: "<<comparisons[0];
  cout<<"\nMaximum comparisons: "<<comparisons[9];

  for(int j = 0; j < 10; j++) {
    sum += comparisons[j];
  }
  cout<<"\nTotal number of comparisons: "<<sum;

  average = sum / 10;
  cout<<"\nAverage number of comparisons: "<<average;

  return 0;
}