# Numeros balanceados
def main(num):
    num_to_str = str(num)
    evenSum = 0
    oddSum = 0
    index = 1
    for char in num_to_str:
        if index % 2 == 0:
            evenSum += int(char)
        else:
            oddSum += int(char)
        index += 1  
    if evenSum == oddSum:
        print("SI")
    else: 
        print("NO")

# ------- RUNNING ----------
while True:
    try:    
        n = int(input())
        main(n)
    except EOFError:
        break



