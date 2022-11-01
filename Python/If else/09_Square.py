# Square area,perimeter calculate

# Input side of a square. Input choice from user.If user's 
# choice is 1 then find and display area of the square.
# if user's choice is 2 then find and display perimeter of the square

side=float(input("Enter side of a Square in cm= ")) 
print ("Enter 1 for displaying area Enter 2 for displaying perimeter") 
choice=int(input ("Enter your choice(1/2)")) 
if choice==1: 
     area=side**2
     print ("Area of the Square= ", area, " sq cm") 
elif choice==2: 
     peri=4*side
     print("Perimeter of the Square= ",peri," cm") 
else: 
     print("Invalid Choice")
