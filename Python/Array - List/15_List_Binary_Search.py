# Write a program to binary search to a number in a list .
# Find the the number found or not

List=eval(input("Enter few number in ascending order ==> "))
num=int(input("Enter a number to search ==> "))
low=0
high=len(List)-1
mid=0  
while low<=high:
    mid=(low+high)//2
    if num==List[mid]:
        print("** Found **")
        break
    if num<List[mid]: # num is less than mid elements
        high=mid-1 
    else: 
        low=mid+1    # num is more than mid elements
else:
    print("** Not Found **") 