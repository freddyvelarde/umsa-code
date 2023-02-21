def invertString(number):
    num_to_str = str(number)
    first_char = num_to_str[0]
    last_char = num_to_str[len(num_to_str) - 1]
    str_inverterd = '' 
    for i in range(len(num_to_str) - 2, 0,-1):
        str_inverterd += num_to_str[i]
    return first_char + str_inverterd + last_char

# --------- RUNNING CODE -----------

# invertString(11234567891)
n = int(input())
res = ''
for x in range(n):
    a = int(input())
    res += invertString(a) + ' '


print(res[:-1])
