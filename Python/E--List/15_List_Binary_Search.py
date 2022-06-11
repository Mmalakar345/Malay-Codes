List=eval(input("Enter few number in ascending order"))
num=int(input("Enter s number to search"))
low=0
high=len(List)-1
mid=0
while low<=high:
    mid=(low+high)//2
    if num==List[mid]:
        print("Found")
        break
    if num<List[mid]:
        high=mid-1 
    else:
        low=mid+1
else:
    print("Not Found") 