# The question for this solution can be found at https://www.hackerrank.com/challenges/funny-string/problem

def funnyString(s):
	r = ''.join(reversed(s))
	
	for i in range(1, len(s)):
		if abs(ord(s[i]) - ord(s[i-1])) != abs(ord(r[i]) - ord(r[i-1])):
			return 'Not Funny'
		
	return 'Funny'
	
s = input()
print(funnyString(s))