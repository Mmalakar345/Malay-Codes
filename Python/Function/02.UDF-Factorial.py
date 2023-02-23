## user- defined Function to get factorial of a number

def getfactorial(n): ## Returns the factorial of n--here n is known as parameter/argument
     fact=1
     for i in range(1,n+1):
         fact=fact*i
     return fact
 
## main block
num=int(input("Enter a number == > "))
factorial=getfactorial(num) # Method call
print("Factorial of ",num,"is= ",factorial)

num=int(input("Enter another number == > "))
factorial=getfactorial(num) # Method call
print("Factorial of ",num,"is= ",factorial)

num=int(input("Enter another number == > "))
print("Factorial of ",num,"is= ",getfactorial(num)) # Method call
