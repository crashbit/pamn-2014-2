def variosParametros(*args):
	print args[6]

#Algo de programacion funcional
def saluda(idioma):
	"""Recibe un idioma y regresa la funcion que le corresponde"""
	def saluda_es():
		print "Buenos dias"

	def saluda_en():
		print "good morning"

	def saluda_tepiteco():
		print "quihubos"

	diccionario = { "es": saluda_es,
					"en": saluda_en,
					"tepiteco": saluda_tepiteco
	}

	return diccionario[idioma]

k = saluda(2)
k()





























