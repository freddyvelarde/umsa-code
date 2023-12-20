def printString(word):
    res = ''
    for char in word:
        res += char + ','

    return print(res[:-1])

# ----- RUNNING CODE -----

n = int(input())

for x in range(n):
    a = input()
    printString(a)

