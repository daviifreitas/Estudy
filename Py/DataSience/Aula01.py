import numpy as np
import pandas as pd

from pandas import Series ,DataFrame

series_obj = Series(np.arange(8), index=['row 1', 'row 2' ,'row 3' ,'row 4' ,'row 5' ,'row 6' ,'row 7', 'row 8'])

print(series_obj['row 7']) #print the value of index

print(series_obj[[0 ,7]]) # Print the result of index and value present in the index

np.random.seed(25)
DF_obj = DataFrame(np.random.rand(36).reshape((6 ,6)),index=['row 1', 'row 2' ,'row 3' ,'row 4' ,'row 5' ,'row 6' ], columns = ['column1','column2','column 3', 'column 4', 'column5' , 'column 6'])
print(DF_obj)

