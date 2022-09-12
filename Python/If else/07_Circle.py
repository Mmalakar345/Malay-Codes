         # circle area,diametar,circumfertnce calculate

# Input radias of a circle. Input choice from user.If user's 
# choice is 1 then find and display area of the circle.
#if user's choice is 2 then find and display circumfertnce of the circle.
#if user's choice is 3 then find and display diameter of the circle.

radias=float(input("Enter radias of a circle in cm= ")) 
print ('Enter 1 for displaying area Enter 2 for displaying circumfertnce 3 for displaying diameter') 
choice=int(input ("Enter your choice(1/2/3)")) 
if choice==1: 
     area=22/7*radias**2
     print ("Area of the circle= ", area, " sq cm") 
elif choice==2: 
     circum=2*22/7*radias
     print("circumfertnce of the circle= ",circum," cm")
elif choice==3:
     dia=2*radias
     print("Diameter of the circle= ",dia," cm")
else: 
     print("Invalid Choice") 

 