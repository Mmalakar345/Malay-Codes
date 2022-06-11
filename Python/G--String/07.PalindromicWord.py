# Input a sentence and display only the palindromlic words.
line=input("Enter a line")
words=line.split() ## here words is a list of strings
print("Palindromic words are=")
for word in words:
    rev='' # Creats an empty string
    # Generates reverse of the string
    for ch in word:
        rev=ch+rev
    if rev.upper()==word.upper():
        print(word)
        