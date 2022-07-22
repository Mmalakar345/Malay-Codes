




#2.               # Rectangle
# Input length and breadth of a rectangle. Input choice from user.If user's 
# choice is 1 then find and display area of the rectangle.
#if user's choice is 2 then find and display perimeter of the rectangle

# length=float(input("Enter length of a rectangle in cm"))
# breadth=float(input("Enter breadth of a rectangle in cm")) 
# print ("Enter 1 for displaying area Enter 2 for displaying perimeter") 
# choice=int(input ("Enter your choice(1/2)")) 
# if choice==1: 
#      area=length * breadth 
#      print ("Area of the rectangle=", area, " sq cm") 
# elif choice==2: 
#      peri=2*(length+breadth) 
#      print("Perimeter-",peri," cm") 
# else: print("Invalid Choice")

#3.     # Square area,perimeter calculate

# Input side of a square. Input choice from user.If user's 
# choice is 1 then find and display area of the square.
#if user's choice is 2 then find and display perimeter of the square

# side=float(input("Enter side of a Square in cm")) 
# print ("Enter 1 for displaying area Enter 2 for displaying perimeter") 
# choice=int(input ("Enter your choice(1/2)")) 
# if choice==1: 
#      area=side**2
#      print ("Area of the Square=", area, " sq cm") 
# elif choice==2: 
#      peri=4*side
#      print("Perimeter of the Square=",peri," cm") 
# else: 
#      print("Invalid Choice")


#4.         # circle area,diametar,circumfertnce calculate

# Input radias of a circle. Input choice from user.If user's 
# choice is 1 then find and display area of the circle.
#if user's choice is 2 then find and display circumfertnce of the circle.
#if user's choice is 3 then find and display diameter of the circle.

radias=float(input("Enter radias of a circle in cm")) 
print ('Enter 1 for displaying area Enter 2 for displaying circumfertnce 3 for displaying diameter') 
choice=int(input ("Enter your choice(1/2/3)")) 
if choice==1: 
     area=22/7*radias**2
     print ("Area of the circle=", area, " sq cm") 
elif choice==2: 
     circum=2*22/7*radias
     print("circumfertnce of the circle=",circum," cm")
elif choice==3:
     dia=2*radias
     print("Diameter of the circle=",dia," cm")
else: 
     print("Invalid Choice") 

 