
def getDivider(num):
    res = ''
    for number in range(1, num + 1):
        if num % number == 0:
            res += '{} '.format(str(number))
    print(res[:-1]) 
           

#  --------- RUNNING CODE ---------
n = int(input())

for x in range(n):
    a = int(input())
    getDivider(a)
