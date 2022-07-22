# Write a program of a list type== ex= a,and wtite an program to a's reverse and typeing list also print same time.
## With using loop..

source=eval(input("Enter a list"))
target=[]
for i in range(len(source)-1,-1,-1):
    target.append(source[i])
print(source)
print(target)