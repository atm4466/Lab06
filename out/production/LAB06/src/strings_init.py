"""
CSAP/X Week 1: Strings and Functions

An initial version of a program that implements several built in string
functions.  You must implement:

- str_len(s) -> int:  get the length of string s
- str_reverse(s) -> str: return the reverse of string s
- str_index(ch, s) -> int: returns the index of first occurrence of ch in s

The program is run as:

$ python3.10 strings.py
testing str_len...
str_len("") -> 0: OK
str_len("a") -> 1: OK
str_len("ab") -> 2: OK
str_len("abab") -> 4: OK
testing str_reverse...
str_reverse("") -> "": OK
str_reverse("a") -> "a": OK
str_reverse("ab") -> "ba": OK
str_reverse("abc") -> "cba": OK
testing str_index...
str_index("a", "") -> -1: OK
str_index("a", "a") -> 0: OK
str_index("b", "ab") -> 1: OK

author: RIT CS
"""

def str_len(s : str) -> int:
    increment = 0
    for letter in s:
        increment = increment + 1
    return increment

def test_len() -> None:
    """
    A test function for str_len
    :return: None
    """
    print('testing str_len...')
    print('str_len("") -> 0:',
          'OK' if str_len("") == 0 else 'FAIL! got: ' + str(str_len("")))
    print('str_len("a") -> 1:',
          'OK' if str_len("a") == 1 else 'FAIL! got: ' + str(str_len("a")))
    print('str_len("ab") -> 2:',
          'OK' if str_len("ab") == 2 else 'FAIL! got: ' + str(str_len("ab")))
    print('str_len("abab") -> 4:',
          'OK' if str_len("aba") == 3 else 'FAIL! got: ' + str(str_len("aba")))

def str_reverse(src : str) -> str:
    #edited
    ready = []
    news = ""
    for i in range(str_len(str)):
        ready.append(str[str_len(str)-i])
    for item in ready:
        news = news + item
        
    return news

def test_reverse() -> None:
    """
    Test function for str_reverse
    :return: None
    """
    print('testing str_reverse...')
    print('str_reverse("") -> "":',
          'OK' if str_reverse("") == "" else 'FAIL! got: ' + str_reverse(""))
    print('str_reverse("a") -> "a":',
          'OK' if str_reverse("a") == "a" else 'FAIL! got: ' + str_reverse("a"))
    print('str_reverse("ab") -> "ba":',
          'OK' if str_reverse("ab") == "ba" else 'FAIL! got: ' + str_reverse("ab"))
    print('str_reverse("abc") -> "cba":',
          'OK' if str_reverse("abc") == "cba" else 'FAIL! got: ' + str_reverse("abc"))

def str_index(ch: str, s: str) -> int:
    """
    Return the index of the first occurrence of character ch in string s
    :param ch: the character to search for
    :param s: the string to search within
    :return: the index of ch in s, -1 if not present
    """
    return -1

def test_index() -> None:
    """
    Test function for str_index
    :return: None
    """
    print('testing str_index...')
    print('str_index("a", "") -> -1:',
          'OK' if str_index("a", "") == -1 else 'FAIL! got: ' + str(str_index("a", "")))
    print('str_index("a", "a") -> 0:',
          'OK' if str_index("a", "a") == 0 else 'FAIL! got: ' + str(str_index("a", "a")))
    print('str_index("b", "ab") -> 1:',
          'OK' if str_index("b", "ab") == 1 else 'FAIL! got: ' + str(str_index("b", "ab")))

def main() -> None:
    """
    The main function runs tests on all the string functions
    :return:
    """
    test_len()
    test_reverse()
    test_index()

if __name__ == '__main__':
    main()
