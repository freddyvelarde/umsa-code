

def getOddOrEvenDigits(num):
    num_to_str = str(num)
    even_counter = 0
    odd_counter = 0
    for char in num_to_str:
        if int(char) % 2 == 0:
            even_counter += 1
        else:
            odd_counter += 1
    return  {
                "even": even_counter, 
                "odd":  odd_counter, 
                'current_num': num
            }


def main(arr_of_nums):
    index_even_numbers = {"num": 0, "even": 0}
    index_odd_numbers = {"num": 0, "odd": 0}

    for num in arr_of_nums:
        numbers = getOddOrEvenDigits(num)
        if numbers['even'] > index_even_numbers['even']:
            index_even_numbers['even'] = numbers['even']
            index_even_numbers['num'] = numbers['current_num']
        if numbers['odd'] > index_odd_numbers['odd']:
            index_odd_numbers['odd'] = numbers['odd']
            index_odd_numbers['num'] = numbers['current_num'] 
    print("Numero {} tiene, {} digitos pares".format(index_even_numbers['num'], index_even_numbers['even']))
    print("Numero {} tiene, {} digitos impares".format(index_odd_numbers['num'], index_odd_numbers['odd']))


# ------------ RUNNING CODE -----------


n = int(input())

arr = []
for x in range(n):
    a = int(input())
    arr.append(a)

main(arr)
    

