#Write a program to take input of a list from user and swap the adjacent elements
#(first & second, Third & Forth and so on)
#Example:
#Enter a list: [2,3,4,5,6,7,8]
#Output: [3,2,5,4,7,6,8]
# write a program to take input of a list from user and swap the adjacent element

def swap(list):
    for i in range(0,val,2):
        list[i],list[i+1]=list[i+1],list[i]
    return list

list=eval(input("Create a list =>"))
val=len(list)-1
print(swap(list))