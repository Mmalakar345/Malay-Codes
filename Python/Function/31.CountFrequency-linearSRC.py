## Count word frequency using linear search methood. 

def getCount(line,ch):
    count = 0 
    for char in line:
        if char.lower()==ch.lower():
            count+=1
    return count
# main block
line = input("Enter a sentance ==> ")
ch = input("Enter a Character to search ==> ")
count=getCount(line,ch) # Method call
if count==0:
    print("The Character is not found")
else:
    print("The Character in found",count,"times")
