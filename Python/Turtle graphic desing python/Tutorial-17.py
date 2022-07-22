from tkinter.font import BOLD
import turtle
screen=turtle.Screen()

t = turtle.Turtle()
screen.setup(1020,720)
turtle.Screen().bgcolor("white")
t.speed(1)

# Part one
t.color('green')
t.penup()
t.goto(-140,200)
t.pendown()
style = ('courier',30,'italic')
t.write('Write',font=style,align='left')
t.forward(150)
t.write('Anything',font=style,align='left')
t.forward(180)

# Part two
t.color('red')
t.penup()
t.goto(-120,100)
t.pendown()
style = ('courier',45,'italic')
t.write('I',font=style,align='left')
t.forward(60)
t.write('Am',font=style,align='left')
t.forward(100)
t.write('So',font=style,align='left')
t.forward(60)

# Part three
t.color('blue')
t.penup()
t.goto(-150,1)
t.pendown()
style = ('courier',70,'italic',BOLD)
t.write('SORRY',font=style,align='left')
# t.forward(60)

# Part four
t.color('black')
t.penup()
t.goto(-180,-40)
t.pendown()
style = ('courier',45,'italic')
t.write('Person',font=style,align='left')
t.forward(240)
t.write('Name',font=style,align='left')
t.forward(150)

# Part fore

t.pensize(2)
t.color('purple')
t.penup()
t.goto(-250,-100)
t.pendown()
t.forward(550)
t.left(90)
t.forward(300)
t.left(90)
t.forward(550)
t.left(90)
t.forward(300)




t.hideturtle()
turtle.done()