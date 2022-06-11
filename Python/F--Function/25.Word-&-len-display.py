# Inpt a line and display tje words along with number of characters present in each of the word
# This method takes input a line, splits wordwise and stores in a list. At last returns the list
def getinput():
    line=input("Enter a sentance")
    words=line.split()
    return words
# This method displays each word along with the length of the word
def display(words):
    print("word ","No. of characters")
    for word in words:
        print(word,"  ",len(word))
# Main
words=getinput()
display(words)
