import heapq
n, k1, k2 = map(int, input().split())
list1 = list(map(int, input().split()))
list2 = list(map(int, input().split()))
dis = []

for i in range(n):
    dis.append(0 - abs(list1[i]-list2[i]))

heapq.heapify(dis)

# print(dis)
num = k1 + k2

while num > 0 :
    tmp = heapq.heappop(dis)
    if(tmp == 0):
        break
    tmp += 1
    heapq.heappush(dis, tmp)
    num -= 1

if(num > 0):
    if(num % 2 == 1):
        print(1)
    else:
        print(0)
else:
    num = 0
    for i in dis:
        num += i**2
    print(num)