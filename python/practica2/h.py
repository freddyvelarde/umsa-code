def find_subString(string, subString):
    stack = ""
    index = 0
    chars = 0

    counter = 0

    for char in string:
        if stack == subString:
            stack = ""
            chars = 0
            counter += 1
        if chars < len(subString) and char == subString[chars]:
            stack += char
            chars += 1
        else:
            stack = ""
            chars = 0
        index += 1

    if stack == subString:
        counter += 1

    print(counter)


# RUNNING CODE

n = int(input())

for i in range(n):
    a = input()
    b = input()
    find_subString(a, b)
