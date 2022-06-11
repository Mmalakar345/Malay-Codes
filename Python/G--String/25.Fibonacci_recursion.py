# Display first n fibonacci numbers
# 0 1 1 2 3 5 8 13 21 34
def fib(n):
    if n<=1:
        return 0
    elif n==2:
        return 1
    else:
        return fib(n-1)+ fib(n-2) # recursive call
n=int(input("Enter total number of terms"))
for i in range(1,n+1):
    print(fib(i),end=" ")
    
# when n input 10  
# 1 step = 0
# 2 step = 1
# 3 step = fib(n-1) + fib(n-2)
#           fib(3-1) + fib
# 4 step = 
# 5 step = 
# 6 step = 
# 7 step = 