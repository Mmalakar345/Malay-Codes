# Write a program to input two and perform the following operations:
# 1. Display the list having maximum number of elements
# 2. Display the uinion
# Example:
# Enter first list
# [9,5,6,9,2]
# Enter second list
# [8,5,2,9]
# Thw e list having max no. of elements is [9,5,6,9,2]
# The union is 
# [2,5,6,8,9]

list1=eval(input("Enter First list"))
list2=eval(input("Enter Second list"))
length1=len(list1)
length2=len(list2)
if length1==length2:
    print("both the lisths have same number of elements")
elif length1>length2:
    print("The list havaing max no. elements is",list1)
else:
    print("The list having max no. of elements is",list2)
#union
list1.extend(list2)
list1.sort()
unique=[]
for val in list1:
    if val not in unique:
        unique.append(val)
print("Union is=",unique)