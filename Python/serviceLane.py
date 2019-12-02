# The question for this solution can be found at https://www.hackerrank.com/challenges/service-lane/problem

def serviceLane(n, cases, width):
	minWidths = []
	
	for case in cases:
		minWidths.append(min(width[case[0]:case[1]+1]))
	
	return minWidths
	
width = list(map(int, input().rstrip().split()))
t = int(input())
cases = []
for _ in range(t):
	cases.append(list(map(int, input().rstrip().split())))
	
print(serviceLane(len(width), cases, width))