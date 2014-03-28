#coding: UTF-8
archivo = open("CPdescarga.txt", "r")
archivo.read(512)
print archivo

while True:
	linea = archivo.readline()
	if not linea: break
	print linea