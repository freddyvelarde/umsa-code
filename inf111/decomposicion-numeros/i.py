
def isPrimeNum(num):
    if num == 1: 
        return False
    if num == 0:
        return False
    res = []
    for n in range(2, num + 1):
        if num % n == 0:
            res.append(n) 
    if len(res) > 1:
        return False
    else:
        return True

def main(num):
    res = ''
    for char in str(num):
        if isPrimeNum(int(char)):
            res += char 
    if len(res) > 0:
        print(int(res))
    else:
        print(0)



n = int(input())

for x in range(n):
    a = int(input())
    main(a)

