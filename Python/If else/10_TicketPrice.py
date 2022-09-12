price=float(input("Enter the ticket price amount\n: "))
discount=0
if price<=50:
    discount=0
elif price<=80:
   discount= price*5/100
elif price<=100:
   discount=price*10/100
elif price<=200:
   discount = price*15/100
else:
   discount = price*25/100
net = price-discount
print("Ticket Price, RS=",net)
print("your price discount, RS=",discount)
