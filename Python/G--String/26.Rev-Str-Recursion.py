# Display a string in reverse by recursibe method
def reverseString(word):
    if len(word)==0:    # base criteria
        return ""  
    else:
        print(word[len(word)-1],end="")
        reverseString(word[:len(word)-1]) #recursive call
        
# Word=input("python")
# reverseString("python")
# reverseString("pytho")
# reverseString("pyth")
# reverseString("pyt")
# reverseString("py")
# reverseString("p")
# reverseString("")
word=input("Enter a word==> ")