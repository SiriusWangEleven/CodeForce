n, m, k = map(int, input().split())
now = [1,1]

if k <= n-1:
    now[0] += k
else:
    now = [n, 2]
    k -= n

    loop = k//(2*(m-1))
    now = [n-2*loop, 2]
    k %= (2*(m-1))

    if k <= m - 2:
        now[1] += k
    elif k <= m -1:
        now[0] -= 1
        now[1] = m
    else:
        now[0] -= 1
        now[1] = m - (k - m + 1)

print(" ".join([str(x) for x in now ]))
