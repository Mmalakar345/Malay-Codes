


import turtle

def drawGoogle():
    # make window
    window = turtle.Screen()
    window.bgcolor("White")

    #get the instance of turtle
    cursor=turtle.Turtle()
    #select color
    cursor.color('#4285F4','#4285F4') # RGB
    #change the pen size
    cursor.pensize(5)
    #chaqnge the drawing speed
    cursor.speed(8)

    cursor.forward(120)
    cursor.right(90)
    cursor.circle(-150,50)
    
    # First circle for red color
    cursor.color('#0F9D58')
    cursor.circle(-150,100)
    cursor.color('#F4B400')
    cursor.circle(-150,60)
    cursor.color('#DB4437','#DB4437')

    cursor.begin_fill()
    cursor.circle(-150,100)
    cursor.right(90)
    cursor.forward(50)
    cursor.right(90)
    cursor.circle(100,100)
    cursor.right(90)
    cursor.forward(50)
    cursor.end_fill()
    cursor.begin_fill()

    # Second circle for yellow coloor
    cursor.color("#F4B400","#F4B400")
    cursor.right(180)
    cursor.forward(50)
    cursor.right(90)
    
    cursor.circle(100,60)
    cursor.right(90)
    cursor.forward(50)
    cursor.right(90)
    cursor.circle(-150,60)
    cursor.end_fill()


    # Third circle of green color
    cursor.right(90)
    cursor.forward(50)
    cursor.right(90)
    cursor.circle(100,60)
    cursor.color('#0F9D58','#0F9D58')
    cursor.begin_fill()
    cursor.circle(100,100)
    cursor.right(90)
    cursor.forward(50)
    cursor.right(90)
    cursor.circle(-150,100)
    cursor.right(90)
    cursor.forward(50)
    cursor.end_fill()


    # Draw last circle
    cursor.right(90)
    cursor.circle(100,100)
    cursor.color('#4285F4','#4285F4')
    cursor.begin_fill()
    cursor.circle(100,25)
    cursor.left(115)
    cursor.forward(65)
    cursor.right(90)
    cursor.forward(42)
    cursor.right(90)
    cursor.forward(124)
    cursor.right(90)
    cursor.circle(-150,50)
    cursor.right(90)
    cursor.forward(50)

    cursor.end_fill()
    cursor.penup()
    #cursor.exitonclick()

drawGoogle()
# t.hideturtle()
turtle.done()   ## Last obdi program ta view hobar jonno