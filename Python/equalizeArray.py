# The question for this solution can be found at https://www.hackerrank.com/challenges/equality-in-a-array/problem

def equalizeArray(arr):
	minDeletions = 0
	
	arrDict = {}
	
	for i in arr:
		if arrDict.get(i):
			arrDict[i] = arrDict.get(i) + 1
		else:
			arrDict[i] = 1
	
	max_key = max(arrDict, key=arrDict.get)
	
	for i in arrDict:
		if i != max_key:
			minDeletions += arrDict[i]
	
	return minDeletions
	
arr = list(map(int, input().rstrip().split()))
print(equalizeArray(arr))