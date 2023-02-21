

def get_sequence(n):
    if n <= 1:
        return n
    return n + get_sequence(n - 1)


# print(get_sequence(2 + 1))
# RUNNING CODe 

n = int(input())

for _ in range(n):
    a, b = map(int, input().split())
    res = get_sequence(a + 1) * (b + 1)
    print(res)
