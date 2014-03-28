lista = [1, 2, 3, 4, 5]

def suma(x, y):
	return x+y

def factorial(x,y):
	return x*y


l2 = reduce(suma, lista)
l2 = reduce(factorial, lista)
print l2

