"""
CSAP/X Week 1: Turtle and Functions
Author: RIT CS

This is a demo program that draws the Deathly Hallows symbols.  It demonstrates
the importance of using a hierarchy of functions that can be re-used.
"""

import turtle
import math

# global constants for window dimensions
WINDOW_WIDTH = 400
WINDOW_HEIGHT = 400
# global constant for the deathly hallows dimensions
CLOAK_UNIT = 120


def init() -> None:
    """
    Initialize for drawing.  (-200, -200) is in the lower left and
    (200, 200) is in the upper right.
    :pre: pos (0,0), heading (east), down
    :post: pos (0,0), heading (east), up
    :return: None
    """
    turtle.setworldcoordinates(-WINDOW_WIDTH / 2, -WINDOW_WIDTH / 2,
                               WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2)
    turtle.up()
    turtle.setheading(0)
    turtle.title('Deathly Hallows')
    turtle.speed(6)
    turtle.hideturtle()


def drawCloak() -> None:
    """
    Draw the cloak of invisibility.
    :pre: (relative) pos (0,0), heading (east), pen up
    :post: (relative) pos (0,0), heading (east), pen up
    :return: None
    """
    pass


def drawStone() -> None:
    """
    Draw the resurrection stone.
    :pre: (relative) pos (0,0), heading (east), up
    :post: (relative) pos (0,0), heading (east), up
    :return: None
    """
    pass


def drawWand() -> None:
    """
    Draw the elder wand.
    :pre: (relative) pos (0,0), heading (east), up
    :post: (relative) pos (0,0), heading (east), up
    :return: None
    """
    pass


def drawDeathlyHallows() -> None:
    """
    Draw a single Deathly Hallows symbol.
    :pre: (relative) pos (0,0), heading (east), pen up
    :post: (relative) pos (0,0), heading (east), pen up
    :return: None
    """
    drawCloak()
    drawStone()
    drawWand()


def main() -> None:
    """
    The main function.
    :pre: (relative) pos (0,0), heading (east), pen down
    :post: (relative) pos (0,0), heading (east), pen up
    :return: None
    """
    init()
    drawDeathlyHallows()
    turtle.right(180)
    drawDeathlyHallows()
    turtle.left(180)
    turtle.mainloop()


if __name__ == '__main__':
    main()
