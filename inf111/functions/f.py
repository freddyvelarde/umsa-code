def fibonacci(num):
    a = 1 
    b = 1
    res = 0
    for x in range(num):
        res = a 
        c = a + b 
        a = b 
        b = c 
        c = a
    return res


while True:
    try:
        n = int(input())
        print(fibonacci(n))
    except EOFError:
        break
