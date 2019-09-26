# The question for this problem can be found at https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=false

import math

def binarySqrt(num):
    low = 0
    high = float(num + 1)
    
    while((high - low) > 0.0001):
        mid = (low + high) / 2
        
        if mid*mid < num:
            low = mid
        else:
            high = mid
            
    return round(low, 4)

def squares(a, b):
    
    rootOfA = binarySqrt(a)
    if (math.ceil(rootOfA) - 0.001) < rootOfA:
    	rootOfA = math.ceil(rootOfA)
    else:
    	rootOfA = math.floor(rootOfA)
    	
    rootOfB = binarySqrt(b)
    if (math.ceil(rootOfB) - 0.001) < rootOfB:
    	rootOfB = math.ceil(rootOfB)
    else:
    	rootOfB = math.floor(rootOfB)
    	
    count = 0
    count = rootOfB - rootOfA
    if rootOfA * rootOfA == a:
    	count = count + 1
    	
    # print(rootOfA, math.ceil(rootOfB) - 0.0000001, binarySqrt(a), binarySqrt(b))
    
    return count
 
a = int(input())
b = int(input())
print(squares(a,b))