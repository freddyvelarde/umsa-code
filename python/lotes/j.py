import math 

def main(list):
    a = list[0]
    b = list[1]
    c = list[2]
    s = (a + b + c) / 2 
    r = s * (s-a) * (s-b) * (s - c) 
    if r < 0:
        return print('No hay area')
    res = math.sqrt(r)
    return print('Area: {:.6f}'.format(float(res)))

   
# ---------------- RUNNING CODE --------

n = int(input())
counter = 1
res = []
for x in range(n):
    a = int(input())

    if counter == 3: 
        res.append(a)
        main(res)
        res = []
        counter = 1
    else:
        res.append(a)
        counter += 1
