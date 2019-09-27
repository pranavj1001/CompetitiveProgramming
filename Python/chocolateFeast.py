def chocolateFeast(n, c, m):
	
	count = int(n / c)
	wrappers = count
	
	while(wrappers >= m):
		newChocolates = int(wrappers / m)
		count += newChocolates
		wrappers -= (newChocolates * m)
		wrappers += newChocolates
	
	return count
	
cash = int(input())
costOfOneBar = int(input())
wrappersToGetAChocolate = int(input())

print(chocolateFeast(cash, costOfOneBar, wrappersToGetAChocolate))