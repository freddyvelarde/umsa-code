# helpers 
def isPrimeNumber(num):
    if num > 2 and num % 2 == 0:
        return False
    if num == 1:
        return False
    arr_of_numbers = []
    for item in range(2, num + 1):
        if num % item == 0:
            arr_of_numbers.append(item)
    if len(arr_of_numbers) > 1:
        return False
    return True

# end Helpers

def isNumberSorted(arr): # lower to greater
    index = 0
    counter = 0
    for item in arr: 
        if index <= item:
            index = item
            counter += 1
        else:
            return False
    return True


def isTotalSumOdd(arr): #  impares
    res = 0
    for num in arr:
        res += num 
    # even number validation
    if res % 2 != 0:
        return True 
    else:
        return False


def areTherePrimeNumbers(arr_of_numbers, min_prime_numbers):
    prime_nums_counter = 0
    for num in arr_of_numbers:
        if isPrimeNumber(num):
            prime_nums_counter += 1 
    if prime_nums_counter >= min_prime_numbers:
        return True
    return False

# print(areTherePrimeNumbers([2, 3, 8, 10 ], 1))

def main(arr, index):
    if isNumberSorted(arr) and isTotalSumOdd(arr) and areTherePrimeNumbers(arr, index):
        return print("SI")
    return print("NO")

# ----------- RUNNING CODE ----------

n, min_prime_nums = map(int, input().split())

arr_nums = []
for x in range(n):
    a = int(input())
    arr_nums.append(a)


main(arr_nums, min_prime_nums)

