n, A, B, C, T = map(int, input().split())
t_list = list(map(int, input().split()))
if C<=B:
    print(n * A)
else:
    ans = 0
    for ti in t_list:
        ans += (T-ti) * (C-B) + A
    print(ans)