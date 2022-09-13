
fact=1
num=int(input("Enter a positive vaiue"))

if num<0:
    print("Invalde Input")
else:
     for count in range(1,num+1):
        fact=fact*count
print(f"positive num is= {num} factoral is= {fact}")
# alternate line # print("positive num is=",num,"factoral is=",fact)
        
        
