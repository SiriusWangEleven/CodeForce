r, c = map(int, input().split())
mmap = []
for i in range(0, r):
    mmap.append(list(input()))

# print(mmap)
for i in range(0, r):
    for j in range(0, c):
        if(mmap[i][j] == 'W'):
            if i - 1 >=0:
                if(mmap[i - 1][j]=='.'):
                    mmap[i - 1][j] = 'D'
                elif (mmap[i - 1][j]=='S'):
                    print("No")
                    exit()
            if i + 1 < r:
                if(mmap[i + 1][j]=='.'):
                    mmap[i + 1][j] = 'D'
                elif (mmap[i + 1][j]=='S'):
                    print("No")
                    exit()
            if j - 1 >=0:
                if(mmap[i][j-1]=='.'):
                    mmap[i][j-1] = 'D'
                elif (mmap[i][j-1]=='S'):
                    print("No")
                    exit()
            if j+1<c:
                if(mmap[i][j+1]=='.'):
                    mmap[i][j+1] = 'D'
                elif (mmap[i][j+1]=='S'):
                    print("No")
                    exit()

print("Yes\n" + "\n".join(["".join(list_i) for list_i in mmap]))
