n = int(input())
str_list = list(map(int, list(input())))
# print(str_list)
cnt = [0, 0]
for i in range(n):
    cnt[str_list[i]] += 1
ans = ""
if cnt[1] >= 1:
    ans = "1"
while cnt[0] > 0:
    ans += "0"
    cnt[0] -= 1
print(ans)