#Write a Python program to remove duplicate words from a given string and display the resultant string
#in ascending order.
#Original String: Next Time There Won't Be A Next Time
#Output: A Be There Won't

def remove(string):
    l =string.split(" ")
    list=[]
    for x in range(0,len(l)):
        if l.count(l[x])==1:   
            list.append(l[x])
            list.sort()
    return ' '.join(list)

string="Next Time There Won't Be A Next Time"
# string=str(input("enter duplicate valuae =>"))
print(remove(string))