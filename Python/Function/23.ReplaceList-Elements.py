# Replace each element of a list by adding a spific number using User-defined Method
# User-defined function to update a list
def replaceAList(list,num):
    index=0
    while index<len(list):
        list[index]=list[index]+num
        index+=1
    # Main block
n=int(input("Enter the number of elements want to add on the list ==> "))
list=[]  # Creats an empty list
for count in range(0,n):
    num=int(input("Enter a number to add on the list ==> "))
    list.append(num)
print("The list is=",list)
# Outside the for loop
num=int(input("Enter a number to Update the list ==> "))
replaceAList(list,num) #Method call
print("The replace list is=",list)


