# The question for this problem can be found at https://www.hackerrank.com/challenges/fair-rations/problem

def fairRations(B):
	
	if sum(B) % 2 == 1:
		return 'NO'
	else:
		count_1 = 0
		for i in range(0, len(B) - 1):
			if B[i] % 2 == 1:
				count_1 += 2
				B[i] += 1
				B[i+1] += 1
				
		return count_1
	
B = list(map(int, input().rstrip().split()))
print(fairRations(B))
