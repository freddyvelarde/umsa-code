def x_root(x, n):
    num_abs = abs(x)
    res = int(round(num_abs ** (1. / n)))

    if n % 2 == 0:
        return res

    if x > 0:
        return res

    return -res



# print(x_root(-64, 3))
