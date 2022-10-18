

def numberToArray(number):
    numToStr = str(number)
    res = []
    for char in numToStr:
        res.append(char)
    return res


def palindromeNumber(num):
    listOfNumbers = numberToArray(num)
    indexLeft = 0
    indexRight = len(listOfNumbers) - 1
    count = 0
    if len(listOfNumbers) % 2 != 0:
        print("N")
        return
    for x in listOfNumbers:
        if listOfNumbers[indexLeft] == listOfNumbers[indexRight]:
            count += 1
        indexLeft += 1
        indexRight -= 1
    if count == len(listOfNumbers):
        print("S")
    else:
        print("N")

n = int(input())

palindromeNumber(n)
