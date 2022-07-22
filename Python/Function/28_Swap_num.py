#Write a Python program to remove duplicate words from a given string and display the resultant string in ascending order.
#Original String: Next Time There Won't Be A Next Time
#Output: A Be There Won't

#Write a program to take input of a list from user and swap the adjacent elements
#(first & second, Third & Forth and so on)
#Example:
#Enter a list: [2,3,4,5,6,7,8]
#Output: [3,2,5,4,7,6,8]

def swap():
    global a
    global b
    global c
    global d
    num1=a
    a=b
    b=num1 
    num2=c
    c=d
    d=num2
    print(list)
# list=eval(input("Enter only 4,8,12,16...so on digit"))
list=[3,4,5,6,7,8,9,10,11,12,13,14]
a=list[0]
b=list[1]
c=list[2]
d=list[3]
for i in range(0,len(list),4):
    a=list[i+0]
    b=list[i+1]
    c=list[i+2]
    d=list[i+3]
    swap()
print(list)


# list=[3,4,5,6,7,8,9,10,11,12,13,14]
# for i in range(0,len(list),4):
#     print(i)



