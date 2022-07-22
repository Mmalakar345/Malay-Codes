# RECURSION
def getsum(n):
    if n==0: #base criteria
        return 0
    else:
        return n+getsum(n-1) #recursive call # 2+1+getsum(0)
n=int(input("Input n==> "))
sum=getsum(n)
print("Sum of frist ",n," natural nos is",sum)
# return 5+ getsum(4) 
# return 5+ return 4+ getsum(3)
# return 5+ return 4+ return 3+ getsum(2)
# return 5+ return 4+ return 3+ return 2+ getsum(1)
# return 5+ return 4+ return 3+ return 2+ return 1+ getsum(0)
# return 5+ return 4+ return 3+ return 2+ return 1+ 0
# return 5+ return 4+ return 3+ return 2+ 1
# return 5+ return 4+ return 3+ 3
# return 5+ return 4+ 6
# return 5+ 10
# return 15   