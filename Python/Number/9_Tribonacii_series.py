
# Print the first 20 terms of the Tribonacii series -
# 1,2,3,6,11,20,37,68
first=1
second=2
third=3
print("All the fibonacci numbers between 0 and 100 are")
print(first,end=" ")
print(second,end=" ")
print(third,end=" ")
print(third,end=" ")
count=4
while count<=25:
    forth=first+second+third
    print(forth,end=" ")
    first=second
    second=third
    third=forth
    count=count+1

# Print the first 20 terms of the Tribonacii series -
# 1,2,3,10,19,36,69........

# first=1
# second=2
# third=3
# forth=4
# print("All the fibonacci numbers between 0 and 100 are")
# print(first,end=" ")
# print(second,end=" ")
# print(third,end=" ")
# print(forth,end=" ")

# count=5
# while count<=20:
#     fifth=first+second+third+forth
#     print(fifth,end=" ")
#     first=second
#     second=third
#     third=forth
#     forth=fifth
#     count=count+1