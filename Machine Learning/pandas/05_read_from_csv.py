import pandas as pd
df=pd.read_csv("D:\Programming\MAchine Learning\pandas\Income_data.csv")
df1=df.set_index("State")
# Continuety maintain
df2=df1.loc["Alabama":"Arizona","2005":"2007"]
df3=df1.iloc[:3,1:4]
# not Continuety maintain
df4=df1.loc[:,["2005","2012"]]
print(df4)
df5=df4.sum(axis=0)
df6=df1.loc["California","2005":].values # .value represent data type of varible df6
df7=df1.loc[["California","Alaska"],:]
