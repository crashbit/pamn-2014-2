def Saludo(var):
	def saluda_es():
		print ("Buenos dias")

	def saluda_en():
		print("good morning")

	def saluda_mx():
		print("Quihubos!!")


	diccionario ={"es":saluda_es,
					"en":saluda_en,
					"mx":saluda_mx	
	}

	return diccionario[var]

f =Saludo("eu")
f()