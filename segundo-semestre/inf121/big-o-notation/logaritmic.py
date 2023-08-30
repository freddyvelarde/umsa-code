def binary_search(arr, target):
    left, right = 0, len(arr) - 1  # 1

    while (
        left <= right
    ):  # log n: cause the while loop increments divided to 2 each time.
        mid = left + (right - left) // 2  # log n * 1 = log n

        if arr[mid] == target:  # log n
            return mid  # log n
        elif arr[mid] < target:  # log n
            left = mid + 1  # log n
        else:  # log n
            right = mid - 1  # log n
    return -1  # 1


sorted_list = [1, 2, 3, 4, 5, 6, 7, 9, 10]
target = 6

result = binary_search(sorted_list, target)

if result != -1:
    print(f"Target {target} found at index {result}")
else:
    print(f"Target {target} not found")
