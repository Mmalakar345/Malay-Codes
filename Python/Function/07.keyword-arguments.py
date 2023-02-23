## user=defined function and keyword/named arguments
def getSumAndDifference(n1,n2): # Formal Parameter
    sum=n1+n2
    diff=n1-n2
    return sum,diff
## main ##
## Function call with keyword arguments--argument and parameter names must be same
sum,diff=getSumAndDifference(n1=10,n2=2) #### Actual Parameter
print("Sum == > ",sum)
print("Difference == > ",diff)
## Function call with keyword arguments--order of passint dose not meter
sum,diff=getSumAndDifference(n2=30,n1=42) #### Actual Parameter
print("Sum == > ",sum)
print("Difference == > ",diff)