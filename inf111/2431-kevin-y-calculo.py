# Kevin y calculo
def f(n):
    res = int(n/2)
    if n % 2 != 0:
        print(-(res + 1))
    else:
        print(res)
# RUNNING CODE 
n = int(input())
for x in range(n):
    a = int(input())
    f(a)
