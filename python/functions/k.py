

def f(num, k):
    if k == 0: 
        return 0
    num_to_str = str(num)
    sum = 0
    for char in num_to_str:
        sum += int(char)
    res = (sum % 9) ** 2
    return res + f(res, k - 1)

# ------------- RUNNING CODE ---------

n = int(input())

for a in range(n):
    x, y = map(int, input().split())
    print(f(x, y + 1))


