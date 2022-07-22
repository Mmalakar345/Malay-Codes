# input upper and lower limits and display all the special numbers present in the range.
#(Inclusive of both the limits).
# A number is a special number if sum of digits is equal to the product of digits.

lower=int(input("Enter lower case value="))
upper=int(input("Enter upper case value="))
if lower>upper:
    print("Invalide Input")
else:
    print("Special number are=")

    while lower<=upper:
        sum=0
        product=1
        copy=lower
        while copy>0:
            sum=sum+(copy%10)
            product=product*(copy%10)
            copy=copy//10
        if sum==product:
            print(lower)
        lower+=1
    