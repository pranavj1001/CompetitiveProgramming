# The question for this solution can be found at https://www.hackerrank.com/challenges/beautiful-triplets/probleml

def beautifulTriplets(d, arr):
	triplets = 0
	
	if len(arr) > 2:
		for i in range(0, len(arr)):
			if arr[i] + d in arr and arr[i] + (2 * d) in arr:
				triplets += 1
	
	return  triplets
	
arr = list(map(int, input().rstrip().split()))
d = int(input())
print(beautifulTriplets(d, arr))