import numpy as np
a=np.array([[4,5],[8,9]]) 
print(a)
print()
b=np.array([[4,5],[8,9]])
print(b)
print()
c=a+b
print(c)
print()
d=a.dot(b)
print(d)
# dot 
# 4  5
# 8  9

# 4  5
# 8  9

# 4*4 + 5*8 
# 56   ?
# ?    ?
print("Squre root of 255=",np.sqrt(255))
print()
n1=np.arange(12).reshape(3,4)
print(n1)
print("Sum of all=",n1.sum())
print("Row sum=",n1.sum(axis=1))
print("Column sum=",n1.sum(axis=0))