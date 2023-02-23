# Swap two numbers using user-defined method(Swapping occurs within Function only)
def swap(num1,num2):
    temp=num1
    num1=num2
    num2=temp
    print("Within the method")
    print("num1 =",num1,"num2 =",num2)
    print()
# Main
num1=int(input("Enter 1st number ==> "))
num2=int(input("Enter 2nd number ==> "))
swap(num1,num2)  # Method call
print("After Function Call")
print("Num1 =",num1,"Num2 =",num2)