
def isPrimeNumber(num):
    if num > 2 and num % 2 == 0:
        return False
    res = []
    for a in range(2, num + 1):
        if num % a == 0:
            res.append(a)
    if len(res) > 1: 
        return False
    else: 
        return True

def isMultipleOf5(num):
    if num % 5 == 0:
        return True
    else:
        return False


def indentNumber(num):
    current_lower = num 
    while current_lower % 5 != 0:
        current_lower -= 1
    
    current_greater = num 
    while current_greater % 5 != 0:
        current_greater += 1
        
    return {"lower": current_lower, "greater": current_greater }    


def main(num):
    if isPrimeNumber(num):
        return print("{} es primo".format(num))
    if isMultipleOf5(num):
        return print("{} es multiplo de 5".format(num))
    
    print("{} se encuentra entre {} y {}".format(num, indentNumber(num)['lower'], indentNumber(num)['greater']))


# ----------- RUNNING CODE -----------


n = int(input())


for x in range(n):
    a = int(input())
    main(a)

