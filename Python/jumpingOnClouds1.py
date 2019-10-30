# The question for this solution can be found at https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

def jumpingOnClouds(c):
	jumps = 0
	index = 0
	
	while index != len(c) - 1:
		if index + 2 <= len(c) - 1 and c[index + 2] != 1:
			index += 2
		elif index + 1 <= len(c) - 1 and c[index + 1] != 1:
			index += 1
			
		jumps += 1
	
	return jumps
	
c = list(map(int, input().rstrip().split()))
print(jumpingOnClouds(c))