#6.Write a program to take input of two dictionaries from user and perform the following operations: 	 	 	 	 	 	 	 	 	 	 
#(i)Display addition of two dictionaries. 
#(ii)Display difference of two dictionaries. 
#Example: 
#Enter First dictionary: dict1 = {'a': 10, 'b': 5, 'c': 3}  
#Enter Second Dictionary: dict2 = {'d': 6, 'c': 3, 'b': 8} 
#Output: 
#Addition: {'a': 10, 'b': 13, 'c': 6,’d’: 6} 
#Subtraction: {‘a’:10,‘ b': 3, 'c': 0,’d’:6}
import math
add={}
sub={}
dict1=eval(input("Enter the first dictionary"))
dict2=eval(input("Enter the second dictionary"))
# For addition
for key1 in dict1:
    if key1 in dict2:
       add[key1]=dict1[key1]+dict2[key1]
    else:
       add[key1]=dict1[key1]
for key2 in dict2:
    if key2 not in dict1:
        add[key2]=dict2[key2]
            
# For subtraction
for key1 in dict1:
    if key1 in dict2:
       sub[key1]=(int)(math.fabs(dict1[key1]-dict2[key1]))
    else:
       sub[key1]=dict1[key1]
for key2 in dict2:
    if key2 not in dict1:
        sub[key2]=dict2[key2]
print("Addition:",add)
print("subtraction:",sub)