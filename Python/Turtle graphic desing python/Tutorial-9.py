from turtle import *

speed(100)
pencolor('#4584b6')
fillcolor('#4584b6')
begin_fill()
penup()
goto(-70,20)
left(180)
pendown()
forward(10)

def curve():
    for i in range(50):
        forward(0.5)
        right(1)
    for i in range(80):
        forward(2)
        right(1)
    for i in range(50):
        forward(0.5)
        right(1)
curve()
def line():
    forward(130)
    left(90)
    forward(10)
    left(90)
    forward(90)
    right(90)
    forward(30)

line()
curve()

forward(80)
for i in range(90):
    forward(0.5)
    right(1)
forward(120)
for i in range(90):
    forward(0.5)
    left(1)

forward(72.7)
right(90)
right(1)
forward(19)
end_fill()

penup()
goto(160,186)
right(180)
pendown()

pencolor('#ffde57')
fillcolor('#ffde57')
begin_fill()
forward(10)

curve()
line()
curve()

forward(80)
for i in range(90):
    forward(0.5)
    right(1)
forward(120)
for i in range(90):
    forward(0.5)
    left(1)

forward(72.7)
right(90)
right(1)
forward(19)
end_fill()
penup()
goto(-20,210)
pendown()
pencolor('white')
fillcolor('white')
begin_fill()
circle(10)
end_fill()
pencolor('purple')
penup()
goto(110,-30)
pendown()
pencolor('white')
fillcolor('white')
begin_fill()
circle(10)
end_fill()

hideturtle()
done()