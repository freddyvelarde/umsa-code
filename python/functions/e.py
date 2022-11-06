
def factorial_Of(num):
    if num <= 1:
        return num
    return num * factorial_Of(num - 1)

def main(num):
    num_to_str = str(num)
    res = 0
    for char in num_to_str:
        res += factorial_Of(int(char))

    if res == num:
        print("Y")
    else: 
        print("N")

# ---------- RUNNING CODE ----------

n = int(input())

for x in range(n):
    a = int(input())
    main(a)
