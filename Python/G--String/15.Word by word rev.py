# Input a sentence. Then reverse the word and from a new sentence
# Input: I love my country
# Output: I evol ym yrtnuoc

name=input("Enter a sentence")
listword=name.split()
op=""
for word in listword:
    rev=word[-1:-len(word)-1:-1]
    op=op+rev+" "
print("Output is=",op)