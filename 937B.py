this_line = input().split()
p = int(this_line[0])
y = int(this_line[1])

ans = -1
while(y>p):
    find = True

    right = min(p+1, int(y**0.5) + 1)

    for i in range(2, right):
        if(y%i==0):
            find = False
            break
    if(find):
        ans = y
        break
    
    y -=1




print(ans)