def isPalindrome(num): # palindrome = capicua
    num_to_str = str(num)
    index_left = len(num_to_str) - 1
    for char in num_to_str:
        if char == num_to_str[index_left]:
            index_left -= 1
        else:
            return False
    return True

# ------------ RUNNING CODE -------------

n = int(input())

for x in range(n):
    number = int(input())
    if isPalindrome(number):
        print(number)


