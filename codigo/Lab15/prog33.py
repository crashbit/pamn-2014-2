lista = [1, 2, 3, 4, 5]

def factorial(x, y):
	return x*y


l2 = reduce(factorial, lista)
print l2