stones = list(map(int, input().split()))
# print(stones)
# print()
ans = 0
n = 14

for i in range(n):
    if stones[i] > 0:
        tmpStone = stones[i]
        tmpList = stones[:]
        tmpList[i] = 0
        
        loop = tmpStone // 14
        tmpStone %= 14
        for j in range(n):
            tmpList[j] += loop
        k = (i + 1) % 14
        while tmpStone > 0:
            tmpList[k] += 1
            tmpStone -= 1
            k = (k + 1) % 14
        
        tmpEven = 0
        for j in range(n):
            if tmpList[j] % 2 == 0:
                tmpEven += tmpList[j]
        # print(tmpList)
        ans = max(ans, tmpEven)

print(ans)