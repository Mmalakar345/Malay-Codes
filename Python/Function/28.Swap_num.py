#Write a program to take input of a list from user and swap the adjacent elements
#(first & second, Third & Forth and so on)
#Example:
#Enter a list: [2,3,4,5,6,7,8]
#Output: [3,2,5,4,7,6,8]



# list=eval(input("Enter only 4,8,12,16...so on digit"))
list=[3,4,5,6,7,8,9,10,11,12,13,14,12]
print("Before swaping the list")
print(list)
def swap():
    first=0
    last=len(list)-1
    val1=0
    val2=1
    while first<last:
        list[val1],list[val2]=list[val2],list[val1]
        first+=2
        val1+=2
        val2+=2
swap()
print()
print("After swaping the list")
print(list)



