# ###  Find sum of individual sublist of a nested list

# li=eval(input("Enter few numbers in a nested list"))
# print("Total number of sublists=",len(li))
# for i in range(len(li)):
#     print("Sub list #",i+1,"#")
#     print("sum ==>",sum(li[i]))
#     print("Maximum value ==>",max(li[i]))
#     print("Minimum value ==>",min(li[i]))
#     print(" ")
# ## enter ssublist na and enter a value.append the value in that sublist.
# sublist=int(input("Enter sublist no ==> "))
# value=int(input("Enter a value ==> "))
# for i in range(len(li)):
#     if i+1==sublist:
#         li[i].append(value)
# print("The update list is ==>",li)


###  Find sum of individual sublist of a nested list

li=eval(input("Enter few numbers in a nested list ==> "))
print("Total number of sublists=",len(li))
for i in range(len(li)):
    print("Sub list #",i+1,"#")
    print("sum ==>",sum(li[i]))
    print("Maximum value ==>",max(li[i]))
    print("Minimum value ==>",min(li[i]))
    print(" ")
## enter ssublist na and enter a value.append the value in that sublist.
sublist=int(input("Enter sublist no ==> "))
value=int(input("Enter a value ==> "))
if sublist>len(li):
    li.append([]) ## append one blank sublist at the end 
    li[len(li)-1].append(value) ## append the value in the sublist
for i in range(len(li)):
    if i+1==sublist:
        li[i].append(value)
print("The update list is ==>",li)
