# The question for this solution can be found at https://www.hackerrank.com/challenges/encryption/problem

import math

def encryption(s):
	noSpacesString = s.replace(' ', '')
	encryptedString = ''
	
	sqrt = math.sqrt(len(noSpacesString))
	floorValue = math.floor(sqrt)
	ceilValue = math.ceil(sqrt)
	
	satisfyCondition = False
	
	rows = columns = floorValue
	
	while not satisfyCondition:
		if rows * columns >= len(noSpacesString):
			satisfyCondition = True
		else:
			if columns < ceilValue:
				columns = ceilValue
			elif rows < ceilValue:
				rows = ceilValue
			elif rows == columns and rows == ceilValue:
				satisfyCondition = True
				print('Something bad happened. Stoping Infinite Loop')
				
	print(rows, columns)
	
	for i in range(0, columns):
		word = ''
		for j in range(0, len(noSpacesString)):
			if abs(j - i) % columns == 0:
				word += noSpacesString[j]
		print(word)
		encryptedString += word + ' '
	
	return encryptedString.strip()
	
s = input().strip()
print(encryption(s))