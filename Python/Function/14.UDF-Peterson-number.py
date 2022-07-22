# Disply all the Peterson numbers in a range.
# Anumber which is equal to the sum of the factorial of each digit,
# isknown as Peterson/Krishnamurty number  

def displayallPetersonnos(low,high): # Display all the petersonnumbers in a range
    print("Peterson numbers between ",low," to ",high," are=")
    for num in range(low,high+1):
        if isPetersonNo(num)==True:
            print(num,end=",")

def getFactorial(digit):  ## Return the Factorial of a digit
    fact=1
    for i in range(1,digit+1):
        fact=fact*i
    return fact

def isPetersonNo(num): ## Returns true if num is a peterson number otherwise return False
    copy=num
    sum=0
    while copy>0:
        digit=copy%10 ## Extract a digit
        sum=sum+getFactorial(digit) # Method call
        copy//=10
    if num==sum:
        return True
    else:
        return False
        
low=int(input("Enter the lower Range"))
high=int(input("Enter the Higher Range"))
if low>high:
    print("Invalide Input")
else:
    displayallPetersonnos(low,high)