import pandas as pd
df =pd.read_table('D:\Programming\MAchine Learning\pandas\dist.txt', 
         delim_whitespace=True,
                  names=('roll', 'B', 'C'))
print(df)
print("#################")
data = pd.read_csv('D:\Programming\MAchine Learning\pandas\dist.txt', delimiter= '\s+',
                   header=None, index_col=False)
data.columns = ["a", "b", "c"]
print(data)


