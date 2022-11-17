def average(a, b):
    sum = a + b
    res = sum / 2   
    return "{:.1f}".format(res)   


def main(list):
    index = 0
    res = []
    while index < len(list) - 1:
        r = average(list[index], list[index + 1])
        res.append(r)
        index += 1
    res.append(average(list[0], list[len(list) - 1]))
    final_res = ''
    for num in res: 
        final_res += num + " "
    print(final_res)

# --------- RUNNING CODE ----------
n = int(input())

arr = []
for x in range(n):
    a = int(input())
    arr.append(a)

main(arr)
