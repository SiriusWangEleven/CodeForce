n = int(input())

if(n<=5):
    print(-1)
else:
    print("\n".join(["1 "+str(i) for i in range(2, 5)]))
    end = False
    ans = []
    head = 2
    while(True):
        i = head
        j = i + 3
        while(j <= i+5):
            tmp_ans = str(i) + ' ' + str(j)
            ans.append(tmp_ans)
            if(j==n):
                end = True
                break
            j += 1
        if(end):
            break
        head += 3
    
    print("\n".join(ans))


print("\n".join(["1 "+str(i) for i in range(2, n+1)]))