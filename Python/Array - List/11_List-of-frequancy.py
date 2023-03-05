# Find the Frequency of a number in the list of n numbers
# [3,2,5,6,7,3,2,5]
# Find the frequency 5
# Output: 5 has frequency 2

list=[]   # Create a empty list
n=int(input("How many numbers in the list? <==> "))
# Input to the list
for x in range(1,n+1):
    val=int(input("Enter a number ==> "))
    list.append(val)
# End of the loop
print("The list is",list)
search=int(input("Enter a number to search ==> "))
count=0
# Searching
for i in range(0,n):
    if list[i]==search:
        count=count+1
# cnt=list.count(search)    ## 17 theke 19 no line er short process
if count==0:
    print(search,"is not found in the list")
else:
    print(search,"has frequency",count,"in the list")







