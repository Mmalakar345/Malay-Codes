#Write a function in Python PUSH_IN(L), where L is a list of numbers. From this list, push all even numbers into a stack which is implemented by using another list.
# # Type 1 ........

# def push(L):
#     global list
#     list.append(L)
    
# def pop():
#      global list ,item
#      item+=str(list.pop())+" "
#      return item
# list=[]
# for L in range(1,101):
#     if L%2==0:
#         push(L)
        
# # print(list)
# print()
# item=" "

# for i in range(len(list)):
#     item=pop() 
# print(item)

# # Type 2 ........

def push(L):
    global list
    list.append(L)
    
def pop():
     even=0
     if list==[]:
         even=-1
     else:
         even=list.pop()
     return even
# Main
List=[]
for i in range(1,101):
    List.append(i)
list=[]
for L in List:
    if L%2==0:
        push(L)
# print(list)
print()
while True:
    even=pop()
    if even==-1:
        break
    else:
        print(even,end=" ")





