listas = [1, 2, 3, 4, 5, "Profesor"]
otraLista = ["pedro", "lola", "juan"]
print listas[4]

listas[3] = "cadena"
print listas

print listas[1:-2]
listas.append("otro elemento")
print listas

listas.extend(otraLista)
print listas[7]

listas.insert(1,"Profesor")
print listas

del listas[4:6]
print listas

listas.remove("Profesor")
print listas

listas.sort()
print listas

listas.reverse()
print listas

resultado = "German" not in listas
print resultado

temp = [1,2,3,4,5,6] * 5
print temp
print len(temp)
























