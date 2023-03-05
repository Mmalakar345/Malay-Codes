num=[1,2,3,6,54,5,4,5,1]
for i in range(9):
    for j in range(8):
        n, p =num[j+1], num[j]
        if p> n:
            num[j], num[j+1]=n,p
        # print(j)