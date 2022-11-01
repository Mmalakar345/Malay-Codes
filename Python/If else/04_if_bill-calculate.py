1.          # Current bill Calculate
#Calculate Electric Bill on unit consumed.
#  the rates are as follows:
#  upto 100 units- Rs 1.35/units
#  more than 100 units and upto 200 units- Rs. 1.50/units
#  More than 200 units - Rs. 1.80/unit
#  Input units consumed and display the bill in Rs.
units=int(input("Enter total number of units==> "))
bill=0
if units<=1000:
     bill=1.35*units
elif units<=2000:
     bill=1000*1.35+(units-1000)*1.5
else:
     bill=1000*1.35+1000*1.5+(units-2000)*1.8

print("Total bill amount is ", bill," Rs.")