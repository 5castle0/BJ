#11723
import sys

data = set()

n = int(sys.stdin.readline())

for i in range(n):
    command = sys.stdin.readline().split()
    if command[0]=='add':
        data.add(command[1])
    elif command[0]=='remove':
        if command[1] in data:
            data.remove(command[1])
    elif command[0]=='check':
        if command[1] in data:
            print(1)
        else:
            print(0)
    elif command[0]=='toggle':
        if command[1] in data:
            data.remove(command[1])
        else:
            data.add(command[1])
    elif command[0]=='all':
        data=set(str(i) for i in range(1,21))
    else:
        data=set()