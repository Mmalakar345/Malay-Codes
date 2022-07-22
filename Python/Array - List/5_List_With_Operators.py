## List Operations
## Concatetion of two lists
l1=[1,2,3,4,5]
l2=['a','b','c']
l3=l1+l2
print("After concating list is=",l3)

## Replication of a lists
## Replication kora mane list er *2 kora 2bar list likha *3 kora 3bar list likha.
l4=l2*2  ## asterisk operator
print(l4)

## Slicing
## list[Starts index:end index:step value]
print(l1[1:4]) ## get all the elements from index 1 to 3
print(l1[:4])  ## get all the elements from index 0 to 3
print(l1[1:])  ## get all the elements from index 1 to last indeex
print(l1[1:6:2])
print(l1[-1:-8:-1]) ## traversing by negative index
print(l1[::2])
print(l1[2::2])