          # Leap year cheking
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