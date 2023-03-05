# write a program to input a list and find each elements multiple present on the list.
# if multiple pressent on the list then the number add an other empty list and,
# print regular list and new multiple elements list.
list = eval(input("Enter few number in a list ==> "))
match = []
for i in range(1,len(list)):
    if list[i]%list[i-1]==0:
        match.append(list[i])
print("List of multiple is ==> ",match)