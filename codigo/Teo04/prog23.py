def imprime():
	print "hola mundo"
	def escribe():
		print "Escribiendo hola mundo"

	return escribe

f = imprime()
print type(f)
f()