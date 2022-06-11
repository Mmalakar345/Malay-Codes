# line=input("Enter a sentence=>")
line=("i am a good boy.she is a programmer.he is an army")

li=line.split(".") # returns a list of strings
print(li)
for new in li:
    words=new.split()
    print()
    reverse=""
    print("word <===> reverse")
    for word in words: # get each word
        List=list(word) # String to list conversion
        List.reverse()
        for ch in List: # List to string conversion
            reverse=reverse+ch
        print(word,"      ",reverse)
        reverse=""