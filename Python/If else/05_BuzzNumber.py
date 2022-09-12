         # Buzz number cheking
# input a number and check wheather the number is a Buzz no or ont
# A number is a Buzz no if the number is divisible by 7 or ended with 7

num=int(float(input("Enter a number")))      
#num=float(input("Enter a number")) emon olikha jete pare
if num%10==5 or num%5==0:
     print("The number is a Buzz number")
else:
     print("The number is not a Buzz number")
