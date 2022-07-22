# Dictonary

print("*************** Normal output *********************************")  
dict={3:"Malay",2:"Sunu",8:"Satyabhama"}
print(dict)
print("*************** Loop output *********************************")  
for key in dict:
    print(key,dict[key])
print("*************** Ket constant Value change *********************************")  
# Changing
dict[2]="Sunu Roy"
print(dict)
print("***************** New key value add *****************************")  
dict[10.50]="Riya"
print(dict)
print("********************* Value change ****************************")  
dict[10.50]="Samadrita"
print(dict)
print("********************* New type key value add***************************")  
dict["name"]="Rita Roy"
print(dict)
print("************* key constant value add list************************")  
dict[5]=[1,5,9,7,4]
print(dict)
# A key of a dictonbary can not be a mutable type like list
# print("************* key list value digit ************************")  
# print("************* ERROR ************************")  
# dict[[1,5,9,7,4]]=0
# print(dict)


