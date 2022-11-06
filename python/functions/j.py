def main(cases, num, mod):
    res = 0
    for i  in range(1, cases + 1):
        sum = num * i
        res += sum 
    print(res % mod)


# -------- RUNNING CODE -------
a, b, c = map(int, input().split())

main(a, b, c)

