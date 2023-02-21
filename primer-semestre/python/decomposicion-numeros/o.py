# el mayor posible

a, b, c = map(int, input().split())



def validationOfEachNumber(num):
    num_to_str = str(num)
    if len(num_to_str) <= 15 and len(num_to_str) >= 0:
        return True
    else:
        return False

def globalValidation(listOfNumbers):
    res = False
    for x in listOfNumbers:
        if validationOfEachNumber(x) == False:
            res = False
            break
        else: 
            res = True
    return res
        

def main(num1, num2, num3):
    list_of_nums = [num1, num2, num3]

    if globalValidation(list_of_nums) == False:
        return print('error')
    
    res = []

    for x in list_of_nums:
        number = str(x)
        for y in list_of_nums:
            if y != x:
                number += str(y)
        res.append(number)
        # print(number)
        # print("---------")
    list_of_nums_reversed = list_of_nums[::-1]

    for x in list_of_nums_reversed:
        number = str(x)
        for y in list_of_nums_reversed:
            if y != x:
                number += str(y)
        res.append(number)
    print(max(res))

main(a, b, c)
