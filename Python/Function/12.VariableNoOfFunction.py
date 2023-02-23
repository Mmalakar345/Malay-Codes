# write a program and difine how to work parameters and how to get run time error for the reason wrong parameter mention.?

def test(n1,n2,n3=30):
    print(n1+n2+n3)
test(1,2,3)# Method call
#pass three parameter fine run properly
test(1,2) # Method call
#pass two parameter & run properly because 3rd parameter mention on defline
test(1) # Method call
#pass one parameter & get run time error because 2nd or 3rd parameter not mention 
test() # Method call
#no parameter mention so get run time error  


