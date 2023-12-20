def convertString(string):
    vocals = "aeiouyAEIOUY"
    res = ''
    for char in string: 
        if char not in vocals:
            res += '.' + char.lower()
    return print(res)

# -------- RUNNING CODE -------

string = input()
convertString(string)
