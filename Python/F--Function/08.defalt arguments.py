# User -- defined function returning multiple values and defalt arguments

def getSumAndDifference(num1,num2=30):
    sum=num1+num2
    diff=num1-num2
    return sum,diff
## main ##
n1=int(input("Enter one number"))
n2=int(input("Enter another number"))

## Function call with less than 2 arguments
sum,diff=getSumAndDifference(n1)
print("Sum=",sum)
print("Difference=",diff)
## Function call with exact number of arguments
sum,diff=getSumAndDifference(n1,n2)
print("Sum=",sum)
print("Difference=",diff)