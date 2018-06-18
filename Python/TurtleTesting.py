from turtle import *
import turtle


def setP(pen,x,y):
    pen.setposition(x,y)
    pen.color('white')
    pen.speed('fastest')
p1 = turtle.Turtle()
p2 = turtle.Turtle()
p3 = turtle.Turtle()

setP(p1,-5,0)
setP(p2,5,0)
setP(p3,0,5)
pens = [p1, p2, p3]


colors = ['red','yellow', 'green','cyan', 'white', 'blue', 'purple']


bgcolor('black');
j = 0;
while True:
    for x in pens:
        x.forward(10)
        x.left(15)
        x.color(colors[j])
        if j % 3 == 0 :
            x.right(50)
            x.right(30)
    j = j + 1
    if j >= 6 :
        j = 0


end_fill()
done()
