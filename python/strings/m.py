
def normalizeConsonats(string):
    vocals_data = 'aeiou'
    if len(string) == 0:
        return print('La cadena no tiene palabras de longitud par')
    vocals = ''
    consonants = ''
    for char in string:
        if char in vocals_data:
            vocals += char 
        else:
            consonants += char 
    # if 
    return print(vocals + ' ' + consonants)
    


def main(string):
    words = string.split(' ')
    valid_words = []
    for word in words:
        if len(word) % 2 == 0:
            valid_words.append(word)
    normalizeConsonats("".join(valid_words)) 

# ------- RUNNNING CODE --------
n = int(input())

for x in range(n):
    s = input()
    main(s)

