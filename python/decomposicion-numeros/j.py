
def toBinaryNum(num):
    remainer = num
    res = [remainer]
    while remainer >= 2: 
        remainer = remainer // 2 
        res.append(remainer)
    finalRes = ''
    for num in res[::-1]: 
        finalRes += str(num % 2)
    return finalRes

    # 2 > 10 || 10 > 1010

def counterOfBitsOn(binNum):
    counter = 0
    for bit in binNum:
        if bit == '1':
            counter += 1 
    print(counter)
    # 1010 > 2 >>>> 1 + 1 = 2 

# ----------- RUNNING ---------

n = int(input())
for x in range(n):
    a = int(input())
    counterOfBitsOn(toBinaryNum(a))
