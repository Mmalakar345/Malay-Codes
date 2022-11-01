# Write menu driven program to print the following series according to user's choice
# choice-
# Choice 1 : 1 -4 7 -10 13 -16......10 terms
# Choice 2 : 7 14 17 21 27 28....<100


print ("Enter 1 for displaying First series Enter 2 for displaying Second series") 
choice=int(input ("Enter your choice(1/2) ==> ")) 
# Choice one part
if choice==1:
    term1,term2=1,-4
    for i in range(1,6):
        print(term1,term2,end=" ")
        term1=term1+6
        term2=term2-6  
# Choice two part
elif choice==2:
      for i in range (1,101):
        if i%10==7 or i%7==0:
         print(i,end=" ")
        

