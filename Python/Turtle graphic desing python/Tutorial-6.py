import turtle 
import colorsys 

t=turtle.Turtle() 
s=turtle.Screen() 

s.bgcolor('black') 
t.width(1)
t.speed(20) 

color=("purple","white","green")
 
for i in range(300): 
    t.pencolor(color[i%3]) 
    t.forward(i*4) 
    t.left(121)
