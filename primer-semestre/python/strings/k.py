

def main(string, string_2):
    data = 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'
    res = string + string_2
    if res in data:
        print('Correcto')
    else:
        print("Incorrecto")
    # print(len(res))

# --------- RUNNING CODE ----------
index = 1
res = []
while True:
    try:
        if index < 3:
            s = input()
            if len(s) == 0:
                break
            res.append(s)
            index += 1
        else:
            main(res[0], res[1])
            res = []
            index = 1
        
    except EOFError:
        break


# main('abcdefghi', 'jklmnopqrstuvwxyz')
# main('abc', 'xyzzzzzzzzzzzzzz')
