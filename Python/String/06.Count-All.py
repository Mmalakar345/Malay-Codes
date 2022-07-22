# input a sentence and count tooal number of vowel,consonent,digit and special number characters presents in each word.

line=input("Enter a line= ")
words=line.split()  # here words is a list of strings
print("word\ Vowel\ Consonent\ Digit\ Special character:-")
for word in words:
    vowel,conso,digit,special=0,0,0,0
    for ch in word:
        if ch.isdigit():
            digit+=1
        elif ch.isalpha():
            if "AEIOU".find(ch.upper())!=-1:
                vowel+=1
            else:
                conso+=1
        else:
            special+=1
    print(word,"\t",vowel,"\t",conso,"\t",digit,"\t\t",special)
        