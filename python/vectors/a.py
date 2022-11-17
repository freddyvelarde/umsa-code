
import sys 

def main(arr):
    data = arr[len(arr) - 1]
    counter = 0
    for x in arr:
        if x == data:
            counter += 1
    print(counter)
    # return counter


# RUNNING CODE 

index = 2
for line in sys.stdin:
    if index % 2 == 0:
        n = int(line)
        index += 1
    else: 
        list = line.split()
        main(list)
        index += 1

