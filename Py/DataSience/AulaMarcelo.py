import pandas as pd 
patients_df = pd.read_json(open("faixaAzul.json", "r", encoding="utf8"))
patients_df.head()