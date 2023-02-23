# Display all 3 digit Palindrome number using User Defined Function.
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
# Main
for val in range(100,1000):
    if isPalindrome(val): # Method call
        print(val,end=" ")
    