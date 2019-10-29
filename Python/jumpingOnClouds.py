# The question for this solution can be found at https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

def jumpingOnClouds(c, k):
	e = 100
	reachedFirstCloud = False
	energyEmpty = False
	i = k % len(c)
	
	while not reachedFirstCloud and not energyEmpty:
		
		if c[i] == 1:
			e -= 3
		else:
			e -= 1
		
		if i == 0:
			reachedFirstCloud = True
			
		i = (i + k) % len(c)
			
		if e < 0:
			energyEmpty = True
			e = 0
	
	return e
	
c = list(map(int, input().rstrip().split()))
k = int(input())
print(jumpingOnClouds(c, k))