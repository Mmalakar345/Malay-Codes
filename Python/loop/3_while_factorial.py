# Factorial of a positive number
carry=int(input("Enter a positive number"))
fact=1                          # 1*2*3*4       
i=1                             # 2*3*4        fact er modhe gun fol ta store kora hoi
while i<=carry:                 # 6*4          in 1*2*3*.... kore increase hoye loop ta 
   fact=fact*i                  # 24           ran korai
   i=i+1
print("Factorial of carry Number =",carry,'is =',fact)

# Factorial of a positive number
# this code is accept all positive and negative number
num=int(input("Enter a positive number"))
if num<0:
    print("Invalid Input")
else:
    fact=1
    i=1
    while i<=num:
       fact=fact*i
       i=i+1
    print("Factorial of num =",num,'is =',fact)
   #  print(f"positive num is= {num} factoral is= {fact}")

