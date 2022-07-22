# If your input is TRY then output will be an encoded text like USZ.....enter any sentence Nd encode the input.

word="TRYtry"
# word=input("Enter a word")
li=[]
for x in word:
    value=ord(x)
    # print(value,end=" ")
    new=chr(value+1)
    li.append(new)
vi=' '
for i in li:
    vi=vi+i
print(vi)
    
    
    
