n = int(input())
a = list(map(int, input().split()))
s = []
tmp = 0
for i in range(n):
    tmp += a[i]
    s.append(tmp)
half = s[n - 1] / 2

for i in range(n):
    if s[i] >= half:
        print(i + 1)
        exit()