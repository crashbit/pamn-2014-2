def funcion(a = 3, b = 2):
	print(b)

def variante(*args):
	print(args)

def diccionario(a=3, b=20, c=50):
	print a, b, c


funcion(b=45)

funcion()

variante(1,2,4,45,6,"hola")
#d = {a:5, b:1, c:8}

valor = input("Dame un numero: ")
print valor