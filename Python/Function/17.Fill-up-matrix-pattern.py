# 1 2 4 7
# 3 5 8 12
# 6 9 13 18
# 10 14 19 25
# For N=4
mat=[]  #Creates an empty list
N=0
def fillup():
    global N
    val=1        # Value to be displayed
    rowstart=1   # start value 
    rowdiff=2    # diff which is added to row wise start value
    coldiff=0    # diff which is added to each value colum wise
    N=int(input("Enter the size?"))
    for row in range(0,N): # For total number of sub list
        mat.append([])     # Creates an empty row/sublist
        val=rowstart
        coldiff=row
        for col in range(0,N):  # For total number of elements of sub list
            mat[row].append(val)
            val=val+coldiff
            coldiff=coldiff+1   # end of inner loop
        rowstart=rowstart+rowdiff
        rowdiff=rowdiff+1
def display():
    print("Output")
    # Display In matrix Format
    for i in range(0,N):
        for j in range(0,N):
            print(mat[i][j],end=" ")
        print()
# Main
fillup()   # Method call
display()   # Method call





