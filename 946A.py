n = input()
numbers = input().split()

b = 0
c = 0

for i in numbers:
    i = int(i)
    if i < 0:
        c += i
    else:
        b += i


print(b-c)