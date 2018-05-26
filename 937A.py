n = int(input())
seq = input().split()
numbers = []
for s in seq:
    numbers.append(int(s))

numbers = set(numbers)

ans = 0

for number in numbers:
    if number > 0:
        ans += 1


print(ans)