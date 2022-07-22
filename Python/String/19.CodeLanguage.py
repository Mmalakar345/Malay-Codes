# In certain code language, EASY is written as '5117'. In the same code language. How will 'BEAM' Be written as?

words=input("Enter a word-->")
word=words.upper()
List=[]
list=[]
for i in word:
    List.append(i)
    for j in range(65,99+1):
        if i==(chr(j)):
            list.append(str(j-64))
print(List)           
print(list)
list1=[]
for i in list:
    if len(i)==1:
        list1.append(i)
    plus=0
    add=0
    if len(i)==2:
        for j in range(len(i)):
            plus+=(int(i[j]))
        pol=str(plus)
        # print(pol)
        if len(pol)==1:
            list1.append(pol)
        else:
            if len(pol)==2:
                for p in range(len(pol)):
                    add+=(int(pol[p]))
                list1.append(str(add))
value=''
for i in list1:
    value+=i
print()
print(value)
print()






















# 1245984

# 123
# 12 21 32 13 31 23 321 231 123 312

# 21



