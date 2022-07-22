#nested lop
#How many rows to print
# 1
# 1 2 
# 1 2 3
# 1 2 3 4
# 1 2 3 4 5
# def displaypattern(row):
#     for outer in range(1,row+1):
#         for inner in range(1,outer+1):
#             print(inner,end=" ")
#         print()
# row=int(input("How many row to print"))
# displaypattern(row)


#nested lop
#How many rows to print
# 1 1 1 1 1
# 2 2 2 2 2 
# 3 3 3 3 3 
# 4 4 4 4 4 
# 5 5 5 5 5 
def getpatterrn(row):
    for outer in range(1,row+1):
        for inner in range(1,row+1):
            print(outer,end=" ")
        print()
row=int(input("How many row to print"))
getpatterrn(row)