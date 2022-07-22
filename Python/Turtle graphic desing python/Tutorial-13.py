
import turtle

colors = ['yellow', 'green', 'red', 'white', 'cyan', 'blue']

t = turtle.Turtle()
screen = turtle.Screen()
screen.bgcolor('Black')
t.speed(30)

for i in range(100):
    t.color(colors[i%6])
    t.fd(i*6)
    t.left(200)
    t.width(2)
t.hideturtle()
turtle.done()