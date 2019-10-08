# The question for this solution can be found at https://www.hackerrank.com/challenges/flatland-space-stations

def flatlandSpaceStations(n, c):
    c.sort()
    _max = c[0]

    for i in range(1, len(c)):
        _max = max(_max, (c[i] - c[i-1]) / 2)

    _max = max(_max, (n - 1 - c[len(c) - 1]))

    return int(_max)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    c = list(map(int, input().rstrip().split()))

    result = flatlandSpaceStations(n, c)

    fptr.write(str(result) + '\n')

    fptr.close()
