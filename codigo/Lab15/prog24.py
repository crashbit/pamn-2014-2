lista = [1, 2, 3, 4, 5, "lola", "lelo", "lila"]
lista2 = ["alumno", "profesor", "ingeniero", "director"]

lista.extend(lista2)
print len(lista)
lista.insert(3, "rector")
print lista

del lista[6]
print lista

lista.remove("rector")
print lista