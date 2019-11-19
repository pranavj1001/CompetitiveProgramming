# The question for this solution can be found at https://www.hackerrank.com/challenges/minimum-distances/problem

def minimumDistances(a):
	minValues = []
	
	for i in range(len(a) - 1):
		for j in range(i + 1, len(a)):
			if a[j] == a[i]:
				minValues.append(abs(j-i))
				break
	
	if len(minValues) == 0:
		return -1
	return min(minValues)
	
a = list(map(int, input().rstrip().split()))
print(minimumDistances(a))