n, s = map(int, input().split())

takeOFF = 0
landing = []

for i in range(n):
    land_h, land_m = map(int, input().split())
    landing.append(land_h*60 + land_m)
landing.append(2000)

def countHM(time):
    h = time // 60
    m = time % 60
    return h, m

if takeOFF + 1 + s <= landing[0]:
    print("0 0")
else:
    for i in range(n):
        if landing[i+1] - landing[i] >= 2 + 2*s:
            h, m = countHM(landing[i] + 1 + s)
            print(str(h) + " " + str(m))
            break