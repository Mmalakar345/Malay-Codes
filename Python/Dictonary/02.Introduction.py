# Introduction to Dicctonary
# Taking input
dict=eval(input("Enter Roll no and name Pair=>"))
# Display
# Travers by loop
for key in dict:
    print(key,dict[key])
print() # Space line
print("Disply by get ()")
for key in dict:
    print(key,dict.get(key))
print() # Space line
print("This is another from of display")
print(dict)
print() # Space line
print("Length of the dictonary is",len(dict))
print() # Space line
print("keys are as follows")
print(dict.keys())
print() # Space line
print("Values are as follows")
print(dict.values())
print() # Space line

# Converting to tuple
tuple=dict.items()
print(tuple)
print()
# Disply the tuple
for t in tuple:
    print(t)
print() # Space line

# Copy function
new=dict.copy()
print(new)
print() # Space line

# Searching
srch={1:"malay",2:"bibhakar",3:"arup"}
print(1 in srch)
print("malay" in srch)
print(2 in srch)
print("arup" not in srch)
print(3 in srch)
print() # Space line

# Adding elements to the dictonary
key=int(input("Enter the rollno to search=>"))
value=input("Enter the new name=>")
srch[key]=value
print("after Adding the dictonary is")
print(srch)

print() # Space line


# Deleting elements from a dictonary
rollno=int(input("Enter the rollno to delete=>"))
del srch[rollno]
print("Aftrt deleting elements")
print(srch)
print() # Space line

# Updating Elementin a dictonary
srch={}
key=int(input("Enter the rollno to search "))
value=input("Enter the new name ")
srch[key]=value
print("after updating the dictonary is")
print(srch) 
print() # Space line

# dictnew={1:"malay",2:"bibhakar",3:"arup"}
# dictnew[4]="riya"
# print(dictnew)
# for i in dictnew.items():
#     print(i)
