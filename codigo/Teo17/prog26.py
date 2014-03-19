lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]

def es_par(n):
	return (n%2.0 == 0)

l2 = filter(es_par, lista)
print l2