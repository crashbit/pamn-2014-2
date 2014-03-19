#coding: utf-8

archivo = open("CPdescarga.txt", "r")
print archivo
lista_cp = []
for cp in archivo:
	lista_cp.append(cp.strip().split("|"))

print lista_cp[2000]
lista = ["alumno", "pedro", 1, 2, 3, 3.4]

for i in lista:
	print i