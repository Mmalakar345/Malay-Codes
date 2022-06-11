# Write a program to input a word and devide vowel and consonent.
# With a order to vowel then consonent.

word=input("Enter a Word=")
vowel=""
conso=""
for char in word:
    if char in "AEIOUaeiou":
        vowel+=char
    else:
        conso+=char
Newword=(vowel+conso)
print("New Word is =",Newword)