def string_to_arr(list):
    res = []
    for char in list:
        res.append(char)
    return res

def main(string):
    vocals = 'aeiouAEIOU'
    nums = '0123456789'
    new_nums = ''
    index_nums = []

    new_password = ""
    index = 0  
    for char in string:
        if char in vocals:
            new_password += char.lower() + char.lower()
            index += 1
        elif char in nums:
            new_nums += char 
            index_nums.append(index)
            new_password += char
        else :
            new_password += char.upper()

        index += 1 
    

    last_char = len(new_nums) - 1

    res = ''
    counter = 0
    counter2 = 0
    for char in new_password:
        if counter2 < len(index_nums) and counter == index_nums[counter2]:
            res += new_nums[last_char]
            last_char -= 1
            counter2 += 1
        else: 
            res += char
        counter += 1
    print(res)

# RUNNING CODE 

while True:
    try:
        n = input()
        if n == "":
            break
        s = input()
        main(s)
    except EOFError:
        break 



