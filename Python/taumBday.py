# The question for this problem can be found at https://www.hackerrank.com/challenges/taum-and-bday/problem

def taumBday(b, w, bc, wc, z):
	cost = 0
	
	if bc > wc + z:
		cost = (b * (wc + z)) + (w * wc)
	elif wc > bc + z:
		cost = (b * bc) + (w * (bc + z))
	else:
		cost = (b * bc) + (w * wc)
	
	return cost
	
b = int(input())
w = int(input())
bc = int(input())
wc = int(input())
z = int(input())

print(taumBday(b, w, bc, wc, z))