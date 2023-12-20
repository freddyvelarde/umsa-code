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

def main(num):
    fib_index = 1
    even_index = 1
    for i in range(2, num + 2):
        if i % 2 == 0:
            print(fibonacci(fib_index))
            fib_index += 1
        else: 
            print(2 * even_index)
            even_index += 1


# ------------- RUNNING CODE -----------


n = int(input())

main(n)





