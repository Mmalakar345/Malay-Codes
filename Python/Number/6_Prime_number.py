           # AUTO COUNTING
# Program to check if a number is prime or not

# for count in range(1,100):
#     num=count
# # To take input from the user
# #num = int(input("Enter a number: "))
#     flag = False                   # define a flag variable
#     if num > 1:                    # prime numbers are greater than 1
#         for i in range(2, num):     # check for factors
#             if (num % i) == 0:
#                 flag = True        # if factor is found, set flag to True
#                 break              # break out of loop
#     if flag:                      # check if flag is True
#         print(num, "Other number")
#     else:
#         print(num, "is a prime number")




           #### # USER DEFINED AND INPUT NUMBER CODE
##### Program to check if a number is prime or not

# num = 55

# To take input from the user
num = int(input("Enter a number: "))

# define a flag variable
flag = False
# prime numbers are greater than 1
if num > 1:
    # check for factors
    for i in range(2, num):
        if (num % i) == 0:
            # if factor is found, set flag to True
            flag = True
            # break out of loop
            break
# check if flag is True
if flag:
    print(num, "is not a prime number")
else:
    print(num, "is a prime number")

