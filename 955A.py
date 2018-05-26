hh, mm = map(int, input().split())
h, d, c, n = map(int, input().split())


def calSum(h,n,c):
    to_buy = h//n
    if h%n!=0:
        to_buy += 1
    return to_buy * c

ans_0 = calSum(h,n,c)
# print(ans_0)

time_left = 0
if(hh < 20):
    time_left = (20 - hh) * 60 - mm
else:
    time_left = 0

h = h + time_left * d
ans_8 = calSum(h,n,c) * 0.8
# print(ans_8)
print(min(ans_0,ans_8))