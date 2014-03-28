#coding: UTF-8
class Alumno:
	def __init__(self):
		print "Saludos desde Alumno"


class Ingenieria(Alumno):

	def __init__(self):
		print "Saludos desde Ingeniería"


computacion = Ingenieria()