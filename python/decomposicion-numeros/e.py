

def isPalindrome(num):
    numToStr = str(num)
    
    listOfNums = []
    for char in numToStr:
        listOfNums.append(char)
    # validation
    if num < 10:
        return True

    indexLeft = 0
    indexRight = len(listOfNums) - 1
        
    count = 0

    for x in listOfNums:
        if listOfNums[indexLeft] == listOfNums[indexRight]:
            count += 1
        indexLeft += 1
        indexRight -= 1
    if count == len(listOfNums):
        return True
    else:
        return False

def reverseNumber(num):
    item = str(num)
    reversed = []
    for char in item: 
        reversed.insert(0, char)

    res = ""
    for char in reversed:
        res += char
    return int(res)




def main(num):
    currentNumber = num
    countSums = 0

    while True:
        if countSums == 100:
            print(currentNumber)
            break

        if isPalindrome(currentNumber) == True:
            print(currentNumber)
            break
        # elif currentNumber < 5:
        #     currentNumber *= 2
        #     print(currentNumber)
        #     break
        else:
            currentNumber = reverseNumber(currentNumber) + currentNumber
            countSums += 1

            
    

n = int(input())
if n <= 500:
    for x in range(n):
        a = int(input())
        main(a)
