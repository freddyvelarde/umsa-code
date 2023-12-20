def sum_arr(arr):
    res = 0
    for num in arr:
        res += int(num)
    return res

def main(arr):
    captain_1 = []
    captain_2 = []
    index = 1
    for x in range(len(arr)):
        if index % 2 != 0:
            captain_1.append(max(arr))
            arr.remove(max(arr))
        else:
            captain_2.append(max(arr))
            arr.remove(max(arr))
        index += 1

    print(abs(sum_arr(captain_1) - sum_arr(captain_2))) 

# ------- RUNNING CODE -------
import sys 
arr_ = []
for line in sys.stdin:
    if len(line) == 1:
        break 
    main(line.split())
    # for num in line:
    #     if num != " ":
    #         arr_.append(int(num))
    # print(arr_)
    # main(arr_)
    # arr_ = []

    


# while True:
#     try:
#         line = input().split()
#         if line == []:
#             break
#         main(line)        
#     except EOFError:
#         break

