# Enter 16 numbers in a 4 x 4 matrix. Then do the following-
# 1. find sum of all the elements
# 2. find row wwise sum

li=eval(input("Enter 16 numbers in a 4 x 4 matrix"))
rowsum=0
allsum=00
# Display in Matrixx Formet
for row in range(len(li)):
    for col in range(len(li)):
        print(li[row][col],end=" ")
    print()
    #sum
for row in range(len(li)):
    rowsum=sum(li[row])
    allsum=allsum+rowsum
    print("Row no",row+1)
    print("Sum of all the row elements is=",rowsum)
print("Sum of 16 elements of the matrix is=",allsum)
