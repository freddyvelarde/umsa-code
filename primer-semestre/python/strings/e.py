def convertString(string): 
    res = ''
    index = 1
    for char in string:
        if index % 2 != 0 and char != ' ':
            res += char.upper()
            index += 1
        elif index % 2 == 0 and char != ' ':
            res += char.lower()
            index += 1
        else: 
            res += " "
    return print(res)

# ------- RUNNING CODE --------

n = int(input())

for x in range(n):
    a = input()
    convertString(a)
    
