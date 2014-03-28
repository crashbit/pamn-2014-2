def saluda(leng):
	def saluda_es():
		print("hola")

	def saluda_en():
		print("hello")

	def saluda_mx():
		print("Quihubos")

	diccionario = {"es":saluda_es,
					"en":saluda_en,
					"mx":saluda_mx
	}

	return diccionario[leng]

f = saluda("es")
f()