# 1.Example : -
age=25
print("Age=", age,"years")

result=age>12 and age<20    #two statement right = return true
print("age>12 and age<20=",result)

result=age>12 or age<20    #one statement right = return true
print("age>12 or age<20=",result)

result= not age>12        #if the statement is right = return false
print("not age>12=",result)

# 2.Example : -
c1=11 
print ("class-",c1) 
result=c1==10 or c1==11 
print("cl==10 or cl==11-",result) 

result=not(c1==10) 
print("not(c1==10)=",result) 

result=not 10>20 or 2==3 and 6!=7
#Rule wise First Prefarance "not" then "and" then "or" 
print("not 10>20 or 2==3 and 6!=7", result) 
result= not ((10>20 or 2==3) and 6!=7)
#inner bracket age kj korlo pore onno bracket last a not 
print("not ((10>20 or 2==3) and 6!=7)",result) 
result= not not 10==20
print("not not 10==20=",result)
result= not not True
print("not not True=",result)
# Right hand side true then return string
print("3!=2 and 'Malay'=",3!=2 and 'Malay')
# Right hand side False then return false
print("3==3 and 'Malay'=",3==2 and 'Malay')
#or oposite of and 
# Right hand side true then return true
print("3!=2 or 'Malay'=",3!=2 or 'Malay')
# Right hand side False then return string
print("3==3 or 'Malay'=",3==2 or 'Malay')
