1.          # Current bill Calculate
#Calculate Electric Bill on unit consumed.
#  the rates are as follows:
#  upto 100 units- Rs 1.35/units
#  more than 100 units and upto 200 units- Rs. 1.50/units
#  More than 200 units - Rs. 1.80/unit
#  Input units consumed and display the bill in Rs.
units=int(input("Enter total number of units"))
bill=0
if units<=100:
     bill=1.35*units
elif units<=200:
     bill=100*1.35+(units-100)*1.5
else:
     bill=100*1.35+1.5+(units-200)*1.8

print("Total bill amount is = Rs.", bill)