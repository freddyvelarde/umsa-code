n = int(input())


res = 0
passengers = []
for x in range(n):
    a, b = map(int, input().split())
    # res_a += a 
    # res_b += b
    res += b - a 
    passengers.append(res)


print(max(passengers))
