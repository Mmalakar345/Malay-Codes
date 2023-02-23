
#######################  Type 1   ##########################

# def calculate(amount=8000,discount=20):
#     val=amount*discount/100
#     print("Discount value is",val)
# calculate()



#######################  Type 2   ##########################

# def calculate(amount,discount,qty=3):
#     discountvalue=amount*discount*qty/100
#     return discountvalue
# def display(discountvalue):
#     print("Discount value is",discountvalue)
# display(calculate(5000,6))



#######################  Type 3   ##########################

# def calculate(amount ,discount, quantity):
#     discountvalue=amount*discount*quantity/100
#     return discountvalue

# def display(discountvalue):
#     print("Discount value is",discountvalue)

# def getinput():
#     amount=int(input("Enter the amount = "))
#     discount=int(input("Enter the discount = "))
#     quantity=int(input("Enter the quantity = "))
#     display(calculate(amount ,discount, quantity)) # function call
# # function call
# getinput()



#######################  Type 3   ##########################

def calculate(amount ,discount, quantity):
    discountvalue=amount*discount*quantity/100
    return discountvalue

def display(discountvalue):
    print("Discount value is",discountvalue)

# main input section
amount=int(input("Enter the amount = "))
discount=int(input("Enter the discount = "))
quantity=int(input("Enter the quantity = "))
# function call
display(calculate(amount ,discount, quantity))





