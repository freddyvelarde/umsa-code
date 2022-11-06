def main(num):
    num_to_str = str(num)
    if len(num_to_str) % 2 == 0:
        return print("*")
    res = 0
    res = (len(num_to_str) - 1) / 2 
    print(num_to_str[int(res)])

# ------------- RUNNING CODE --------

n = int(input())

main(n)


