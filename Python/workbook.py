# The question for this solution can be found at https://www.hackerrank.com/challenges/lisa-workbook/problem

def workbook(n, k, arr):
	specialProblems = 0
	startPageNumber = 1
	endPageNumber = 0
	
	for i in arr:
		if i % k == 0:
			endPageNumber += int(i / k)
		else:
			endPageNumber += int(i / k) + 1
		
		counter = 1	
		for j in range(startPageNumber, endPageNumber + 1):
			#print(j, startPageNumber, endPageNumber)
			if j in range((counter - 1) * k + 1, min(i, counter * k) + 1):
				specialProblems += 1
				
			counter += 1
				
		startPageNumber = endPageNumber + 1
	
	return specialProblems
	
k = int(input())
arr = list(map(int, input().rstrip().split()))
print(workbook(len(arr), k, arr))