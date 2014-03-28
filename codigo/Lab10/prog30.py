#coding: UTF-8
archivo = open("CPdescarga.txt", "r")
i = 0
for linea in archivo:
	print linea.split("|")
	if i == 5:
		break
	i = i +1
