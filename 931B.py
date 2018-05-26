n, a, b = map(int, input().split())
cnt = 0

while(n>2):
    cnt += 1
    if(a%2==1):
        a +=1
    if(b%2==1):
        b +=1
    if (a==b):
        break
        
    a = a//2
    b = b//2
    n/=2


if(n==2 and a + b == 3):
    print("Final!")
else:
    print(cnt)