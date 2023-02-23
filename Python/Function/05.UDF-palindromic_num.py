
# Input a number and whether the number is a palandromic number or not using UDF
###################################### Type 1 ######################################
########################### Without passing return value ###########################
def isPalindrome(num):
    rev=0 
    copy=num 
    while copy>0: 
        rev=rev*10+copy%10 
        copy=copy//10 
    if rev==num: 
        print("This is a Palindromic number") 
    else: 
        print("This is not a palindromic number") 
## main
n=int(input("Enter a positive number")) 
isPalindrome(n) ## Methode call






# Input a number and whether the number is a palandromic number or not using UDF
########################### Type 2 ###########################
########################### Without passing return value ###########################
def isPalindrome(num):
    rev=0 
    copy=num 
    while copy>0: 
        rev=rev*10+copy%10 
        copy=copy//10 
    if rev==num: 
        return True 
    else: 
        return False 
## main
n=int(input("Enter a positive number == > ")) 
check=isPalindrome(n) ## Methode call
if check==True: 
        print("This is a Palindromic number") 
else: 
        print("This is not a palindromic number")