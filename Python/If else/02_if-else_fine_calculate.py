5.#A librarian charges a fine for books returned late.
#    Following are the fines,
#    No of days late           fine

#    for first 10 days         40paisa per day
#    11 to 20 days             60paisa per day
#    more than 20 days         80paisa per day 

days = int(input("NO. of days late\n: "))
fine = 0
if days<=10:
     fine = 0.40*days
elif days<=20:
     fine = 10*0.40+(days-10)*0.60
else:
     fine = 10*0.40+10*0.60+(days-20)*0.60
print(days, "days late you, that why your fine is:",fine)

