
s = 'staple'


s = s[0:3] + s[4:]
print(s)


result = ""

for item in s:
    if item != "p":
        result += item
print(result)

result2 = ""
for i in range(len(s)):
    if s[i] != "p":
        result += s[i]

print(result2)


print(s[len(s)-1])
print(s[-1])

s = "sparkle"

print(s[0::2])
    

#4 cast after the print statement

#5 no return statement

def fib(n):
    if n <= 1:
        return n
    else:
        return fib(n-1) + fib(n-2)

print('fib(5):', fib(5))

