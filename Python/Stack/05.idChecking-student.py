# [(11,"Malay","7524896358"),(5,"Bibhakar","6258974596"),(11,"Arup","6275894259")]
# namestack=[]
# phonenostack=[]
# push(record)
# Enter n no. of students record(id,name,phoneno in a tuple formet) in a list. Two stacks are mentained. push the names in one stack and phoneno in another stack for the students whose id values are less than 10. pop the stack contant and then display the values.
namestack=[]
phonenostack=[]
def Push(record):
        namestack.append(record[1])
        phonenostack.append(record[2])
def Pop():
    if namestack!=[]:
        print(namestack.pop()," ",phonenostack.pop())
        return 0
    else:
        return None
# # Without user input
studentlist=[(5,"Malay","7524896358"),(7,"Bibhakar","6258974596"),(11,"Arup","6275894259"),(12,"Chinmoy","6275894259")]
# # With user input
# studentlist=[]
# n=int(input("How Manny students details you want to entered= "))
# for i in range(n):
#     record=eval(input("Enter id, name, phno in a tuple= "))
#     studentlist.append(record)
for record in studentlist:
    if record[0] < 10:
        Push(record)
while True:
    if Pop()==None:
        break

