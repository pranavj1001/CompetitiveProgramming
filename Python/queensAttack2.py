# The question for this solution can be found at https://www.hackerrank.com/challenges/queens-attack-2/problem

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the queensAttack function below.
def queensAttack(n, k, r_q, c_q, obstacles):

    count = 0

    if n == 1:
        return count

    # Co-ordinates of obstacle in up, right, down, left direction
    uR = -1
    uC = -1
    rR = -1
    rC = -1
    dR = -1
    dC = -1
    lR = -1
    lC = -1
    # Co-ordinates of obstacle in up-right, right-down, down-left, left-up direction
    urR = -1
    urC = -1
    rdR = -1
    rdC = -1
    dlR = -1
    dlC = -1
    luR = -1
    luC = -1

    for obj in obstacles:
        oR = obj[0]
        oC = obj[1]

        # check in up direction
        if (oR > r_q and oC == c_q) and (uR == -1 or oR < uR):
            uR = oR
            uC = oC
        # check in up-right direction
        elif ((oR - r_q == oC - c_q) and oR > r_q and oC > c_q) and (urR == -1 or oR < urR):
            urR = oR
            urC = oC
        # check in right direction
        elif (oC > c_q and oR == r_q) and (rC == -1 or oC < rC):
            rR = oR
            rC = oC
        # check in right-down direction
        elif ((r_q - oR == oC - c_q) and oR < r_q and oC > c_q) and (rdC == -1 or oC < rdC):
            rdR = oR
            rdC = oC
        # check in down direction
        elif (oR < r_q and oC == c_q) and (dR == -1 or oR > dR):
            dR = oR
            dC = oC
        # check in down-left direction
        elif ((r_q - oR == c_q - oC) and oR < r_q and oC < c_q) and (dlC == -1 or oC > dlC):
            dlR = oR
            dlC = oC
        # check in left direction
        elif (oC < c_q and oR == r_q) and (lC == -1 or oC > lC):
            lR = oR
            lC = oC
        # check in left-up direction
        elif ((oR - r_q == c_q - oC) and oR > r_q and oC < c_q) and (luR == -1 or oR < luR):
            luR = oR
            luC = oC

    print(uR, uC)
    print(urR, urC)
    print(rR, rC)
    print(rdR, rdC)
    print(dR, dC)
    print(dlR, dlC)
    print(lR, lC)
    print(luR, luC)

    # calculate distance from obstacle in each direction
    count += uR - r_q - 1  if (uR != -1)  else n - r_q
    count += urR - r_q - 1 if (urR != -1) else min(n - r_q, n - c_q)
    count += rC - c_q - 1  if (rC != -1)  else n - c_q
    count += rdC - c_q - 1 if (rdR != -1) else min(r_q - 1, n - c_q)
    count += r_q - dR - 1  if (dR != -1)  else r_q - 1
    count += r_q - dlR - 1 if (dlR != -1) else min(r_q - 1, c_q - 1)
    count += c_q - lC - 1  if (lC != -1)  else c_q - 1
    count += c_q - luC - 1 if (luC != -1) else min(n - r_q, c_q -1)

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
