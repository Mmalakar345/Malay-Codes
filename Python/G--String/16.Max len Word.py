# Input a sentence and find maximum length of word and print maximum words

sent=input("Enter a sentence")
listword=sent.split()
maximum=0
# Find maximum of length
for word in listword:
    maximum=max(maximum,len(word))
print("Word with maximum length are=",maximum)
# Find max words
print("Max len words is =")
for word in listword:
    if len(word)==maximum:
        print(word)