

def normalizeIndex(lenNums, index):
    if index > len(lenNums):
        return index % len(lenNums)
    else:
        return index




def changeIndex(num, indexer):
    num_to_str = str(num)
    count = normalizeIndex(num_to_str, indexer)
    
    res = ''
    for char in num_to_str:
        if count < len(num_to_str):
            res += num_to_str[count]
        else: 
            count = 0
            res += num_to_str[count]
        count += 1

    print(int(res))

# --------------- RUNNING ---------

n = int(input())

for x in range(n):
    a, b = map(int, input().split())
    changeIndex(a, b)
# changeIndex(71893, 3)

