def removeChar(string, char):
    data = string
    res = ''
    for x in string:
        if x == char:
            break
        res += x
    res2 = ''
    for i in range(len(res) + 1, len(string)):
        res2 += string[i]
    return res + res2


def main(string):
    data = 'ICPCUMSA'
    res = data
    for char in string:
        if char in string and char in res:
            res = removeChar(res, char) 
    # print(res)
    if len(res) > 0:
        return print("NO ES POSIBLE")
    return print("ES POSIBLE")


# ------------ RUNNING CODE -0-------

n = int(input())

for x in range(n):
    s = input()
    main(s)
