# The Question for this problem can be found at https://www.hackerrank.com/challenges/append-and-delete/problem

def appendAndDelete(s, t, k):
    s = s.strip()
    t = t.strip()
        
    c = 0
    for i in s:
        if (len(t) > c):
            if i != t[c]:
                break
            c = c + 1
            
    if ((len(s) - c) + (len(t) - c)) > k:
    	return 'No'
    elif (((len(s) - c) + (len(t)  - c)) % 2 == k % 2):
        return 'Yes'
    elif (len(s) + len(t) - k) < 0: 
        return 'Yes'
    else:
        return 'No'

s = input()

t = input()

k = int(input())
result = appendAndDelete(s, t, k)

print(result)
