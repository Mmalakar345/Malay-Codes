# Binary search in a sorted list
# This method returns the index of the number if found otherwise returns -1
# This method follows binary search technique

List=[]
def isFoundByBinarySearch(num):
    low=0
    high=len(List)-1
    mid=0
    while low<=high:
        mid=(low+high)//2
        if List[mid]==num:
            return mid
        if num<List[mid]:
            high=mid-1 
        else:
            low=mid+1
    return -1

def search():
    num=int(input("Enter a number to search == > "))
    pos=isFoundByBinarySearch(num)   # Method Call
    if pos!=-1:
        print(num,"Number Found at",pos+1,"Positiion")
    else:
        print("Number Not Found")

def getinput():
    n=int(input("How many number do you want to add in the list? "))
    print("Enter few number in ascending order == > ")
    for x in range(0,n):
        List.append(int(input("Enter a number == > ")))
        
getinput() # Method call
search() # Method call
    
    
    
    
    
