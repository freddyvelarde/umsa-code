
def rotateString(string, index):
    res = ''
    for i in range(len(string) - int(index), len(string)):
        res += string[i]
    right_str = string.replace(res, '')
    print(res + right_str)


# --------- RUNNING CODE ------

while True:
    try:
        a, b = map(str, input().split())
        rotateString(a, b)
    except EOFError:
        break


