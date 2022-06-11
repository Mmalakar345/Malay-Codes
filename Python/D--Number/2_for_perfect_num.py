# Input a positive number and check wheather the is a perfect number or not
# a number is a perfect number if it is equal to the sum of the factors except itself
# e.g : 6 is a perfect number as 1+2+3=6

num=int(input("Enter a positive number"))
sum=0
for i in range(1,num):
    if num%i==0:
        sum=sum+i
if num==sum:
    print(num," is a perfect number")
else:
    print(num," is not a perfect number")




# Perfect number auto cheking
# Only range limit required

for count in range(1,19):
    num=count
    sum=0
    for i in range(1,num):
        if num%i==0:
             sum=sum+i
    if num==sum:
        print(num," is a perfect number")
    else:
        print(num," is not a perfect number")















