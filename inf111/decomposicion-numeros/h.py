def numToArr(num):
    res = []
    if num < 9:
        res = [0]
    for char in str(num):
        res.append(int(char))
    return res

def getSumOfNumbersRaised(list):
    res = 0
    for num in list: 
        res += num**2
    return res



def main(num):
    if num == 4:
        return print("Triste")
    current = getSumOfNumbersRaised(numToArr(num))
    while current != 1:
        current = getSumOfNumbersRaised(numToArr(current))
        if current == 4:
            return print('Triste')
    print('Feliz')

# -------------- RUNNING -----------

n = int(input())
for x in range(n):
    a = int(input())
    main(a)



