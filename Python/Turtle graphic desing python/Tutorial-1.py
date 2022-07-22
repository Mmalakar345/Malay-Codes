import turtle 
import colorsys 

t=turtle.Turtle() 
s=turtle.Screen() 

s.bgcolor('black') 
t.speed(0) 

n=50 
h=0 
for i in range(360): 
    c=colorsys.hsv_to_rgb(h,1,0.8 )
    h+=1/n 
    t.color (c) 
    t.forward(i*2) 
    t.left(145)




# Arrow

# import turtle
# turtle.Screen().bgcolor("black")
# turtle.pensize(2)
# turtle.pencolor('yellow')
# turtle.forward(300)
# turtle.left(150)
# turtle.forward(80)
# turtle.backward(80)
# turtle.right(285)
# turtle.forward(80)
# turtle.done()

