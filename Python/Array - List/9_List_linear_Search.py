## Input a number and check whether the number is availavle In the list or using linear search
## And when the number is available in the list then display:  how many time the number is availavle on the list and find the number's index.


numlist=eval(input("Enter a list of 10 number"))
num=int(input("Enter a number to search in the list"))
if num in numlist:
    print(num,"is available in the list")
    li=numlist.count(num)
    print(num,"is found at",li,"times")
    for i in range(0,len(numlist)):
        if num==numlist[i]:
            print(num,"is found at",i,"index")
else:
    print(num,"is not available in the list")