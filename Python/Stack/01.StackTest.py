def push(num):
    global stack
    stack.append(num)
def pop():
    global stack
    item=0
    if stack==[]:
        item=-999
    else:
        item=stack.pop()
    return item
    
# main
stack=[]
list=eval(input("Enter few numbers in a list"))
for val in list:
    if val%2==0:
        push(val)
while True:
    item=pop()
    if item==-999:
        break
    else:
        print("Popped value is=",item)