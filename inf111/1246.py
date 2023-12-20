def counter_char(string, index):
    counter = 0
    for char in string:
        if char == index:
            counter += 1
    return print(counter)


# RUNNING CODE 

char = input()

string = input()

counter_char(string, char)
