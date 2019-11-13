# The question for this solution can be found at https://www.hackerrank.com/challenges/3d-surface-area/problem

def surfaceArea(A):
	area = 0
	#print(A)
	
	for i in range(len(A)):
		for j in range(len(A[0])):
			
			# top-left corner cell
			if i == 0 and j == 0:
				print(i, j, A[i][j], 1, area)
				area += A[i][j] * 2
				
				if len(A[0]) == 1:
					area += A[i][j]
				elif A[i][j+1] < A[i][j]:
						area += A[i][j] - A[i][j+1]
						
				if len(A) == 1:
					area += A[i][j]
				elif A[i+1][j] < A[i][j]:
					area += A[i][j] - A[i+1][j]
					
			# top-right corner cell
			elif i == 0 and j == len(A[0]) - 1:
				print(i, j, A[i][j], 2, area)
				area += A[i][j] * 2
				
				if len(A) == 1:
					area += A[i][j]
					
					if A[i][j-1] < A[i][j]:
						area += A[i][j] - A[i][j-1]
				else:
					
					if A[i][j-1] < A[i][j]:
						area += A[i][j] - A[i][j-1]
					
					if A[i+1][j] < A[i][j]:
						area += A[i][j] - A[i+1][j]
					
			# bottom-left corner cell 
			elif i == len(A) - 1 and j == 0:
				print(i, j, A[i][j], 3, area)
				area += A[i][j] * 2
				
				if len(A[0]) == 1:
					area += A[i][j]
					
					if A[i-1][j] < A[i][j]:
						area += A[i][j] - A[i-1][j]
				else:
					
					if A[i][j+1] < A[i][j]:
						area += A[i][j] - A[i][j+1]
				
					if A[i-1][j] < A[i][j]:
						area += A[i][j] - A[i-1][j]
			# bottom-right corner cell
			elif i == len(A) - 1 and j == len(A[0]) - 1:
				print(i, j, A[i][j], 4, area)
				area += A[i][j] * 2
				
				if A[i][j-1] < A[i][j]:
					area += A[i][j] - A[i][j-1]
				
				if A[i-1][j] < A[i][j]:
					area += A[i][j] - A[i-1][j]
			# boundary cells
			elif i == 0 or i == len(A) - 1 or j == 0 or j == len(A[0]) - 1:
				print(i, j, A[i][j], 5, area)
				area += A[i][j]
				
				if len(A[0]) == 1:
					area += A[i][j]
				else:
					if j == 0:
						if A[i][j+1] < A[i][j]:
							area += A[i][j] - A[i][j+1]
					elif j == len(A[0]) -1:
						if A[i][j-1] < A[i][j]:
							area += A[i][j] - A[i][j-1]
					else:
						if A[i][j+1] < A[i][j]:
							area += A[i][j] - A[i][j+1]
						if A[i][j-1] < A[i][j]:
							area += A[i][j] - A[i][j-1]
						
				if len(A) == 1:
					area += A[i][j]
				else:
					if i == 0:
						if A[i+1][j] < A[i][j]:
							area += A[i][j] - A[i+1][j]
					elif i == len(A) - 1:
						if A[i-1][j] < A[i][j]:
							area += A[i][j] - A[i-1][j]
					else:
						if A[i+1][j] < A[i][j]:
							area += A[i][j] - A[i+1][j]
						if A[i-1][j] < A[i][j]:
							area += A[i][j] - A[i-1][j]
					
			# other cells
			else:
				print(i, j, A[i][j], 6, area)
				if A[i][j-1] < A[i][j]:
					area += A[i][j] - A[i][j-1]
				if A[i][j+1] < A[i][j]:
					area += A[i][j] - A[i][j+1]
				if A[i-1][j] < A[i][j]:
					area += A[i][j] - A[i-1][j]
				if A[i+1][j] < A[i][j]:
					area += A[i][j] - A[i+1][j]
					
			area += 2
	
	# add top and bottom surface area
	#area += 2 * (len(A) * len(A[0]))
	
	return  area

A = []
H = int(input())
for _ in range(H):
	A.append(list(map(int, input().rstrip().split())))
print(surfaceArea(A))
