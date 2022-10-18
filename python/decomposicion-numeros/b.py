
def evenNumbersSum(num):
    numToStr = str(num)
    res = 0
    for number in numToStr:
        if int(number) % 2 == 0:
            res += int(number)
    print(res)

while True:
    try:
        n = int(input())
        evenNumbersSum(n)
    except ValueError or EOFError:
        break

