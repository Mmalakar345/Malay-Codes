#Reva has created a dictionary containing Product names and prices as key value pairs
#of 4 products. Write a user defined function for the following:
#● PRODPUSH() which takes a list as stack and the above dictionary as the parameters.
#Push the keys (Pname of the product) of the dictionary into a stack, where the
#corresponding price of the products is less than 6000. Also write the statement to call
#the above function.
#For example: If Reva has created the dictionary is as follows:
#Product={"TV":10000, "MOBILE":4500, "PC":12500, "FURNITURE":5500}
#The output from the program should be: [ ‘FURNITURE’, ‘MOBILE’]

# def push(num):
#     global stack
#     if num%5==0 and num%3==0:
#         stack.append(num)
# def pop():
#     global stack
#     if stack!=[]:
#         print(stack.pop(),end=" ") 
#         return 0
#     else:
#         return None  
# stack=[]
# # L=eval(int(input("enter 8 time number=")))
# L=[5,15,21,30,45,50,60,75]
# for num in L:
#     push(num)    
# while True:
#     if pop()==None:
#         break

def push(key):
    global stack
    if employee[key]<85000:
        stack.append(key)
def pop():
    global stack,name
    name+=stack.pop()+" "
    return name  
employee={"Ajay":76000,"Jyothi":150000,"David":89000,"Remya":65000,"Kartika":90000,"Vijay":82000}
stack=[]
for key in employee:
    push(key)
name=""
for i in range(len(stack)):
    name=pop()
print(name)