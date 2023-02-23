# Swap two numbers using user-defined Method
def swap():
    global num1
    global num2
    # swapping code
    temp=num1
    num1=num2
    num2=temp
    print("Within the method")
    print("num1=",num1,"num2=",num2)
# Main
num1=int(input("Enter 1st number ==> "))
num2=int(input("Enter 2nd number ==> "))
swap()  # Method call
print("After Function Call")
print("Num1=",num1,"Num2=",num2)
    