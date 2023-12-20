
def replaceChar(string, str_1, str_2):
    res =string.replace(str_1, str_2)
    print(res)
    # res = ''
    # words = []
    # index = 1
    # for char in string:
    #     if index == len(str_1) + 1:
    #         words.append(res)
    #         index = 2 
    #         res = ''
    #         res += char
    #     else:
    #         res += char 
    #         index += 1
    # words.append(res)
    # print(words)
        

# ----- RUNNING CODE ----------
n = int(input())

for x in range(n):
    a = input();
    x, y = map(str, input().split())
    replaceChar(a, x, y)

