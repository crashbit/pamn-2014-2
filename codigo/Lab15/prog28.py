#coding: utf-8
archivo = open("CPdescarga.txt", "r")
lista_cp = []
for linea in archivo:
	elementos = linea.strip().split("|")
	lista_cp.append(elementos)

cp = raw_input("Teclee el codigo postal:")

for i in lista_cp:
	if cp == i[0]:
		print "Su delegación o municipio es: %s" % i[3]
		print "Su estado es: %s" % i[4]
		break














