def prueba():
	print "Hola mundo"

	def test():
		print "Hola test"

	return test

f = prueba()
print type(f)
f()