# Find sum of Even & product(multiplication) of odd digits of a number(4381).
# num=4381
num=int(input("Enter a number"))
evendigit=0
odddigit=0
while num>0:
    digit=num%10
    if digit%2==0: 
        evendigit+=digit
    else:
        odddigit+=digit
    num//=10
print("Sum Of Even Digit ==> ",evendigit)
print("Sum Of Odd Digit ==> ",odddigit)