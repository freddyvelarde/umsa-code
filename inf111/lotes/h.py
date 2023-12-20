
def getNextNumberMultOf7(num):
    current_num = num + 1
    while True:
        if (current_num) % 7 == 0:
            return print(current_num)
        else: 
            current_num += 1

# ----------- RUNNING CODE ---------


n = int(input())

for x in range(n):
    a = int(input())
    getNextNumberMultOf7(a)

