lista = [1, 2, 3, 4, 5, "lola", "lelo", "lila"]
lista2 = ["alumno", "profesor", "ingeniero", "director"]
print lista
#Esto es un comentario
for item in lista:
	print item

print lista[7]
lista.extend(lista2)
print lista