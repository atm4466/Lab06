"""
CSAPX Lab 1: L-system drawing generator

A program that combines a string rewriting L-system and an interpreter
to generate 2D drawings using the 2D turtle graphics library.

author: Andrew Moor
"""
import turtle
turtle.speed(0)
# green tones palette
# PALETTE = ['dark green', 'forest green', 'green', 'olive drab', 'dark khaki', 'olive', 'dark olive green',
#            'lawn green', 'chartreuse', 'green yellow', 'spring green', 'medium spring green',
#            'light green', 'pale green', 'sienna', 'peru', 'chocolate', 'sandy brown',
#            'dark khaki', 'olive', 'dark olive green', 'olive drab', 'yellow green',
#            'dark green', 'gold', 'goldenrod', 'orange', 'dark orange']

# more colorful palette

PALETTE = [
    'tomato', 'dark blue', 'violet', 'thistle', 'burlywood', 'indigo', 'violet red', 'orange', 'crimson', 'peru',
    'teal', 'coral', 'olive drab', 'maroon', 'orchid', 'sienna', 'turquoise', 'indian red',
    'tan', 'chocolate', 'green yellow'
]


turtle.color(PALETTE[0])

def main() -> None:
    axiomw = input("Enter axiom: ")
    axiom = []
    for char in axiomw:
        axiom.append(char)
    prod_rules_n = int(input("enter number of production rules: "))
    rules = []
    for i in range(prod_rules_n):
        rules.append(input("input new rule: "))
    rot = int(input("input degree of rotation: "))
    dis = int(input("input distance variable: "))
    intrad = int(input("input starting degree: "))
    times_applied = int(input("how many times should the rules be applied: "))
    apply_lsystem(axiom, rules,rot,dis,intrad,times_applied, 4, 2)
    
    turtle.done()

def apply_lsystem(axiom, rules, rot, dist, intrad, times_applied, n, width):
    num_rules = len(rules)
    res = axiom
    dis = dist
    for i in range(times_applied):
        new_res = []
        for char in res:
            replaced = False
            for rule in rules:
                # Rule format: "A=AB" (character, equals, replacement)
                if char == rule[0]:
                    # Add the replacement string (everything after the equals sign)
                    for replacement_char in rule[2:]:
                        new_res.append(replacement_char)
                    replaced = True
                    break
            if not replaced:
                new_res.append(char)
        res = new_res

    
    print(res)
    draw_system(res, rot, dis, intrad, n, width)
    
def draw_system(rest,rott,dist,intrads,nn,w):
    rot = rott
    dis = dist
    intrad = intrads
    n = nn
    width = w
    res = rest
    state_stack = []
    turtle.setheading(intrad)
    cindex = 0
    
    

    for item in res:
        if item == 'F' or item == 'G':
            turtle.pendown()
            turtle.forward(dis)
        if item == 'f':
            turtle.penup()
            turtle.forward(dis)
        if item == '+':
            turtle.left(rot)
        if item == '-':
            turtle.right(rot)
        if item == '[':
            
            state_stack.append((turtle.xcor(), turtle.ycor(), turtle.heading()))

        if item == ']':
            

            if state_stack:
                x, y, h = state_stack.pop()
                turtle.penup()
                turtle.goto(x, y)
                turtle.setheading(h)
                
        if item == '@':
            dis = dis*n
        if item == '>':
            cindex = (cindex + n)%len(PALETTE)
            turtle.color(PALETTE[cindex])
        if item == '<':
            cindex = (cindex - n)%len(PALETTE)
            turtle.color(PALETTE[cindex])  
        if item == '#':
            if width != None:
                turtle.pensize(width)
            else:
                turtle.pensize(1)

if __name__ == '__main__':
    main()
    