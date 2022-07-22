# Write a program to input a name and display initials with dots
name=input("Enter Your full name==> ")
words=name.split()
op=' '
for word in words:
    word=word.upper()
    op=op+word[0]+"."
print("output word is=",op)