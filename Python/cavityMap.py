# The question for this solution can be found at https://www.hackerrank.com/challenges/cavity-map/problem

def cavityMap(grid):
	for i in range(1, len(grid) - 1):
		test = grid[i][0]
		for j in range(1, len(grid) - 1):
			num = int(grid[i][j])
			print(num)
			if (grid[i-1][j] != 'X' and num > int(grid[i-1][j]) and grid[i][j+1] != 'X' and num > int(grid[i][j+1]) and grid[i+1][j] != 'X' and num > int(grid[i+1][j]) and grid[i][j-1] != 'X' and num > int(grid[i][j-1])):			
				test += 'X'
			else:
				test += grid[i][j]
		test += grid[i][len(grid) - 1]
		grid[i] = test
	return grid
	
grid = list(input().rstrip().split())
print('\n'.join(cavityMap(grid)))