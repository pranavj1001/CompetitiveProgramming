# The question for this problem can be found at https://www.hackerrank.com/challenges/kaprekar-numbers/problem

def isKaprekarNumber(num):
	
	strNum = str(num)
	sqNum = num * num
	strSq = str(sqNum)
	
	r = strSq[len(strSq) - len(strNum):]
	l = strSq[:(-1) * len(strNum)]
		
	#print(l, r, sum)
	if l == '':
		l = 0
	
	if int(l) + int(r) == num:
		return True
	else:
		return False

def kaprekarNumbers(p, q):
	numbers = []
	
	for i in range(p, q + 1):
		if isKaprekarNumber(i):
			numbers.append(i)

	if len(numbers) == 0:
		print('INVALID RANGE')
	else:
		for i in numbers:
			print(i, end = ' ')
	
p = int(input())
q = int(input())
kaprekarNumbers(p,q)