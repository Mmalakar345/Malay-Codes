## 1.Add two lists of same size Position Wise
size=int(input("How many Elements==> "))
l=eval(input("Enter "+str(size)+' '+"integers of 1st list ==> "))
m=eval(input("Enter "+str(size)+' '+"integers of 2nd list ==> "))
n=[]  ## Creates an empty list
## Add
for i in range(0,size):
    n.append(l[i]+m[i])
## Display
print("The new list")
print(n)





# ## 2.Add three lists of same size Position Wise
size=int(input("How many Elements==> "))
list1=eval(input("Enter "+str(size)+' '+"integers of 1st list ==> "))
list2=eval(input("Enter "+str(size)+' '+"integers of 2nd list ==> "))
list3=eval(input("Enter "+str(size)+' '+"integers of 3rd list ==> "))
n=[]  ## Creates an empty list
## Add  
for i in range(0,size):
    n.append(list1[i] + list2[i] + list3[i])
## Display
print("The new list ==> ")
print(n)