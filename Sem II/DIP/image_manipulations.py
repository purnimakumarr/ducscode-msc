from PIL import Image
from PIL import ImageEnhance
import numpy as np
import math

def scalar_add(image, a=10):
  return image.point(lambda x: x + a)

def scalar_sub(image, s=10):
  return image.point(lambda x: x - s)

def scalar_mul(image, m=2):
  return image.point(lambda x: x * m)

def scalar_div(image, d=1.5):
  return image.point(lambda x: x / d)

def scalar_mod(image, m=1.5):
  return image.point(lambda x: x % m)

def contrast_enhancer(image, contrast=10):
  imageEnhancer = ImageEnhance.Contrast(image)
  return imageEnhancer.enhance(contrast)

def threshold(image, factor = 124):
  return image.point(lambda x: 255 if x > factor else 0)

def log_transform(image, c = 1):
  result = Image.new('L', image.size)
  for i in range(image.size[0]):
    for j in range(image.size[1]):
      output = c * np.log(image.getpixel((i, j)) + 1)
      result.putpixel((i, j), math.ceil(output))
  return result

def power_transform(image, c = 1, lambd = 1):
  result = Image.new('L', image.size)
  for i in range(image.size[0]):
    for j in range(image.size[1]):
      output = c * np.power(image.getpixel((i, j)), lambd)
      result.putpixel((i, j), math.ceil(output))
  return result

def negative_transform(image):
  l = image.getextrema()[1]
  result = Image.new('L', image.size)
  for i in range(image.size[0]):
    for j in range(image.size[1]):
      output = l - 1 - image.getpixel((i, j))
      result.putpixel((i, j), output)
  return result