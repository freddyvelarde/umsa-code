def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr.pop()
    left = []
    right = []
 
    for num in arr:
        if num > pivot:
            right.append(num)
        else:
            left.append(num)
    return quick_sort(left) + [pivot] + quick_sort(right)
 
 
def is_prime_number(num):
    if num == 1:
        return False
 
    if num > 2 and num % 2 == 0:
        return False
 
    if num > 3 and num % 3 == 0:
        return False
 
    if num > 5 and num % 5 == 0:
        return False
 
    if num > 7 and num % 7 == 0:
        return False
 
    if num > 11 and num % 11 == 0:
        return False
 
    if num > 13 and num % 13 == 0:
        return False
 
    counter = 0
    for n in range(2, num + 1):
        if counter > 1:
            return False
 
        if num % n == 0:
            counter += 1
 
    return True
 
 
# RUNNING CODE 
n = int(input())
res = []
while True: 
    try:
        a = input()
        if len(a) == 0:
            break
        num = int(a)
        if is_prime_number(num):
            if num not in res:
                res.append(num)
    except EOFError:
        break
 
res_ = '' 
for num in quick_sort(res):
    res_ += str(num) + ' '
 
# print("".join(quick_sort(res)))
print(res_)
