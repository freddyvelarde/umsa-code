def find_subString(string, subString):
    stack = ""
    indexs = []
    index = 0
    # counter = []
    chars = 0
    
    res = []

    for char in string:
        if stack == subString:
            stack = ''
            res.append(indexs)
            indexs = []
            chars = 0
        if chars < len(subString) and char == subString[chars]:
            stack += char
            indexs.append( str(index))
            chars += 1
        else:
            indexs = []
            stack = ''
            chars = 0
        index += 1

    if len(indexs) > 0  and stack == subString:
        res.append(indexs)

    for data in res:
        print("({}, {})".format(data[0], data[len(data) - 1]) )

# RUNNING CODE 

n = int(input())

for i in range(n):
    b = input()
    a = input()
    print("caso {}".format(i))
    find_subString(a, b)
