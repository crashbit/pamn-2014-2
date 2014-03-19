def decorador(funcion):
	def nueva(*args):
		print "llamada a funcion ", funcion.__name__
		regresar = funcion(*args)
		return regresar
	return nueva

def imp(var):
	print var


f = decorador(imp)
f("hola")
