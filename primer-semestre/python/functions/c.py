
def isPrimeNumber(num):
    if num > 2 and num % 2 == 0:
        return False
    if num > 3 and num % 3 == 0:
        return False
    if num > 5 and num % 5 == 0:
        return False
    # counter = 0
    # for i in range(10, num + 1):
    #     if counter > 1:
    #         break
    #     if num % i == 0:
    #         counter += 1
    return True

while True:
    try:
        n = int(input())
        if isPrimeNumber(n):
            print('ES PRIMO')
        else: 
            print('NO ES PRIMO')
    except EOFError:
        break
