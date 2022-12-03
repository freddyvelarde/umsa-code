
def sum(list):
    res = 0
    for num in list:
        res += num
    return print(res)


while True:
    try:
        n = list(map(int, input().split()))
        if len(n) == 0:
            break
        sum(n)
    except EOFError:
        break

