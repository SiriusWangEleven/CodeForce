has_letter = {}
for i in range (0, 3):
    letter = chr(ord('a') + i)
    has_letter[letter] = 0

str_abc = input()
now = 'a'
valid = True
for char in str_abc:
    if(char < now):
        valid = False
        break
    now = char
    has_letter[char] += 1

# print(has_letter)

if valid == False or has_letter['a'] * has_letter['b'] * has_letter['c'] == 0 or (has_letter['a'] != has_letter['c'] and has_letter['b'] != has_letter['c']):
    print("NO")
else:
    print("YES")