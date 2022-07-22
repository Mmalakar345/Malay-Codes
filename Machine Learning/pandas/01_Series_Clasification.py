import pandas as pd
series=pd.Series()
print(series)
series1=pd.Series([11,56,77])
print(series1)
# jodi value (list,tuple,dictonary) hoy, tokhon same qunatity value-index rekhe work korte hobe 
series2=pd.Series([11,56,77],index=['A','B','C'])
print(series2)
# jodi constant value pass kora hoy, tokhon value constant rekhe issse moto index banano jai
series3=pd.Series(17,index=['A','B','C'])
print(series3)

dict={"Name":"Malay Malakar","email":"malaymalakar345@gmail.com"}
series4=pd.Series(dict)
print(series4)

