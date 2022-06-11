# Inpput a number and check whether the number is a Desarium number  or not.
# e.g: 135. A number which is equaal to the sum of itts digits raised to the power of position

num=int(input("Enter a positive num"))
sum=0
copy=num
count=0
digit=0
# This loop counts total number of digits
while copy>0:
    copy=copy//10
    count+=1  # count total number of digit
copy=num
# This loop calculates the sum of the digits raised to the power of their position.
while copy>0:
    digit=copy%10   # to get the digit of one's place
    sum=sum+digit**count
    count-=1
    copy//=10
if num==sum:
    print("It is a Disarium Number")
else:
    print("It is not a Disarium Number")

