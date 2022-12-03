
n = int(input())
res = 0
for x in range(n):
    num = int(input())
    if num > 10:
        res += num - 10

print(res)
