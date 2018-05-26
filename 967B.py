import heapq

n, A, B = map(int, input().split())

holes = list(map(int, input().split()))
tmpSum = sum(holes)
s1 = holes[0]
del holes[0]

for i in range(n-1):
    holes[i] = 0 - holes[i]
heapq.heapify(holes)
ans = 0

while True:
    if s1 * A >= B * tmpSum:
        break
    top = heapq.heappop(holes)
    tmpSum += top
    ans += 1

print(ans)