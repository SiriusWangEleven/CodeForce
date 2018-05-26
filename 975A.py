n = int(input())
aramic = list(input().split())
# print(aramic) 

lists = []

for string in aramic:
    lists.append(sorted(set(list(string))))
# print(lists)

ans = n
for i in range(1, n):
    for j in range(0, i):
        if(lists[i] == lists[j]):
            ans -= 1
            break
print(ans)   