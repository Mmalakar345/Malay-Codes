# Display factors of all the numbers between a range using UDF
def displayFactor(lower,upper):
     for val in range(lower,upper+1):
         print("\nFactors of",val,"are")
         for factor in range(1,val+1):# inner loop
             if val%factor==0:
                 print(factor,end=" ")
# main
lower=int(input("Enter lower value"))
upper=int(input("Enter upper value"))
if lower>upper:
    print("Invalide input")
else:
    displayFactor(lower,upper) #Method call

