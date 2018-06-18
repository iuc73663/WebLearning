import turtle
import tkinter as tk
from pynput import keyboard

mainAngle = 0
colors = ["red","yellow", "green","cyan", "black", "blue", "purple"]
j = 0

def forward():
    t.forward(5)

def back():
    t.back(5)

def left():
    global mainAngle
    mainAngle -= 1
    t.left(mainAngle)

def right():
    global mainAngle
    mainAngle += 1
    t.right(mainAngle)

def leftKey(event):
    left()

def rightKey(event):
    right()

def upKey(event):
    forward()

def downKey(event):
    back()
def colorKey(event):
    changeColor()



root = tk.Tk()
canvas = tk.Canvas(master = root, width = 1000, height = 600)
canvas.pack()

t = turtle.RawTurtle(canvas)
t.pencolor("black") # Red

#t.penup()   # Regarding one of the comments
#t.pendown() # Regarding one of the comments
def changeColor():
    global j
    t.pencolor(colors[j])
    j += 1
    if j >=6 :
        j = 0


#tk.Button(master = root, text = "Forward", command = forward).pack(side = tk.LEFT)
#tk.Button(master = root, text = "Back", command = back).pack(side = tk.LEFT)
#tk.Button(master = root, text = "Left", command = left).pack(side = tk.LEFT)
#tk.Button(master = root, text = "Right", command = right).pack(side = tk.LEFT)
tk.Button(master = root, text = "Color", fg = 'black',command = changeColor).pack(side = tk.LEFT)



root.bind('<Left>', leftKey)
root.bind('<Right>', rightKey)
root.bind('<Up>', upKey)
root.bind('<Down>', downKey)
root.bind('<c>', colorKey)

root.mainloop()
