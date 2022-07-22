import array as A
L=eval(input("Enter some number in a list= "))
obj=A.array('i',L)
pos=[]
neg=[]
for val in obj:
    if val <0:
        neg.append(val)
    else:
        pos.append(val)
print("array Positive value is",len(pos))
print("array Negative value is",len(neg))