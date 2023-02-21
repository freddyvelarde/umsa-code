
def descomposeNumbers(num, indexer):
    num_to_str = str(num)
    count = 1
    index = 1
    numbers = ''
    res = []
    for char in num_to_str:
        if (count) % (indexer + 1) == 0:
            res.append(numbers)
            count = 2
            numbers = ''
        else: 
            count += 1
        numbers += char
        index += 1
    res.append(numbers)
    return res

def main(nums, indexer):
    list_of_nums = descomposeNumbers(nums, indexer)
    res = ''
    for numbers in list_of_nums:
        if len(numbers) == indexer:
            res += numbers[1:]
        else:
            res += numbers
    print(res)

# ------------- RUNNING CODE ------------
n = int(input())

for x in range(n):
    a, b = map(int, input().split())
    main(a, b)

