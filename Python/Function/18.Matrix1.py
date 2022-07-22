matrix=[[1,2,3,4],[4,5,6,6],[7,8,9,10],[2,4,6,29]]
rows=len(matrix)
cols=len(matrix[0])

def getmatrix():
    print("The Matrix is=")
    for i in range(0,rows):
        for j in range(0,cols):
            print(matrix[i][j],end=" ")
        print()
#Identify and display boundary elements
def getmatrixboundary():   
    print("The Boundary Elements  are=")  
    for i in range(0,rows):
        for j in range(0,cols):
           if i==0 or j==0 or i==rows-1 or j==cols-1: # conditions for boundary elements
               print(matrix[i][j],end=" ")
           else:
               print(" ",end=" ")
        print("  ")     
# Display sum of boundary elements and also display the heighest and lowest boundary elements
# Identify and Display only the primary and secondary diagonal elements
def getmatrixdiagonal():
    print("The Diagonal Elements  are=")  
    for i in range(0,rows):
        for j in range(0,cols):
           if i==j or i+j==cols-1: # conditions for diagonal elements
               print(matrix[i][j],end=" ")
           else:
               print(" ",end=" ")
        print()
getmatrix()
getmatrixboundary()
getmatrixdiagonal()