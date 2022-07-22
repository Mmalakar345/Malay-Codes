
import turtle
t = turtle.Turtle()
t.speed(2)
t.pensize(10)
t.penup()

turtle.Screen().bgcolor("black")
def getarrow():
    t.penup()
    t.goto(10,-70)
    t.color('#00adef')
    t.go(100)

getarrow()
# turtle.done()

