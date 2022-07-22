# Linear search Enter n numbers in a list. Then search number in the list using Linear swarch method
def linearSearch(list,index,num):
    if index==len(list):
        return -1
    elif list[index]==num: #if found
        return index+1
    else:
        return linearSearch(list,index+1,num)
# main
size=int(input("How many number do you want to add in a list ==> "))
list=[]
for index in range(0,size):
    list.append(int(input("Enter a number ==> ")))
# Method call
num=int(input("Enter the which one you want to search ==> "))
pos=linearSearch(list,0,num)
if pos==-1:
    print("Number is not found in the list")
else:
    print("Number is found ",pos," positiom")