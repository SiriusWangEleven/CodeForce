import math

def isSubString(str_s, str_t):
    i = 0
    j = 0

    while i < len(str_s) and j < len(str_t):
        if (str_s[i] == str_t[j]):
            i += 1
            j += 1
        else:
            i += 1
    if j == len(str_t):
        return True
    return False


str_s = input()

for i in range(int(math.sqrt(int(str_s))), 0, -1):
    now = i ** 2
    if isSubString(str_s, str(now)):
        print(len(str_s) - len(str(now)))
        exit()
print(-1)