# Write a program input a sentence and output is each word reverse individual.

line=input("Enter a sentence=>")
# accessing each letter/chaaracter of the list in a loop
# Word by word acces
words=line.split() # returns a list of strings
print()
reverse=""
print("word <===> reverse")
for word in words: # get each word
    List=list(word) # String to list conversion
    List.reverse()
    for ch in List: # List to string conversion
        reverse=reverse+ch
    print(word," <===> ",reverse)
reverse=""


