def merge_sort(arr):
    n = len(arr)  # 1

    size = 1  # 1

    while size < n:  # log n
        left = 0  # log n
        while left < n - 1:  # log n
            mid = min(left + size - 1, n - 1)
            right = min(left + 2 * size - 1, n - 1)
            merge(
                arr, left, mid, right
            )  # n * log n ---> this is because merge sort is O (n log n)???
            left += 2 * size
        size *= 2  # log n


def merge(arr, left, mid, right):
    left_arr = arr[left : mid + 1]  # 1
    right_arr = arr[mid + 1 : right + 1]  # 1

    i = j = 0  # 1
    k = left  # 1

    while i < len(left_arr) and j < len(
        right_arr
    ):  # n: cause the while loop iterate 1 by 1
        if left_arr[i] <= right_arr[j]:  # n
            arr[k] = left_arr[i]  # n
            i += 1  # n
        else:  # n
            arr[k] = right_arr[j]  # n
            j += 1  # n

        k += 1  # n

    while i < len(left_arr):  # n
        arr[k] = left_arr[i]
        i += 1
        k += 1


arr = [2, 4, 5, 1, 6, 3]
merge_sort(arr)
print(arr)
