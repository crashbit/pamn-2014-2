#coding: UTF-8

def saludo(idioma):

	def saluda_es():
		print "Hola"

	def saluda_en():
		print "Hello"

	def saluda_tepito():
		print "Quihubos maikol"

	diccionario = { "es": saluda_es,
					"en": saluda_en,
					"tepito": saluda_tepito
	}

	return diccionario[idioma]

var = raw_input("Que idioma desea: ")
f = saludo(var)
f()











