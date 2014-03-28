#coding: UTF-8
archivo = open("CPdescarga.txt", "r")
i = 0
lista_cp = []
for linea in archivo:
	lista_cp.append(linea.split("|"))

def busca_cp(var):
	if var[4] == "Morelos":
		return var

nueva_lista = filter(busca_cp, lista_cp)
print nueva_lista