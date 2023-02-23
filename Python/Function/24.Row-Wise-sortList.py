# Nested List....Row wise list sort
mat=[] # Creates an empty list
row=0
col=0
def getInput():
    global row
    global col
    row=int(input("How many Rows?==> "))
    col=int(input("How many Columns?==> "))
    
    for i in range(0,row):
        mat.append([]) # creates an empty row
        for j in range(0,col):
            mat[i].append(int(input("Enter a number ==> ")))
             
def display():
    print("Orginal List is=")
    # Display in Matrix Formet
    for i in range(0,row):
        print(mat[i])

def doSort():
    # Rowwise sort
    for i in range(0,row):
        mat[i].sort()
    # Display the sorted list
    print("The Sorted list is=")
    for i in range(0,row):
        print(mat[i])
getInput()
display()
doSort()
