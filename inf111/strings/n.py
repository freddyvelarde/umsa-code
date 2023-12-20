def quick_sort_words(list): # recursive sort 
    if len(list) <= 1:
        return list 

    pivot = list.pop()

    left = []
    right = []

    for word in list:
        if len(word) > len(pivot):
            right.append(word)
        else:
            left.append(word)
    return quick_sort_words(left) + [pivot] + quick_sort_words(right)


def main(string):
    words = string.split(' ')
    for word in quick_sort_words(words):
        print(word) 
# RUNNING CODe

n = int(input())
s = input()

main(s)
