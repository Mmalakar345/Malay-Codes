#######################   EXAMPLE 1  ########################


# Input a number and check whether the number is palindroimic no or not

# num=int(input("Enter a positive number"))
# rev=0
# copy=num
# while num>0:
#     rev=rev*10+num%10
#     num//=10

# if copy==rev:
#     print(copy, "is a palindromic no")
# else:
#     print(copy,"is not a palindromic no")




#######################   EXAMPLE 2  ########################

### Print all 3 digit palimdromic numbers

print("Palindramic numbers between 10 to 200 are =")
num=100
while num<=1000:
    rev=0
    copy=num
    while copy>0:
        rev=rev*10+copy%10
        copy//=10
    if num==rev:
        print(num,end=" ")
    num+=1  