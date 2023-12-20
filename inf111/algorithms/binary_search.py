def binary_search(list, value, left, right):
    if left > right:
        return None

    pivot = int((left + right) / 2)
    if value == list[pivot]:
        return pivot

    if pivot < value:
        return binary_search(list, value, pivot + 1, right)
    else:
        return binary_search(list, value, left, pivot - 1)

arr = [1,2,3,4,5,6,7,8,9,10]
print(binary_search(arr, 10, 0, len(arr) - 1))
