
def main(num, index1, index2):
    num_to_str = str(num)
    a = num_to_str[index1 - 1]
    b = num_to_str[index2 - 1]

    count = 0
    res = ''
    for char in num_to_str:
        if count == index1 - 1:
            res += b
        elif count == index2 - 1:
            res += a
        else: 
            res += char
        count += 1

    print(res)


# --------------- RUNNING ---------

a, b, c = map(int, input().split())

main(a, b, c)
