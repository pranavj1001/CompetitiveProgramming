# The question for this problem can be found here https://www.hackerrank.com/challenges/cut-the-sticks

# Complete the cutTheSticks function below.
def cutTheSticks(arr):
    stickCounts = []
    continueIteration = True

    while (len(arr) > 0):
        minElement = min(arr)
        stickCounts.append(len(arr))
        arr = list(filter(lambda i: i != minElement, arr))
    
    return stickCounts

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = cutTheSticks(arr)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
