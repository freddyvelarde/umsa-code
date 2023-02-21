

n = int(input())


res = 0
couter = 1
for x in range(n):
    number = int(input())
    if couter == 3:
        res += number
        print(res)
        res = 0
        couter = 1
    else: 
        res += number
        couter += 1

