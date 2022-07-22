7. # An electronic shop has announced the following  seasonal discount
   #on purchase of Laptop
#    price             Discount on laptop         Assured gift
#    upto 25000             0.0%                Claculator
#    25001 - 50000          5.0%                Digital note 
#    50001 - 100000         7.5%                Wall clock
#    more than 100000       10.0%               Wrist watch

price=float(input("Enter the price amount\n: "))
discount=0
if price<=25000:
   discount= 0
   gift = 'calcolator'

elif price<=50000:
    discount=price*5/100
    gift='digital notebook'

elif price<=100000:
     discount = price*7.5/100
     gift='wall clock'
else:
     discount = price*7.5/100
     gift = ("wrist watch")

net = price-discount

print("NET AMOUNT PAYBLE, RS=",net)
print("your price discount, RS=",discount)
print("your gift",gift)



#njnn

price=float(input("Enter the ticket price amount\n: "))
discount=0
if price<=50:
   discount= price*5/100
elif price>=50<=100:
    discount=price*10/100
   elif price>=100<=200:
      discount = price*15/100
   else:
      discount = price*25/100
      net = price-discount
print("Ticket Price, RS=",net)
print("your price discount, RS=",discount)

