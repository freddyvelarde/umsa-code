

def main(a, b, c):
    res_a = b + c 
    res_b = a + c 
    res_c = b + a
    
    if a == res_a:
        print("SI")
    elif b == res_b:
        print("SI")
    elif c == res_c:
        print("SI")
    else:
        print("NO")


# main(1, 4, 3)

n = int(input())

for x in range(n):
    x, y, z = map(int, input().split())
    main(x, y, z)
