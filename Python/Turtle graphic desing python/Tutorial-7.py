import turtle 
import colorsys 

t=turtle.Turtle() 
s=turtle.Screen() 

s.bgcolor('black') 
t.width(1)
t.speed(20) 

color=("purple","white","green","red")
 
for i in range(400): 
    t.pencolor(color[i%4]) 
    t.forward(i*5) 
    t.left(121)
