
def g(num):
    num_to_str = str(num)
    res = 0
    for char in num_to_str:
        res += int(char)
    return res

def f(x):
    if x < 10:
        return x

    return 1 + f(g(x))


# -------- RUNNING CODE ---------


n = int(input())

for c in range(n):
    a = int(input())
    print(f(a))


