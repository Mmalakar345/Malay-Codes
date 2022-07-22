## Positional parameter- where position of the peremeter matters.
def getdifference(n1,n2):
    diff=n1-n2
    print("Difference=",diff)
## main
n1=int(input("Enter first number"))
n2=int(input("Enter first number"))
getdifference(n1,n2)
## Function call with keyword arguments--order of passint dose not meter
getdifference(n2,n1)