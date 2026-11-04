def linear_search(array, key):

  for i in range(len(array)):
    if array[i] == key:
      return True
  return False

def binary_search(array, key):
  start=0
  stop=len(array)-1
  
  if array[start] == key:
    return True
  
  if array[stop] == key:
    return True

  # if array[start] > key:
  #   return False
  
  # if array[stop] < key:
  #   return False

  midpoint = ( start + stop ) // 2

  while ( array[midpoint] != key ):

    if (array[midpoint] > key ):
      stop = midpoint
    else: 
      start = midpoint

    midpoint = ( start + stop ) // 2

    if (midpoint == start) or (midpoint == stop):
      return False
    
  return True

array = [5, 7, 10, 12, 14, 16, 19]

for key in [1, 5, 13,14,19,20]:
  print(key, binary_search(array,key))
