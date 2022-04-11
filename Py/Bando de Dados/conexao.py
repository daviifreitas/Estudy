import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="password13258046A@",
    database = "sakila"
)

cursor = mydb.cursor()

cursor.execute("Select * from actor")