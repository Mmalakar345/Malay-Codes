# List Methods
# list positive index starts from= 0 1 2 3 4 5
# list negative index starts from= -1 -2 -3 -4 -5
# index= .........-3 -2 -1 0 1 2 3

## Removing functions
## list.pop(index) -deleting th evalue at index position. It also runes the value after deleting.
b1=[2,5,7,8,9]
val=b1.pop(3)
print("After deleting element at 3 index=",val)
print("After deleting element at 3 index=",b1)

## Delete the last elements of the list
val=b1.pop()
print("After deleting the last element is=",val)
print("After deleting the last element=",b1)

## list.remove(value) # delete the first occurence of the value from the list, does not returns anything else
## Produces error if not found
b1.remove(5)
print("After removing first occurance of 5=",b1)

## list.clear() _to delete all elements of the list and the list becomes empty then
b1.clear()
print("After clear=",b1)