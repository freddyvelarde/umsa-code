def vocalsC(string):
    data = 'aeiou'
    res = ''
    for char in string:
        if char in data:
            res += char     
    return len(res)


def quick_sort_words(list):
    if len(list) <= 1:
        return list 

    pivot = list.pop()

    left = []
    right = []

    for word in list:
        if vocalsC(word) > vocalsC(pivot):
            right.append(word)
        else:
            left.append(word)
    return quick_sort_words(left) + [pivot] + quick_sort_words(right)


def main(string):

    string = string.split(' ')
    res = ''
    for word in quick_sort_words(string):
        res += word + ' '
    print(res[:-1])

    
s = input()
main(s)
