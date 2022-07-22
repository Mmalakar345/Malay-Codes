import pandas as pd
df=pd.read_csv("D:\Programming\MAchine Learning\pandas\Income_data.csv")
df1=df.iloc[1:3,1:4]
print(df.isnull().sum())
# if any cell is blank then fill up 10000 
df2=df.fillna(10000)