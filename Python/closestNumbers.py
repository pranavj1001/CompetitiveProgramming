# The question for this solution can be found at https://www.hackerrank.com/challenges/closest-numbers/problem

def closestNumbers(arr):
	pairs = []
	arr.sort()
	minDiff = 0
	for i in range(len(arr) - 1):
		currentDiff = abs(arr[i+1] - arr[i])
		if currentDiff < minDiff or minDiff == 0:
			minDiff = currentDiff
			pairs = []
			pairs.append(arr[i])
			pairs.append(arr[i+1])
		elif currentDiff == minDiff:
			pairs.append(arr[i])
			pairs.append(arr[i+1])
	return pairs
	
arr = list(map(int, input().rstrip().split()))
print(closestNumbers(arr))