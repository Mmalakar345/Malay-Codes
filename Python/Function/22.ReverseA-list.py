def reverseAList(list):
    first=0
    last=len(list)-1
    while first<last:
        list[first],list[last]=list[last],list[first]
        first+=1
        last-=1
        
# Main
n=int(input("Enter the number of elements want to add on the list ==> "))
list=[] # Creates an empty list
for count in range(0,n):
    num=int(input("Enter a number ==> "))
    list.append(num)
print("The orginal list is",list)
reverseAList(list) # Method call
print("The reverse list is",list)
# Flow of execution
# 1,10,11(12,13,14)Repeat for n times, 15,16,1,2,3(4,5,6,7,8,9)repeat for first<last,17