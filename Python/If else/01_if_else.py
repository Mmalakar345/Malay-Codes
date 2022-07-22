1.          # Number chaking 

a=int(input("enter the value of a: "))
b=int(input("enter the value of b: "))

if a>b:
     print("a is grater than b")

else :
     print("a is less than b")


2.        # Even odd number chaking

num=float(input("Enter a positive value"))
if num%2==0:
     print("It is an even number")
else:
     print("It is an odd number")

3.         # Buzz number cheking
# input a number and check wheather the number is a Buzz no or ont
# A number is a Buzz no if the number is divisible by 7 or ended with 7

num=int(float(input("Enter a number")))      #num=float(input("Enter a number")) emon olikha jete pare
if num%10==5 or num%5==0:
     print("The number is a Buzz number")
else:
     print("The number is not a Buzz number")

4.          # Leap year cheking
# Input a year and check whether the year is a leap year or not.
# A cemtury year is a leap if it is divisible by 400.
# A non century year is a leap year if it is divisible by 4.

year=int(input("enter a year")) 
if year%100==0:    # check for century year 
     if year%40==0:
          print(year , "is a leap year")
     else: 
          print (year ,"is not a leap year") 
else:          #check for non entury year 
     if year%4==0: 
          print(year," is a leap year") 
     else: 
          print (year ," is not a leap year")
print("End of the program")

