a = input()
now = 'a'
ans = ""

def increChar(c):
    return chr(ord(c)+1)


for i in range(0, len(a), 1):
    if(a[i]<=now and now <= 'z'):
        ans += now
        now = increChar(now)
    else:
        ans += a[i]

if(now <= 'z'):
    print(-1)
else:
    print(ans)