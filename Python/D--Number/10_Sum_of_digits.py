## Find sum of digits of number

num=int(input("Enter a positive number"))
sum=0
while num>0:
    sum=sum+num%10
    num//=10
print(sum)
