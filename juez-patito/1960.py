# PALINDROME
def palindrome(word):
    left_index = len(word) - 1
    for char in word: 
        if char != word[left_index]:
            return print("NO")
        left_index -= 1
    return print("SI")

while True:
    try:
        line = input()
        if len(line) == 0:
            break
        palindrome(line)
    except EOFError:
        break
