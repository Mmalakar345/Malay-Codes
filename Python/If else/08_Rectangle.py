               # Rectangle
# Input length and breadth of a rectangle. Input choice from user.If user's 
# choice is 1 then find and display area of the rectangle.
# if user's choice is 2 then find and display perimeter of the rectangle

length=float(input("Enter length of a rectangle in cm= "))
breadth=float(input("Enter breadth of a rectangle in cm= ")) 
print ("Enter 1 for displaying area Enter 2 for displaying perimeter") 
choice=int(input ("Enter your choice(1/2)")) 
if choice==1: 
     area=length * breadth 
     print ("Area of the rectangle= ", area, " sq cm") 
elif choice==2: 
     peri=2*(length+breadth) 
     print("Perimeter-",peri," cm") 
else: print("Invalid Choice")