# Perfect number auto cheking
# Only range limit required

for count in range(1,1000):
    num=count
    sum=0
    for i in range(1,num):
        if num%i==0:
             sum=sum+i
    if num==sum:
        print(num," is a perfect number")
    else:
        print(num," is not a perfect number")
        # print()















