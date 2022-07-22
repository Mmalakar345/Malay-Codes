# Pig latin.noun. a secret language used by children in wich any consonants at the beginning of a word are placed at the end. followed by-ay; for example cathedral becomes athedralcay
# INPUT: LONDON
# OUTPUT: ONDONLAY
# INPUT: SKY
# OUTPUT: Piglatin is not possible

word=input("Enter a word")
word=word.upper()
length=len(word)
vset="aeiouAEIOU"
for i in range(length):
    ch=word[i]
    if vset.find(ch)!=-1:
        op=word[i:length]+word[0:i]+"AY"
        print("Piglatin word is=",op)
        break
else:
    print("Piglatin is not possible")