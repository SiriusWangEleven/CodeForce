n, k = map(int, input().split())
field = []
for i in range(n):
    field.append(list(input()))



def cnt(x, y):
    if field[x][y] == '#':
        return 0
    
    # calculate horizontally
    hor = 0
    left = 0
    j = y - 1
    while j >= 0 and field[x][j] == '.':
        left += 1
        j -= 1

    right = 0
    j = y + 1
    while j < n and field[x][j] == '.':
        right += 1
        j += 1

    more = max(right, left)
    less = min(right, left)
    hor = min(less + 1 + more - k, less)
    if hor < 0:
        hor = 0
    else:
        hor += 1
        


    # calculte vertically
    ver = 0
    up = 0
    i = x - 1
    while i >= 0 and field[i][y] == '.':
        up += 1
        i -= 1

    down = 0
    i = x + 1
    while i < n and field[i][y] == '.':
        down += 1
        i += 1

    more = max(down, up)
    less = min(down, up)
    ver = min(less + 1 + more - k, less)
    if ver < 0:
        ver = 0
    else:
        ver += 1


    return ver + hor

ans = 0
ansTuple = (0, 0)
for i in range(n):
    for j in range(n):
        count = cnt(i, j)
        # print("i==", i, "j==", j, "count==", count)
        if count > ans:
            ans = count
            ansTuple = (i, j) 
        
        # dicCount[(i,j)] = 0


# print("ans ==", ans)
print(str(ansTuple[0] + 1) + " " + str(ansTuple[1] + 1))
# print(dicCount)