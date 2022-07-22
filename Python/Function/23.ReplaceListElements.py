# Replace each element of a list by adding a spific number using User-defined Method
# User-defined function to update a list
def replaceAList(list,num):
    index=0
    while index<len(list):
        list[index]=list[index]+num
        index+=1
    # Main block
n=int(input("Enter number of elements of the list"))
list=[]  # Creats an empty list
for counrt in range(0,n):
    num=int(input("Enter a number to add the list"))
    list.append(num)
# Outside the for loop
num=int(input("Enter a number to Update the list"))
print("The list is=",list)
replaceAList(list,num) #Method call
print("The rreplace list is=",list)


