a, b, c = map(int, input().split())
mina = min(a,b)
maxb = max(a,b)

if(mina + c <= maxb):
    print((mina + c)*2)
else:
    print((a+b+c)//2 * 2)