import numpy as np
n1=np.arange(12)
print(n1)
print("Data type of n1= ",type(n1))
print("Dimension of n1= ",n1.ndim)
print("Shape of n1= ",n1.shape)
print("Data type of each element= ",n1.dtype)
print()

n2=n1.reshape(3,4)
print(n2)
print("Data type of n2= ",type(n2))
print("Dimension of n2= ",n2.ndim)
print("Shape of n2= ",n2.shape)
print("Data type of each element= ",n2.dtype)
print() 