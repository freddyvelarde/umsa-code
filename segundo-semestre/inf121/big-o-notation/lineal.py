n = 10  # 1
sum = 0  # 1

for i in range(1, n + 1):  # n + 3
    print(i)  # n * 1
    sum += i  # n * 1

print(sum)  # 1

# 1 + 1 + (n + 1) + n + n + 1 => 4 + 3n
# O(n) big o of n is lineal
