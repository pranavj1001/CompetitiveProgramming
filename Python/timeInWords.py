# The question for this solution can be found at https://www.hackerrank.com/challenges/the-time-in-words/problem

def numberToString(num):
	switcher = {
		1: 'one',
		2: 'two',
		3: 'three',
		4: 'four',
		5: 'five',
		6: 'six',
		7: 'seven',
		8: 'eight',
		9: 'nine',
		10: 'ten',
		11: 'eleven',
		12: 'twelve',
		13: 'thirteen',
		14: 'fourteen',
		15: 'quarter',
		16: 'sixteen',
		17: 'seventeen',
		18: 'eighteen',
		19: 'nineteen',
		20: 'twenty',
		21: 'twenty one',
		22: 'twenty two',
		23: 'twenty three',
		24: 'twenty four',
		25: 'twenty five',
		26: 'twenty six',
		27: 'twenty seven',
		28: 'twenty eight',
		29: 'twenty nine',
		30: 'half'
	}
	
	return switcher.get(num, 'not found')

def timeInWords(h,m):
	print(h, m)
	time = ''
	
	if m == 0:
		time = numberToString(h) + ' o\' clock'
	elif m in range(1, 31):
		if m % 15 == 0:
			time = numberToString(m) + ' past ' + numberToString(h)
		else:
			time = numberToString(m) + (' minute' if m == 1 else ' minutes') + ' past ' + numberToString(h)
	elif m in range(31, 60):
		if m % 15 == 0:
			time = numberToString(60 - m) + ' to ' + numberToString(1 if h == 12 else h + 1)
		else:
			time = numberToString(60 - m) + (' minute' if m == 1 else ' minutes') + ' to ' + numberToString(1 if h == 12 else h + 1)
	
	return time
			
	
h, m = map(int, input().rstrip().split())
print(timeInWords(h, m))