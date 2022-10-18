

def main(num):
    num4 = False
    num7 = False

    for char in str(num):
        if int(char) == 4:
            num4 = True
        elif int(char) == 7:
            num7 = True
        else: 
            return print("N")
    if num4 or num7:
        print('S')
    else: 
        print('N')

n = int(input())

main(n)
