# Horrocrux

def prime_number(index):
    if index == 0:
        return False
        
    if index > 2 and index % 2 == 0:
        return False

    if index > 3 and index % 3 == 0:
        return False 

    if index > 5 and index % 5 == 0:
        return False

    if index > 7 and index % 7 == 0:
        return False

    if index > 11 and index % 11 == 0:
        return False
    counter = 0
    for x in range(2, index + 1):
        if counter > 1:
            return False
        if index % x == 0:
            counter += 1

    return True

prime_numbers_data = [2,3,5,7,11]
def generate_prime_number(index):
    # res = []
    counter = prime_numbers_data[len(prime_numbers_data) - 1] + 1
    while index > len(prime_numbers_data):
        if prime_number(counter):
            prime_numbers_data.append(counter)
        counter += 1
    return prime_numbers_data
    
def main(string, target):
    index = 1
    index2 = 1
    res = ''
    for char in string:
        if index == generate_prime_number(index2)[index2 - 1]:
            res += str(target)
            index2 += 1
            index = 1
        else:
            res += char
            index += 1
    print(res)
# RUNNING CODE 

s = input()
n = int(input())

main(s, n)
