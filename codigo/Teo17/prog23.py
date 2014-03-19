def SaludaMundo():
	print "Hola mundo"
	def NoSaludes():
		print "No saludare"

	return NoSaludes


f = SaludaMundo()
print(type(f))
f()