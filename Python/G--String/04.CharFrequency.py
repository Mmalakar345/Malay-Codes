# Count frequency--linear search
def getCount(line,ch):
    count=0
    for char in line:
        if char.lower()==ch.lower():
            count+=1
    return count
# Main
line=input("Enter a sentance=")
ch=input("Enter a character to search=")
count=getCount(line,ch) # Method call
if count==0:
    print("The character is not found")
else:
    print("The character is found",count," times")
    
    
    