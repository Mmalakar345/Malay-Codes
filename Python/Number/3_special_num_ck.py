#Input anumber more than 9 and check whether it is a special number or not 
# #A Special number is a number whose sum of odd digits equals to Sum of even digits 
# #Input: 2343
# #output: It is a Special number 
# #Input:1234 
# Output: It is not a Special number 
# Input: 5 
# output: Invalid Input 
# 2 3 4 3
# odd   even
# 3+3   4+2
# 6       6
# odd  = even
# special num
num=int(input("Enter a number more than 9=> ")) 
evensum=0
oddsum=0
if num<10:
    print("Invalide Input")
else:
    while num>0:       # 10 diye mode korle last digit tai mode hoy 2343= mode 3
    # for di in range(num,0,):
        digit=num%10  # digit extraction
        if digit%2==0:  # even number k 2 diye mode korle remainder 0 hoy
            evensum+=digit
        else:
            oddsum+=digit
        # print(num)
        num//=10   # floor divisioon kore last digit bad jai 221//= 22
    if evensum==oddsum:
        print("output: It is a special number")
    else:
        print("output: It is not a special number")
        
        



