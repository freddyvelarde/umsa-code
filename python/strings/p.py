


def main(string):
    data = '2020'
    res = ''
    for char in string:
        if char in data:
            res += char 
     
    if len(res) == len(res.replace(data, '')):
        return print('NO')
    return print("SI")


main('22019020')

# n = int(input())

# for x in range(n):
#     a = int(input())
#     s = input()
#     main(s)

