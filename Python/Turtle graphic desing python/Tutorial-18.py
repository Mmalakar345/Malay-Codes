import turtle
screen=turtle.Screen()
t = turtle.Turtle()
screen.setup(1020,720)
turtle.Screen().bgcolor("black")
t.speed(0)
t.pencolor('blue')

def drawcircle(radis):
    for i in range(15):
       t.circle(radis) 
       radis=radis-4
       
def drawdesing():
    for i in range(10):
        drawcircle(150)
        t.right(36)

drawdesing()
turtle.done()