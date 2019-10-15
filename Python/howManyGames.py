# The question for this solution can be found at https://www.hackerrank.com/challenges/halloween-sale/problem

def howManyGames(p, d, m, s):
	count = 0
	cost = p
	
	while s >= cost:
		count += 1
		print(p, d , m, s, cost, count)
		s -= cost
		cost -= d
		if cost < m:
			cost = m
	
	return count
	
p, d, m, s = map(int, input().rstrip().split())
print(howManyGames(p, d, m, s))