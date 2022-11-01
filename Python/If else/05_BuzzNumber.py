         # Buzz number cheking
# input a number and check wheather the number is a Buzz no or ont
# A number is a Buzz no if the number is divisible by 7 or ended with 7

num=int(float(input("Enter a number")))      
#num=float(input("Enter a number")) emon o likha jete pare
if num%10==7 or num%7==0:
     print("The number is a Buzz number")
else:
     print("The number is not a Buzz number")
