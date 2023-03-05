## input 10 Integer (Both negative and positive)In A list.
## Then Create a new list with positive integers and another list
## With the negative integers.
## Display the orginsl as well as the new lists.

source=eval(input("Enter 10 integers(both positive and negative) in a list ==> "))
poslist=[]  # Creates an empty list
neglist=[]
#separating all the negative numbers in one array
for val in source:
    if val<0:
        neglist.append(val)
    else:
        poslist.append(val)
print("Orginal list is as follows :-")
print(source)
print("Positive numbers are :-")
print(poslist)
print("Negative numbers are :-")
print(neglist)