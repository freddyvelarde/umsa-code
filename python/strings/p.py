def main(string):
    number = {1: "2", 2: "0", 3: "2", 4: "0"}
    left = []
    for i in range(0, 4):
        if string[i] != number[i + 1]:
            break
        left.append(string[i])
    index = 4  
    right = []
    for i in range(len(string) - 1, len(string) - 5, -1):
        if string[i] != number[index]:
            break
        right.insert(0, string[i])
        index -= 1
    left_str = "".join(left)
    right_str = "".join(right)

    if right_str == '2020':
        return print("SI")
    if left_str == '2020':
        return print('SI')

    if len(left_str) + len(right_str) == 4 and left_str + right_str == '2020':
        return print('SI')

    remainer = 0
    if len(left_str) + len(right_str) > 4:
        remainer = len(left_str) + len(right_str) - 4
    for i in range(remainer):
        left.pop()
    left_str = "".join(left)

    if left_str + right_str == '2020':
        return print('SI')
    return print("NO")
# main('20192020')
# main('22019020')
# main('2020')
# main('2025484020')
# main('205484020')

# main('729040')
# main('200200')
# main("81958689144842726660256311474779026092230691303467409989182135241713905646146909560796691309700043593")

n = int(input())

for x in range(n):
    a = int(input())
    s = input()
    main(s)

