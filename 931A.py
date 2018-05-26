a = int(input())
b = int(input())

c= abs(a-b)//2


def getSum(a):
    if a <=1:
        return a
    else:
        return (1+a)*a//2

if abs(a-b)%2 == 0 :
    ans = getSum(c) * 2
else:
    ans = getSum(c) + getSum(c + 1)

print(ans)