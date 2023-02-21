def factorialOf(num):
    if num == 1:
        return 1
    return num * factorialOf(num - 1) # recursion


def factoryOfNums(num):
    num_to_str = list(str(num))
    res = 0
    index = len(num_to_str)
    for char in num_to_str:
        if int(char) == 0:
            res += 0
        else:
            res += int(char) * factorialOf(index)
        index -= 1
    print(res)

# ------------- RUNNING CODE --------------

while True:
    n = int(input())
    if n == 0:
        break
    else: 
        factoryOfNums(n)
