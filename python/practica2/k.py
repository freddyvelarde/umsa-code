
t=int(input())
for i in range(t):
    n=int(input())
    c=0
    for i in range(1,n//2+1):
        if (n-i)%3==0:
            c=c+1
    print(c,c)
