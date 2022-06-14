list=eval(input("Enter 1 to 20 any digit in the list"))
n=[]
for i in range(1,21):
    if i not in list:
        n.append(i)
list.extend(n)
list.sort()
print(list)