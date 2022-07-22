# Example one

# fruit={}
# l1=["apple","banana","apple","banana","banana"]
# for index in l1:
#     if index in fruit:
#         fruit[index]+=1
#     else:
#         fruit[index]=1
# print(len(fruit))
# print(fruit)
# print()


# Example two

# arr={}
# arr[1]=6
# arr['1']=2
# arr[1]=25
# sum=0
# for k in arr:
#     sum+=arr[k]
# print("Sum of values=",sum)
# print()


# Example three

# expm1={20:"integer",(1,2):"tuple","hi":"string"}
# op=""
# for key in expm1:
#     op=op+expm1[key]
# print(op)
# print()


# Example four
# expm1={20:"integer",(1,2):"tuple","hi":"string"}
# print(len(expm1.values()),end="")
# print(max(expm1.values())) # Ascci value wise find maximum
# print()


# Example five
d1={10:25,6:24,26:8}
n1=24
if n1 in d1.values( ):
    print("Found")
else:
    print("Not Found")