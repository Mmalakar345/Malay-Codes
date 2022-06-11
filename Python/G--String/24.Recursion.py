# A raised to the power b

def power(a,b):
    if b==0:   # Base criteria
        return 1.0
    else:
        return a*power(a,b-1)  #Recursive call
#  return 2.0*(returm 2.0* return 2.0 * 1)   
a=float(input("Enter a number"))
b=int(input("Enter the power"))
print(a,"raised to the power of ",b ," is",power(a,b))
# Internal Operation
# power(2,3)
# return 2.0 * power(2.0,2)
# return 2.0 * return 2.0 * power(2.0,1)
# return 2.0 * return 2.0 * return 2.0 * power(2.0,0)
# return 2.0 * 2.0 * 2.0 * 1.0
# return 2.0 * 2.0 * 2.0
# return 2.0 * 4.0
# return 8.0
 