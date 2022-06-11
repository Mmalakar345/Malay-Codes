## Write a program of a list type== ex= a,and wtite an program to a's reverse and typeing list also print same time.
## Without using loop

source=eval(input("Enter a list"))
target=[]
for val in source:
    target.append(val)
target.reverse()
print(source)
print(target)
