
# Input a sentence and then find a word containing the 1st and last letters of each word

line=input("Enter a sentence= ")
# line="Enter an sentence"
new=line.split()
print("Output==>")
for word in new:
    parts=word[0]+word[len(word)-1]
    print(parts,end=" ")
        