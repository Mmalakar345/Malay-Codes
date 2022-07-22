# 1. Find sum of the series sum=1/2 + 2/3 +3/4......... 10 terms

# sum=0
# numerator=1

# while numerator<=5:
#     sum=sum+ numerator/(numerator+1)
#     numerator+=1
#     # out of the loop
# print("Sum of the series=", sum)



# 2. sum=1/5+2/10+3/15.......10 terms

# sum=0
# numerator=1
# denumerator=5
# while numerator<=10:
#     print(numerator/denumerator,end=" ")
#     sum=sum+ numerator/denumerator
#     numerator+=1
#     denumerator+=5
#     # out of the loop
# print("Sum of the series=", sum)



# 3. Find the sum of the following series-
# sum =(a+1)^2/5 + (a+3)^4/10 + (a+5)^6/15 + ...... n terms

# a=int(input("Enter vslue for a"))
# n=int(input("enter Total number of terms"))
# sum=0
# for i in range(1,n+1):
#     sum+= (a+i*2-1)**(i*2)/(i*5)
# print("sum of the series=",sum)


# 4.print the given series : 1+2+4+8+16+32+64=.... upto n terms

# sum=int(input("Enter the value of n "))
# term=1
# for i in range(1,sum+1):
#      print(term,end="_")
#      sum=sum+term
#      term=term*2
# print("Sum of the series=",sum)



# 5. Find sum of the following series...
#s=2/7-5/11+8/15-11/19.........+20/31

sum=0.0
count=1
nume=2.0
deno=7.0
while count<=6:
    if count%2==0:
        sum=sum-nume/deno
    else:
        sum=sum+nume/deno
    nume+=3
    deno+=4
    count+=1
print("Sum of the series=",sum)

