from tkinter import N
import turtle as t
import colorsys
t.width(3)
t.tracer(10)
t.bgcolor("black")
h=0
n=50
for i in range(200):
    c = colorsys.hsv_to_rgb(h,1,0.8)
    h+=1/n 
    t.pencolor(c)
    t.circle(i,90)
    t.forward(i)
    t.right(270)
    t.circle(i,270)
    t.forward(i)
    t.right(180)
t.done()