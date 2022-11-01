# Display all the fibonacci numbers between 0 and 100
# fibonacii series---- 0,1,1,2,3,5,8......

first=0
second=1
print("All the fibonacci numbers between 0 and 100 are")
print(first,end=" ")
print(second,end=" ")
while True:
    third=first+second
    if third>100:
        break
    print(third,end=" ")
    first=second
    second=third
