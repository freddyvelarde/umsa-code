
def factorial_of(num):
    res = 1
    for x in range(1, num + 1):
        res *= x
    return print(res)


for x in range(1, 20):
    factorial_of(x)
