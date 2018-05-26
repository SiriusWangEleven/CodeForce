test_str = input()

mmap = {}

for c in test_str:
    if c in mmap.keys():
        mmap[c] = mmap[c] + 1
    else:
        mmap[c] = 1

num = len(mmap.keys())

if (num > 4 or num <=1):
    print("No")
elif (num==2):
    for key,value in mmap.items():
        if(value <2):
            print("No")
            exit()
    print("Yes")
elif (num==3):
    if(sum(mmap.values()) < 4):
        print("No")
    else:
        print("Yes")
else:
    print("Yes")