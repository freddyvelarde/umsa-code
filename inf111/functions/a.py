def isPalindrome(num):
    num_to_str = str(num)
    index_right = len(num_to_str) - 1
    for char in num_to_str:
        if char != num_to_str[index_right]:
            return False
        index_right -= 1
    return True

# --------- RUNNING CODE --------

while True:
    try:
        n = int(input())
        counter = 0
        for num in range(n):
            a = int(input())
            if isPalindrome(a):
                counter += 1
        print(counter)
        counter = 0
    except EOFError:
        break
