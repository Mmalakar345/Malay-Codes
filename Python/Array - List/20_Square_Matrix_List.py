## Dissply only the diagonal ellements of a M x M sized square matrix

mat=[]  #creates an empty list
N=0
N=int(input("Enter number of rows?"))
for i in range(0,N): ## for total number of sub lists
    mat.append([]) ## creats an empty rpw/sublist
    print("For Row# ",i)
    for j in range(0,N):  # For total number elements in each row
        mat[i].append(int(input("Enter a number")))
print("Orginal list is=")
# display in matrix formet
for i in range(0,N):
    for j in range(0,N):
        print(mat[i][j],end="  ")
    print()
print("Diagonal elements are=")
# display diagonal elements only
for i in range(0,N):
    for j in range(0,N):
        if i==j or i+j==(N-1):
            print(mat[i][j],end=" ")
        else:
            print(" ",end="  ")
    print()