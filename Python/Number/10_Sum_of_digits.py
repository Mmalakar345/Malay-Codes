

## Write a program Find the sum of digits of an user input number, two  digits or more than two.
num=int(input("Enter a positive number"))
sum=0
while num>0:
    sum=sum+num%10
    num//=10
print(sum)
