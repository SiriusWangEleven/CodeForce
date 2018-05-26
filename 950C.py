zebra = input()


zebra = '0' + zebra
end0lists = []
end1lists = []
lists = []
now = []

cnt = 0

for i in range(1, len(zebra)):
    if zebra[i] == '0':

        if(len(end1lists) == 0):
            now = []
            now.append(i)
            lists.append(now)
            end0lists.append(cnt)
            cnt += 1
        else:
            now_id = end1lists.pop()
            now = lists[now_id]
            now.append(i)
            end0lists.append(now_id)

        
        

    else:
        if(len(end0lists) == 0):
            print(-1)
            exit()
        else:
            now_id = end0lists.pop()
            now = lists[now_id]
            now.append(i)
            end1lists.append(now_id)
            
if(len(end1lists) > 0):
    print(-1)
    exit()



cnt = len(lists)
print(cnt)

# for list_i in lists:
#     my_str = str(len(list_i))
#     for i in list_i:
#         my_str += ' ' + str(i)
#     print(my_str)




print("\n".join([str(len(list_i)) + " " + " ".join(map(str, list_i)) for list_i in lists]))