def fibonacci(num):
    a = 1
    b = 1
    res = 0
    for x in range(num):
        res = a 
        c = a + b 
        a = b 
        b = c 
        c = a
    return res
  
def factorial(num):
    if num <= 1:
        return num 
    return num * factorial(num - 1)
  
def getSequence(num):
    nums = 0
    index = 0
    for i in range(1, num + 1):
        for j in range(i):
            if index != num:
                nums = i
                index += 1
            else: 
                break
    return nums
  
  
  
  
def main(num):
    res = 0
    for index in range(1, num + 1):
        res += factorial(fibonacci(index)) / getSequence(index)
    print('{:.2f}'.format(res))
  
  
# --------------- RUNNING CODE -------------
  
n = int(input())
main(n)
  
