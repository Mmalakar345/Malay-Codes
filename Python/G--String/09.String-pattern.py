#  Enter a word: GREAT
# Output 
# G
# GR
# GRE
# GREA
# GREAT
word=input("Enter a word")
length=len(word)
for i in range(0,length+1):
    print(word[0:i])