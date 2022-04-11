import numpy as np

a = np.array([0 ,1 ,2 ,3 ,4])

b = np.array([[0 ,1 ,2 ,3], ['column 1' ,'column 2' ,'column 3', 'column4']])

print(b.ndim)

print(b.shape)

print(len(b))

c = np.arange(10) #Cria um array unidimensional automáticamente

print(c)

d = np.linspace(1 , 10 ,20)

print(d)

e = np.random.rand(5)
print(e)