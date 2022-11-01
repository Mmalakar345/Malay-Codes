# Input a number and check wheather the number is a prime no. or not

import math
num=int (input(" Enter a positive number==> "))
if num<=0:
    print ("invalie input")
else:
    count=2
    if num==1:
        print("It i's neither prime Nor a composite number")
    else:
        while count<=math.sqrt(num):
            print(count)
            if num%count==0:
                print("Not a prime number")
                break
            count+=1
        else: # else loop
            print("It is a prime number")




# num = int(input("Enter a number: "))
# flag = False
# if num > 1:
#     for i in range(2, num):
#         if (num % i) == 0:
#             flag = True
#             break
# if flag:
#     print(num, "is not a prime number")
# else:
#     print(num, "is a prime number")