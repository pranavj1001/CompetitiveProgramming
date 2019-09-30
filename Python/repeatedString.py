# The question for this problem can be found at https://www.hackerrank.com/challenges/repeated-string/problem

def repeatedString(s, n):
	numberOfAInString = 0
	numberOfA = 0
	
	for i in s:
		if i == 'a':
			numberOfAInString += 1
			
	numberOfA = numberOfAInString * int(n / len(s))
	
	for i in range(0, n % len(s)):
		if s[i] == 'a':
			numberOfA += 1
	
	return numberOfA
	
	
s = input()
n = int(input())
print(repeatedString(s, n))