## Input a number and check whether the number is availavle In the list or using linear search


numlist=eval(input("Enter a list of 10 number ==> "))
num=int(input("Enter a number to search in the list ==> "))
if num in numlist:
    print(num,"is available in the list")

else:
    print(num,"is not available in the list")


########################################################################
## Alternative code using loop

numlist=eval(input("Enter a list of 10 number ==> "))
num=int(input("Enter a number to search in the list ==> "))
for val in numlist:
    if val==num:
        print(num, "is available in the list")
        break
else:
    print(num, "is not available in the list")
