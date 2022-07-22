#5. Write a Python program to display the frequency of
# each letter of an input string using dictionary.
# Also display the number of vowels and consonants present
# in the given string.
# Original String: Alligator Output: A A G I L L O R T
# A – 2 
# G - 1 
# I – 1 
# L – 2 
# O - 1 
# R – 1 
# T – 1 
word=input("Original String")
length=len(word)
# string to list conversion
list=list(word.upper())
list.sort()
print(list)
# creates an empty Dictionary
dict={}
# Count the frequency and add to the dictionary
for char in list:
    dict[char]=list.count(char)
#Display
print("Output")    
for key in dict:
    print(key,"-",dict[key])
#  A STRING CONTAINING ALL THE VOWELS    
vset="AEIOU"
vcount=0 # IT IS USED TO COUNT VOWELS
ccount=0
word=word.upper()
#Count Total number of vowels
for ch in word:
    if ch.isalpha():
        if ch in vset:
            vcount+=1
        else:
            ccount+=1     
print("Total number of vowels=",vcount)
print("Total number of consonants=",ccount)