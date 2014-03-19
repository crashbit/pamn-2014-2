l1 = [1,2, 3, 4, 5, 6, 7, 8, 9, 10]
lista = ( n for n in range(1,10))
l2 = (n ** 2 for n in l1)
print l2
print type(lista)

l3 = [ n ** 2 for n in l1]
print l3