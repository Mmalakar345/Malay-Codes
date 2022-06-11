## Display all the 3 digits peterson numbers.
## A number i s a peterson number if sum of the factorial of digit is equal to the number.

print("Peterson number are=")
num=100
while num<=999:
    copy=num
    sum=0
    while copy>0:
        fact=1
        digit=copy%10
        for i in range(1,digit+1):
            fact=fact*i
        sum+=fact
        copy=copy//10
    if num==sum:
        print(num)
    num+=1

###########################################################################
## Function calling some part sort.
## Same o/p.
import math
print("Peterson number are=")
num=100
while num<=999:
    copy=num
    sum=0
    while copy>0:
        fact=1
        digit=copy%10
        fact=math.factorial(digit)
        sum+=fact
        copy=copy//10
    if num==sum:
        print(num)
    num+=1
        
