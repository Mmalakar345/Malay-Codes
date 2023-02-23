#######################  Type 1   ##########################
# TIME munines and seconds

# import time
# def countdown(t):
#     while t:
#         mins,secs = divmod(t,60)
#         timer = '{:02d}:{:02d}'.format(mins,secs)
#         print(timer,end="\r")
#         time.sleep(1)
#         t-=1
# t= input("Enter the in seconds ==> ")
# print("Your Times start now ")
# countdown(int(t))
# print("Your Times up")
# print("Thanks for Wating")





#######################  Type 2   ##########################
# TIME days, hour, munines and seconds
 
import time
def countdown(t): 
    """
    Countdown Timer
    """
    while t:
        # Divmod takes only two arguments so
        # you'll need to do this for each time
        # unit you need to add
        mins, secs = divmod(t, 60) 
        hours, mins = divmod(mins, 60)
        days, hours = divmod(hours, 24)
        timer = '{:02d}:{:02d}:{:02d}:{:02d}'.format(days, hours, mins, secs) 
        print(timer, end="\r") 
        time.sleep(1) 
        t -= 1
    print('Fire in the hole!!') 

print("Your Times start now ")
t= input("Enter the in seconds==> ")
countdown(int(t))






#######################  Type 3   ##########################
# import time

# start_time = time.time()

# def countdown(t): 
#     """
#     Countdown Timer
#     """
#     while t:
#         # Divmod takes only two arguments so
#         # you'll need to do this for each time
#         # unit you need to add
#         mins, secs = divmod(t, 60) 
#         hours, mins = divmod(mins, 60)
#         days, hours = divmod(hours, 24)
#         timer = '{:02d}:{:02d}:{:02d}:{:02d}'.format(days, hours, mins, secs) 
#         print(timer, end="\r" )
#         time_before_sleep = time.time() - start_time
#         time.sleep(1) 
#         time_after_sleep = time.time() - start_time
#         print(timer, time_before_sleep, time_after_sleep)
#         t -= 1
        
#     print('Fire in the hole!!') 

# t = 10

# countdown(int(t))