#Manejo de errores
try:
	x = int(raw_input("Valor de x:"))
	y = int(raw_input("Valor de y:"))
	res = x + y
	print "La suma es: %d" % res
except ValueError:
	print "Error, se requieren numeros"
