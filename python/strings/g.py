
def stringInAnotherString(main_string, string):
    if string in main_string:
        return print("si")
    return print("no")

# stringInAnotherString("lagrancasadelpisco", "casalagrancasadelpisco")
# --------- RUNNING CODE -------------

n = int(input()) 
index = 1
res = []
for x in range(n):
    while index < 3:
        a = input()
        res.append(a)
        index += 1
    index = 1
    # print(res)
    stringInAnotherString(res[0], res[1])
    res = []
    
