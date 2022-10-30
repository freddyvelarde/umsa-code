n = int(input())

odd = 0
even = 0

for x in range(n):
    num = int(input())
    if num % 2 == 0:
        even += 1
    else:
        odd += 1

print('Pares: {}'.format(even))
print('Impares: {}'.format(odd))

        
