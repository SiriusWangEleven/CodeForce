a, b = map(int, input().split())

while(True):
    c = a//(2*b)
    a -= c*2*b
    if(a == 0):
        break
    d = b//(2*a)
    b -= d*2*a
    if(d==0 or b == 0):
        break

print(str(a) + ' ' + str(b))
