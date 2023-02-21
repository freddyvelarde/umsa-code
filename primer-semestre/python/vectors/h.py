def main(list):
    data = {}
    final_res = []
    for num in list[::-1]:
        if num in data:
            data[num] += 1
        else:
            data[num] = 1
            final_res.append(num)

    res = ''
    for char in final_res[::-1]:
        res += str(char) + ' '
    print(len(final_res))
    rint(res)
    
index = 1
while True:
    try:       
        n = input().split()
        if len(n) < 1:
           break
        if index % 2 == 0:
            main(n)
        index += 1
    except EOFError:
        break
