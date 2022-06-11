# Write a UDF program to check your email id is valid of not

emailid=input("Enter your email id=")
index=emailid.find("@")
if index==-1:
    print("Invalide Email Id")
else:
    username=emailid[0:index]
    domain=emailid[index+1:]
    print("user name ",username)
    print("Domain name ",domain)