try:
	item = 1
	x = 1/0
except NameError:
	print ("error!")
except ZeroDivisionError:
	print("Error en la division")
