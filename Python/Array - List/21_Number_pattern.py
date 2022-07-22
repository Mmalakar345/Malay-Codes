# Write a program to print this list [10, 8, 6, 4, 2, 1, 3, 5, 7, 9]
n=[]
for i in range(1,11):
    if i not in n:
        n.append(i)
    n.reverse()
print(n)

# Output steps
#1
#A.1 2
#R.2 1
#A.2 1 3
#R.3 1 2
#A.3 1 2 4
#R.4 2 1 3
#A.4 2 1 3 5
#R.5 3 1 2 4
#A.5 3 1 2 4 6
#R.6 4 2 1 3 5
#A.6 4 2 1 3 5 7
#R.7 5 3 1 2 4 6
#A.7 5 3 1 2 4 6 8
#R.8 6 4 2 1 3 5 7
#A.8 6 4 2 1 3 5 7 9
#R.9 7 5 3 1 2 4 6 8
#A.9 7 5 3 1 2 4 6 8 10
#R.10 8 6 4 2 1 3 5 7 9