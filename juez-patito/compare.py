import sys


def compare_files_line_by_line(file1, file2):
    try:
        # Open both files
        with open(file1, "r") as f1, open(file2, "r") as f2:
            line_number = 0

            # Read lines from both files
            while True:
                line1 = f1.readline()
                line2 = f2.readline()
                line_number += 1

                # If both lines are empty, end of files reached
                if not line1 and not line2:
                    print("The files are identical.")
                    break

                # Check for differences
                if line1 != line2:
                    print(f"Difference found at line {line_number}:")
                    print(f"File 1: {line1.strip()}")
                    print(f"File 2: {line2.strip()}")
                    break  # Stop after the first difference

                # Check for extra lines
                if line1 and not line2:
                    print(
                        f"Extra line in {file1} at line {line_number}: {line1.strip()}"
                    )
                    break
                if line2 and not line1:
                    print(
                        f"Extra line in {file2} at line {line_number}: {line2.strip()}"
                    )
                    break
    except FileNotFoundError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")


if __name__ == "__main__":
    # Ensure two arguments are passed
    if len(sys.argv) != 3:
        print("Usage: python script.py <file1> <file2>")
        sys.exit(1)

    # Get file paths from arguments
    file1 = sys.argv[1]
    file2 = sys.argv[2]

    # Compare the files
    compare_files_line_by_line(file1, file2)
