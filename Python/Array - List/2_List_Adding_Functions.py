# List Methods
# list positive index starts from= 0 1 2 3 4 5
# list negative index starts from= -1 -2 -3 -4 -5
# index= .........-3 -2 -1 0 1 2 3

a1=[1,3,4,6,8]
print("The List is=",a1)
print("Number of elements in the list=",len(a1))

## Adding functions
## Add an elements at the end of the list
a1.append(9)
print("After adding one elements at the end of the list=",a1)

## Add elements at specific index list.insert(index,value)
a1.insert(3,5)
print("After inserting one element at 3 index=",a1)

## Add a value at the end of the list
a1.insert(len(a1),10)
print("After adding one elements at the end of the list=",a1)

## Add multiple elements at the end of the list
a1.extend([11,13])
print("After adding multiple elements at the end of the list=",a1)
print("********************************************************************************")




