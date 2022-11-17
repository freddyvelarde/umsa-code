def printWeirdChars(string):    
    first_chars = [string[0], string[1], string[2]]
    last_chars = [string[len(string) - 3], string[len(string) - 2], string[len(string) - 1] ]

    print("".join(first_chars) + " " + "".join(last_chars))


# ---------- RUNNING CODE ----------

n = int(input())

for x in range(n):
    a = input()
    printWeirdChars(a)
