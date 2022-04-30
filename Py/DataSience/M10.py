
import pandas as pd

dados = pd.read_csv('/home/userrr/Downloads/acesso_sites.txt', sep=',')

print(dados.info())

site1 = dados[["SITE1", "SITE2"]]
print("Selecionando somente os dados do site 1 ")
print(site1.head())
print("Filtrando os dados da tabela !")
filtro_site1 = dados[dados["SITE1"] > 70]

print(filtro_site1.head(58))
print(filtro_site1.shape)
