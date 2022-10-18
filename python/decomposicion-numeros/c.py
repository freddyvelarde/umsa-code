
def strToArray(word):
    res = []
    for char in word:
        res.append(char)
    return res

def k_esimo_numero(num, pos):
    numToStr = strToArray(str(num))
    print("{} {}".format(len(numToStr), numToStr[pos - 1]))


num, position = map(int, input().split())

k_esimo_numero(num, position)
