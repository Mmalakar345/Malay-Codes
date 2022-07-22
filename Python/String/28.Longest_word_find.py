# Display the longest word in the list
words=eval(input("Enter few words in a list"))
max=0
# Find the length of longest word
for word in words:
    if len(word)>max:
        max=len(word)
# Find the lonfest word
print("Longest words are=>")
for word in words:
    if len(word)==max:
        print(word)