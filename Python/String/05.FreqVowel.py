# 6.f. write a program to input a string (word). convert it into lowercase letter. count and print the frequency of vowel of present in string. The output should be given as: 3
# Sample Input: Alphabets
# Sample Output:
# =====================================
# Vowel Frequency
# =====================================
# a 2
# e 1
word=input("Enter a word")
# convert to lower case
word=word.lower()
counta,counte,counti,counto,countu=0,0,0,0,0
print("-"*50)
print("-"*50)
print("Vowel Frequency")
print("-"*50)
print("-"*50)
# count the frequncy in a loop
for ch in word:
    if ch=='a':
        counta+=1
    elif ch=='e':
        counte+=1
    elif ch=='i':
        counti+=1
    elif ch=='o':
        counto+=1
    elif ch=='u':
        countu+=1
# counta=word.count("a")
# counte=word.count("e")
# counti=word.count("i")
# counto=word.count("o")
# countu=word.count("u")

if counta>0:      
    print('a ',counta)   
if counte>0:
    print('e ',counte)   
if counti>0:
    print('i ',counti)   
if counto>0:
    print('o ',counto)   
if countu>0:
    print('u ',countu)   
        
        