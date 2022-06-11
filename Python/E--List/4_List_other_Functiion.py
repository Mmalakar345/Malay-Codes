

li=[1,2,3,1,3,2,1,3]
print("The list is=",li)

## Count the occurance of an element in the list-- list.count(value)   
list=li.count(2)
print("Total count of 2 is=",list)

## Revarses of a list
li.reverse()
print("After reversing the list=",li)

## Arranging a list in ascending order
li.sort()
print("After arranging the list =",li)

## Arranging a list in descending order
li.sort(reverse=True)
print("After arranging the list in reverse order=",li)
print(sum(li))
print(max(li))  ## list er sob theke Big integer
print(min(li))  ## list er sob theke small integer
