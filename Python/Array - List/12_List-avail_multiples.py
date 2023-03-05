# Find a user input numbers multiple which avail in the list or not

list1=eval(input("Enter few number in a list ==> "))
num=int(input("Enter a number to search ==> "))
check=False
for val in list1:
    if val%num==0:
        check=True
        print(val,"is multiple of ==> ",num)
if check==False:
    print("No multiple is found")
    
###################################################################
                       ## Same output different code ##
# Find a user input numbers multiple which avail in the list or not

# list1=eval(input("Enter few number in a list ==> "))
# search=int(input("Enter a number to search ==> "))
# count=0
# # Searching
# for i in range(0,len(list1)):
#     if list1[i]%search==0:
#         print(search,"Multiple is =",list1[i])
#         count=count+1
# if count==0:
#     print("no multiples is found")