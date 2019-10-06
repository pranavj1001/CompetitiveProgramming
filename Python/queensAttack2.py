# The question for this solution can be found at https://www.hackerrank.com/challenges/queens-attack-2/problem
# I'll be uploading another solution for this problem very soon

#!/bin/python3

import math
import os
import random
import re
import sys

def goUp(n, r_q, c_q, obstacles):
    c = 0
    if len(obstacles) == 0:
        c = n - r_q
    else:
        obstacleFound = False
        for i in range(r_q + 1, n + 1):
            for j in obstacles:
                if j[0] == i and j[1] == c_q:
                    obstacleFound = True
                    break
            if obstacleFound:
                break
            else:
                c += 1

    return c

def goUpRight(n, r_q, c_q, obstacles):
    c = 0

    if r_q == n or c_q == n:
        return c
    
    obstacleFound = False
    iteration = 1
    for i in range(r_q + 1, n + 1):
        if c_q + iteration > n or r_q + iteration > n:
            break
        for j in obstacles:
            if (r_q + iteration) == j[0] and (c_q + iteration) == j[1]:
                obstacleFound = True
        if obstacleFound:
            break
        else:
            c += 1
        iteration += 1

    return c

def goRight(n, r_q, c_q, obstacles):
    c = 0
    if len(obstacles) == 0:
        c = n - c_q
    else:
        obstacleFound = False
        for i in range(c_q + 1, n + 1):
            for j in obstacles:
                if j[1] == i and j[0] == r_q:
                    obstacleFound = True
                    break
            if obstacleFound:
                break
            else:
                c += 1

    return c

def goRightDown(n, r_q, c_q, obstacles):
    c = 0

    if r_q == 1 or c_q == n:
        return c
    
    obstacleFound = False
    iteration = 1
    for i in range(r_q - 1 , 0, -1):
        if c_q + iteration > n or r_q - iteration < 1:
            break
        for j in obstacles:
            if (r_q - iteration) == j[0] and (c_q + iteration) == j[1]:
                obstacleFound = True
        if obstacleFound:
            break
        else:
            c += 1
        iteration += 1

    return c

def goDown(n, r_q, c_q, obstacles):
    c = 0
    if len(obstacles) == 0 and r_q > 0:
            c = r_q - 1
    else:
        obstacleFound = False
        for i in range(r_q - 1 , 0, -1):
            for j in obstacles:
                if j[0] == i and j[1] == c_q:
                    obstacleFound = True
                    break
            if obstacleFound:
                break
            else:
                c += 1

    return c

def goDownLeft(n, r_q, c_q, obstacles):
    c = 0

    if r_q == 1 or c_q == 1:
        return c
    
    obstacleFound = False
    iteration = 1
    for i in range(r_q - 1 , 0, -1):
        if c_q - iteration < 1 or r_q - iteration < 1:
            break
        for j in obstacles:
            if (r_q - iteration) == j[0] and (c_q - iteration) == j[1]:
                obstacleFound = True
        if obstacleFound:
            break
        else:
            c += 1
        iteration += 1
    
    return c

def goLeft(n, r_q, c_q, obstacles):
    c = 0
    if len(obstacles) == 0 and c_q > 0:
            c = c_q - 1
    else:
        obstacleFound = False
        for i in range(c_q - 1 , 0, -1):
            for j in obstacles:
                if j[1] == i and j[0] == r_q:
                    obstacleFound = True
                    break
            if obstacleFound:
                break
            else:
                c += 1

    return c

def goLeftUp(n, r_q, c_q, obstacles):
    c = 0

    if r_q == n or c_q == 1:
        return c
    
    obstacleFound = False
    iteration = 1
    for i in range(r_q + 1, n + 1):
        if c_q - iteration < 1 or r_q + iteration > n:
            break
        for j in obstacles:
            if (r_q + iteration) == j[0] and (c_q - iteration) == j[1]:
                obstacleFound = True
        if obstacleFound:
            break
        else:
            c += 1
        iteration += 1

    return c

# Complete the queensAttack function below.
def queensAttack(n, k, r_q, c_q, obstacles):

    count = 0

    if n == 1:
        return count

    count += goUp(n, r_q, c_q, obstacles)
    count += goUpRight(n, r_q, c_q, obstacles)
    count += goRight(n, r_q, c_q, obstacles)
    count += goRightDown(n, r_q, c_q, obstacles)
    count += goDown(n, r_q, c_q, obstacles)
    count += goDownLeft(n, r_q, c_q, obstacles)
    count += goLeft(n, r_q, c_q, obstacles)
    count += goLeftUp(n, r_q, c_q, obstacles)

    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    r_qC_q = input().split()

    r_q = int(r_qC_q[0])

    c_q = int(r_qC_q[1])

    obstacles = []

    for _ in range(k):
        obstacles.append(list(map(int, input().rstrip().split())))

    result = queensAttack(n, k, r_q, c_q, obstacles)

    fptr.write(str(result) + '\n')

    fptr.close()
