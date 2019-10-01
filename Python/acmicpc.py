# The question was this solution can be found at https://www.hackerrank.com/challenges/acm-icpc-team/problem

def acmTeam(topic, m):
	arr = []
	count = 0
	max = 0
	
	for i in range(0, len(topic) - 1):
		for j in range(i + 1, len(topic)):
			val = 0
			res = bin(int(topic[i], 2) | int(topic[j], 2))
			val = res.count(str(1))
			if val > max:
				max = val
				count = 0
			if val == max:
				count += 1
			arr.append(val)

	return [max, count]
	
n = int(input())
m = int(input())

topic = []

for _ in range(n):
	topic_item = input()
	topic.append(topic_item)

result = acmTeam(topic, m)

print(result)