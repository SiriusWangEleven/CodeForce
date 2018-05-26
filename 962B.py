n, a, b = map(int, input().split())
string = input()
pos = [0] * n
for i in range(n):
    if string[i] == '*':
        pos[i] = -1
pos.insert(0, -1)
tmp = a + b
for i in range(1, n + 1):
    if a + b == 0:
        break
    if pos[i] == 0:
        if pos[i - 1] <= 0:
            if a > b:
                a -= 1
                pos[i] = 1
            elif b > 0:
                b -= 1
                pos[i] = 2
        elif pos[i - 1] == 1 and b > 0:
            b -= 1
            pos[i] = 2
        elif pos[i - 1] == 2 and a > 0:
            a -= 1
            pos[i] = 1
# print("a==", a, "b==", b)
# print(pos)
print(tmp - a - b)