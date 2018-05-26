k, n, s, p = map(int, input().split())

sheets = n // s
if sheets * s != n:
    sheets += 1
sheets *= k
packs = sheets // p
if packs * p != sheets:
    packs += 1
print(packs)