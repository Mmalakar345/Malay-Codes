# Enter a line and Display the Palndromic words only
# Rreturns true if the palindrome otherwise return false
def isPlindrome(word):
    rev=""
    for i in range(len(word)):
        rev=word[i]+rev
    if rev.upper()==word.upper():
        return True
    else:
        return False
# Takes input a line and display the plandromic words
def getinput():
    line=input("Enter a line/Sentance")
    words=line.split()
    print("Output:")
    print("Palindromic words are:")
    count=0
    for word in words:
        if isPlindrome(word):
            print(word)
            count+=1
    if count==0:
        print("No Palindromic word is present in the line")
# Main
getinput()
    