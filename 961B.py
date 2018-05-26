n, t = map(int, input().split())

theory = list(map(int, input().split()))
awake = list(map(int, input().split()))

have = 0
for i in range(0, n):
    if(awake[i] == 1):
        have += theory[i]
        theory[i] = 0

# print(have)
# print(theory)
sum_theory = []
tmp = 0
for i in range(0, n):
    tmp += theory[i]
    sum_theory.append(tmp)
# print(sum_theory)

tmp = sum_theory[t-1]
for i in range(0, n-t):
    tmp = max(tmp, sum_theory[i+t] - sum_theory[i])

# print(tmp)

print(have + tmp)