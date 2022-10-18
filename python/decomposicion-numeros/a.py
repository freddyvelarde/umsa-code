# digits sum 


def digitsSum(num):
    numToStr = str(num)
    res = 0
    for char in numToStr:
        res += int(char)
    print("La suma de los digitos de {} es {}".format(num, res))

while True:
    try:
        n = int(input())
        digitsSum(n)
    except ValueError:
        break

