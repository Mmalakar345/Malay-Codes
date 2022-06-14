import turtle
screen=turtle.Screen()
t = turtle.Turtle()
screen.setup(1020,720)
turtle.Screen().bgcolor("black")
t.speed(0)
c = ["yellow","red","pink","light green","blue","purple","cyan","green"]
for i in range(100):
    t.pencolor(c[i%6])
    t.circle(190-i/2,90)
    t.left(90)
    t.circle(190-i/3,90)
    t.left(60)
turtle.done()