## Find the sum of the series s=1/1!+1/3!+1/5!.........10 terms
def getfactorial(n):  ## Returns the factorial of n-- here n is known as parameter/argument
     fact=1
     for i in range(1,n+1):
         fact=fact*i
     return fact

def getSum():
    Sum=0
    deno=1
    for i in range(1,11):
        Sum=Sum+1/getfactorial(deno) ## Factorial call
        deno+=2
    print("sum of the series == > ",Sum)
# Main block
getSum()  ## method call
