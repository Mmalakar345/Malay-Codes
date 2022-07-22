
import array as A
obj=A.array("i",[2,5,8,9,6,-1,-7,7])
for val in obj:
    print(val,end=" ")
print()
for index in range(0,obj.itemsize):
    print(obj[index],end=" ")

# Addind Item
print()
obj.append(20)
print("After add 20= ",obj)

# Delete items
print("Delete item=",obj.pop())
print("Delete item index 2=",obj.pop(2))
print("remove item=",obj.remove(-1))

print("Frequency of a item=",obj.count(-1))

# List Adding
List=A.array("i",[2])
L=[1,7,8,9,6,4]
List.fromlist(L)
print("After add the list=",List)
