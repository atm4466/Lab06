

def fac(n):
    if(n<2):
        return 1
    else:
        return(n*fac(n-1))
    

print(fac(3))
print(fac(4))
print(fac(5))
#3>6
#4>24
#5>120
n = 4
output = 1
for i in range(n):
    output *= (i+1)

print(output)



def fib(n):
    return((n-1)*(n-2)+1)
for i in range(10):
    print(fib(i))