#Reva has created a dictionary containing Product names and prices as key value pairs of 4 products. Write a user defined function for the following:
#● PRODPUSH() which takes a list as stack and the above dictionary as the parameters.
#Push the keys (Pname of the product) of the dictionary into a stack, where the corresponding price of the products is less than 6000. Also write the statement to call
#the above function.
#For example: If Reva has created the dictionary is as follows:
#Product={"TV":10000, "MOBILE":4500, "PC":12500, "FURNITURE":5500}
#The output from the program should be: [ ‘FURNITURE’, ‘MOBILE’]
productlist=[]
def PRODPUSH(key):
    productlist.append(key)
    
dict={"TV":10000, "MOBILE":4500, "PC":12500, "FURNITURE":5500}
for key in dict:
    if dict[key]<6000:
       PRODPUSH(key) 
print(productlist)