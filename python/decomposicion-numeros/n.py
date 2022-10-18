# Componer y sumar
def getFirstDigit(num):
    num_to_str = str(num)
    return int(num_to_str[0])
    
def getLastDigit(num):
    num_to_str = str(num)
    return int(num_to_str[len(num_to_str) - 1])

def numberFactory(num):
    if num < 10:
        return num * 11
    first_digit = getLastDigit(num)
    second_digit = getFirstDigit(num)
    third_digit = first_digit + second_digit 
    res = "{}{}".format(first_digit, getLastDigit(third_digit))
    return int(res)

def main(num):
    steps = 1
    current_number = num
    while True:
        number = numberFactory(current_number)
        if num == number:
            print(number)
            break
        else:
            current_number = number
            print(current_number)
            steps += 1
    
    print("pasos: {}".format(steps))

# ----------- Running Code --------

n = int(input())

main(n)
