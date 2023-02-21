

def isPalindrome(num):
    num_to_str = str(num)
    indexRight = len(num_to_str) - 1
    count = 0
    
    for char in num_to_str:
        if char == num_to_str[indexRight]:
            count += 1
        indexRight -= 1
    if count == len(num_to_str):
        return True
    else:
        return False



def reverseNumber(num):
    num_to_str = str(num)
    reversed_numbers = ''
    for char in num_to_str[::-1]:
        reversed_numbers += char 
    return int(reversed_numbers)


def main(num):
    current = num + reverseNumber(num)
    # if num < 10: 
        # current = current + reverseNumber(current)     
    # else:

    counter = 0
    while counter < 101:
        if isPalindrome(current):
            return print(current)
        else: 

            current = current + reverseNumber(current)
            counter += 1
    print('error')
        
n = int(input())

for x in range(n):
    a = int(input())
    main(a)





    


