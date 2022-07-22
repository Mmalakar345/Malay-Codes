# n=int(input("How many score?"))
# if n<2 or n>10:
#     print("error")
# else:
#     li=[]
#     for i in range(n):
#         li.append(int(input("Enter a number")))
#     li.sort()
#     print(li)
#     pos=li.index(max(li))
#     print("Score of li")
###############################################################
# i=10
# while i>=5:
#     print(i,end=" ")
#     i-=1

# for v in range(10,4,-1):
#     print(v,end=" ")

##############################################################

# `num=2343
# digit=num%10
# print(digit)
# num//=10
# print(num)


# for i in range(1,10):
#     for j in range(1,i+1):
#         print(i,end=". ")
#     print()
#         # print(j,end=" ")

# def isPalindrome(num):
#     rev=0 
#     copy=num 
#     while copy>0: 
#         rev=rev*10+copy%10 
#         copy=copy//10 
#     if rev==num: 
#         print("This is a Palindromic number") 
#     else: 
#         print("This is not a palindromic number") 
# ## main
# n=int(input("Enter a positive number")) 
# isPalindrome(n) ## Methode call



# digit=int(input("Enter a positive number")) 
# if digit%2==1: 
#     print("oddnsum")
# else:
#     print("evensum")
    
# digit=int(input("Enter a positive number")) 
# if digit%2==1: 
#     print("oddnsum")
# else:
#     print("evensum")
# import math
# print(math.factorial(5))

# print('"India123".isalnum()=',"India ".isalnum())
# print(ord('A'))


# for row in range(5,0,-1):
#     for col in range(1,row+1):
#         print('#',end=" ")
#     print() 


# import turtle
# t = turtle.Turtle()
# t.color('green')
# t.penup()
# t.goto(0,200)
# t.pendown()

# style = ('courier',30,'italic')
# t.write('W',font=style,move=False)
# t.forward(30)
# t.write('r',font=style,move=False)
# t.forward(30)
# t.write('i',font=style,align='right',move=False)
# t.forward(30)
# t.write('t',font=style,align='right',move=False)
# t.forward(30)
# t.write('e',font=style,align='right',move=False)

# t.forward(40)
# t.write('A',font=style,align='center',move=False)
# t.forward(30)
# t.write('n',font=style,align='center',move=False)
# t.forward(30)
# t.write('y',font=style,align='center',move=False)
# t.forward(30)
# t.write('t',font=style,align='center',move=False)
# t.forward(30)
# t.write('h',font=style,align='center',move=False)
# t.forward(30)
# t.write('i',font=style,align='center',move=False)
# t.forward(30)
# t.write('n',font=style,align='center',move=False)
# t.forward(30)
# t.write('g',font=style,align='center',move=False)

# line=input("Enter a sentence=>")





# line=("i am a good boy.she is a programmer.he is an army.hurry joy")

# li=line.split(".") # returns a list of strings
# # print(li)
# for new in li:
#     words=new.split()
#     print()
#     reverse=""
#     print("word <===> reverse")
#     for word in words: # get each word
#         List=list(word) # String to list conversion
#         List.reverse()
#         for ch in List: # List to string conversion
#             reverse=reverse+ch
#         print(word," <===> ",reverse)
#         reverse=""


# li=eval(input("Enter a sentence"))
# search=input("search the a word")
# new=sorted(li)
# if search in li:
#     print("found")
# else:
#     print("NOt found")



















