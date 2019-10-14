# The question for this problem can be found at https://www.hackerrank.com/challenges/manasa-and-stones/problem

def stones(n, a, b):
	list = []
	
	if b < a:
		temp = a
		a = b
		b = temp
	
	if a == b:
		list.append(a * (n-1))
	else:
		list.append(a * (n - 1))
		diff = b - a
		for i in range(1, n):
			list.append((a * (n - 1)) + (diff * i))
		
	#for i in list:
		#_str += str(i) + ' '
		
	return list
	
n, a, b = map(int, input().rstrip().split())
print(stones(n, a, b))