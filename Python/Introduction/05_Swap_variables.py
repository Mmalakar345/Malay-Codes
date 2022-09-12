#1. how to swap some variables value
print("1. ")
num,num0=200,400
print("Before swap=")
print("num=",num, "num=",num0)
temp=num
num=num0
num0=temp
print("After swap")
print("num=",num, "num0=",num0)

print("2.")
#2. how to swap some variables value
num1,num2=20,30
print("Before swap=")
print("num1=",num1, "num2=",num2)
num1,num2=num2,num1
print("After swap")
print("num1=",num1, "num2=",num2)

print("3.")
#3. how to swap some variables value
num1,num2,num3,num4,num5,num6= 300,500,800,400,700,200
print("Before swap=>","num1=",num1,"or","num2=",num2)
num1,num2 = num3,num4
print("After swap=>","num1-",num1,"or","num2-",num2)