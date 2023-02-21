def vocalsRemainers(word):
    vocals = 'aeiou'
    res = ''
    for char in word:
        if char in vocals and char not in res:
            res += char
    for char in res:
        vocals = vocals.replace(char, "")
    return vocals


def main(string):
    words = string.split(' ')
    
    res = ''
    for word in words:
        res += vocalsRemainers(word) + ' '
    return print(res[:-1])


# ----- RUNNING CODE -----

n = int(input())

for x in range(n):
    a = input()
    main(a)

