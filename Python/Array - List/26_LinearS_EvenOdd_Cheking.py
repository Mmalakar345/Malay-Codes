
# Input 10 integers in a list and then print all the odd numbers 
# which are less than 30 and print all the even numbers which are more than 50
# also count total numbers odd numbers which are less than 30 and all the even
# numbers which are morethan 50
# Application of Linear Search

L=eval(input("Enter 10 integers in a list ==> "))
counteven=0
countodd=0
print("All the odd numbers which are less than 30:- ")
for val in L:
    if val%2==1 and val<30:
        print(val)
        countodd=countodd+1
print("All the odd numberd which are more than 50:-")
for val in L:
    if val%2==0 and val>50:
        print(val)
        counteven=counteven+1
print("Total odd numbers which are less than 30:-",countodd)
print("Total even numbers which are more than 50:-",counteven)