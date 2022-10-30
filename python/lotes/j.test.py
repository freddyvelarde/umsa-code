import math 

def main(list):
    a = list[0]
    b = list[1]
    c = list[2]
    s = (a + b + c) / 2 
    r = s * (s-a) * (s-b) * (s - c) 
    if r < 0:
        print('No hay area')
    else: 
        res = math.sqrt(r)
        print('Area: {:.6f}'.format(float(res)))

   
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
