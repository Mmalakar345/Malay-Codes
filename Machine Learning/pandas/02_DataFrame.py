import pandas as pd
Students={
    "name":["malay","arup","bibhakar"],
    "roll":[1,2,3],
    "id":[25,28,30]
}
# This is an Series
Series=pd.Series(Students)
print(Series)
print()
# This is an DataFrame
Series1=pd.DataFrame(Students)
print(Series1)
print()
# When we want name colom is used as a index
Series2=Series1.set_index("name")
print(Series2)
# Row sum
Series3=Series2.sum(axis=1)
print(Series3)
# Column average
Series4=Series1.mean(axis=0 )
print(Series4)

