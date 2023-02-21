
import sys 

def main(nums_list):
    for num in range(1, len(nums_list) + 2):
        # print("this is the numnber",num)
        if str(num) not in nums_list:
            print(num)
# index = 1
# while True:
    # try:

for line in sys.stdin: 
    line = input().split()
    if len(line) < 1:
        break
    # print(line)
    main(line)
