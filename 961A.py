n, m = map(int, input().split())
cnt = [0 for i in range(n+1)]
cnt[0] = 1005

for i in list(map(int, input().split())):
    cnt[i] += 1
print(min(cnt))