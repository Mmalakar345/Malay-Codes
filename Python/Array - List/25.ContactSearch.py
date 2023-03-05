list=[["Ajay",7625469482],["Jyothi",8315496548],["David",8952169352],["Remya",6500052984],["Kartika",9005269213],["Vijay",820003664]]
src=input("Enter a name==> ")
result=[]
for i in list:
    if i[0]==src:
        result.append(i)
if i[0]!=src:
        print("Invalid input")
print(result)