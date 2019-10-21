# The question for this solution can be found at https://www.hackerrank.com/challenges/strange-code/problem

def strangeCounter(t):
	num = 3
	notFoundIndex = True
	index = 0
	timeStart = 4
	
	while notFoundIndex:
		if t < timeStart:
			notFoundIndex = False
		else:
			index += 1
			num = 3 * (2 ** (index + 1))
			timeStart = num - 2
			
	return timeStart - t
	
t = int(input())
print(strangeCounter(t))