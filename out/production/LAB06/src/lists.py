"""
CSAP/X Week 1: Python Intro

Some basic list operations.

@author: RIT CS
"""

def main():
    # list creation of an empty list
    l1 = []
    l2 = list()
    print('EMPTY: l1:', l1, ', l2:', l2)

    # list initialization with elements
    l3 = l = [1, 2.5, False, 'Hello']    # int, float, bool, str
    l4 = [4, 6, 10, 45]                  # all integers
    print('INITIALIZED: l3:', l3, ', l4:', l4)

    # adding new element to end of a list
    l5 = [1, 2, 3]
    print('APPEND: l5 before:', l5)
    l5.append(4)
    print('APPEND: l5 after:', l5)

    # removing an element from the end of a list
    print('POP: l5 before:', l5)
    element = l5.pop()
    print('POP: l5 after:', l5, ', element:', element)

    # loop over and print elements
    l6 = [1, 1, 2, 3, 5, 8]
    print('LOOP: l6:', l6)
    for element in l6:
        print('\t', element)


if __name__ == '__main__':
    main()
