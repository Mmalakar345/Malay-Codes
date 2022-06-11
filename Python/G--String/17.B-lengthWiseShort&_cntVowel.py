# Write a program to accept a sentance and perform the following task.
# (a) Arrange the words contained in the sentance according to the size of the words in ascending order.
#  if two words are the same length then the first occourring comes first.
# (b) Count mumber of words starting with vowel.
# Example:
# Input : A STITCH IN TIME SAVES NINE
# OUTPUT: 
# AFTER ARRANGING: A IN TIME NINE SAVES STITCH
# NO OF WORDS : 02
line=input("Enter a sentance") # "line" is a string
# split() returns a list of words from a sentence.
wordslist=line.split() # 'wordlist' is a list
op="" 
# Bubble sort
for i in range(1,len(wordslist)):
    for j in range(0,len(wordslist)-i):
        if (len(wordslist[j])>len(wordslist[j+1])): # Swapping code
            temp=wordslist[j]
            wordslist[j]=wordslist[j+1]
            wordslist[j+1]=temp
count=0
vowelset=('a','e','i','o','u','A','E','I','O','U') # vowelset is a tuple here
for word in wordslist:
    if word.startswith(vowelset):
        count+=1
    op+=word+" "
print("Output")
print(op)
print("No of words starting with vowel= ",count)
 