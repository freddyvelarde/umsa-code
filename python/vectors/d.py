

def main(arr, a, b):
    res = 0
    for x in range(a, b + 1):
        res += int(arr[x])
    print(res)


# RUNNING CODE 

n = int(input())

for x in range(n):
    a, b = map(int, input().split())
    arr = input().split()
    main(arr, a, b)
