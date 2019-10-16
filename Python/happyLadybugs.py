# The question for this problem can be found at https://www.hackerrank.com/challenges/happy-ladybugs/problem

def happyLadybugs(b):
	dict = {}
	isSpacePresent = False
	isProperFormat = True
	
	for i in range(0, len(b)):
		if i in range(1, len(b) - 1) and (b[i] != b[i-1] and b[i] != b[i+1]):
			isProperFormat = False
		if b[i] == '_':
			isSpacePresent = True
		elif b[i] not in dict:
			dict[b[i]] = 1
		else:
			dict[b[i]] = dict.get(b[i]) + 1
			
	if len(dict) == 0 and isSpacePresent:
		return  'YES'
	elif not isProperFormat and not isSpacePresent:
		return 'NO'
	else:
		for i in dict:
			if dict.get(i) == 1:
				return 'NO'
				
	return  'YES'

b = input()
print(happyLadybugs(b))