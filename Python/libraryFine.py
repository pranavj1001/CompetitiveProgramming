# The question for this solution can be found at https://www.hackerrank.com/challenges/library-fine/problem

def libraryFine(d1, m1, y1, d2, m2, y2):
	
	if y1 == y2:
		if m1 == m2:
			if d1 <= d2:
				return 0
			else:
				return abs(d1 - d2) * 15
		elif m1 < m2:
			return 0
		else:
			return abs(m1 - m2) * 500
	elif y1 < y2:
		return 0
	else:
		return 10000
	
d1, m1, y1, d2, m2, y2 = map(int, input().rstrip().split())
print(libraryFine(d1, m1, y1, d2, m2, y2))