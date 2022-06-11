# 1. print the given series : 2 5 10 17 26 37 .... upto n terms

# sum=0
# n= int(input("Enter the terms number"))

# for i in range(1,n+1):
#     sum=(i*i)+1
#     print(sum)



# 2. print the given series : 2 6 12 20 30 42 56.... upto n terms

# sum=0
# n= int(input("Enter the terms number"))

# for i in range(1,n+1):
#     sum=(i*i)+i 
#     print(sum,end=" ")



# 3. print the given series : 3 6 12 24 48 96.... upto n terms

# count=1
# term=3
# while count<=10 :
#      print(term,end="_")
#      term=term*2
#      count=count+1




# 4. print the given series : x+x/3+x/5+x/7.... upto n terms

x=int(input("Value of x= "))
sum=0
for i in range(1,11):
    sum=sum+x/((i*2)-1)
print("Sum of the series=", sum)
        



