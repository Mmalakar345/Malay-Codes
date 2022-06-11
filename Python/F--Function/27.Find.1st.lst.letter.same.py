# Question:- Input a line and display the words which start and end with same letter.

# This method returns Tuue if the paarameter word starts and ends with same letter 
def isStartsandendsame(word):
    # short Method
    return word.upper().endswith(word[0].upper())

    # Long Method
    # word=word.upper()
    # if word[0]==word[len(word)-1]:
    #     return True
    # else:
    #     return False
    
# Takes input a line and displays the words which start and end with same letter
def getinput():
    line=input("Enter a line=> ")
    words=line.split()
    print("<== Output is ==>")
    count=0
    for word in words:
        if isStartsandendsame(word):
            print(word)
            count+=1
    if count==0:
        print("No word present in the line which starts and end with same letter")
# Main
getinput()


# word="malam"
# a=word.upper().endswith(word[0].upper())
# print(a)
# Output True

# word="malay"
# a=word.upper().endswith(word[0].upper())
# print(a)
# Output False