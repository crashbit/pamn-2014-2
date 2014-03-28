#Un sencillo sencillo que devuelve lo que el servidor recibe
import socket

socket_s = socket.socket()
socket_s.connect(("localhost", 1111))


print "Conexion lista"

while True:
	mensaje = raw_input("> ")
	socket_s.send(mensaje)
	if mensaje == "quit":
		break
	servidor = socket_s.recv(1024)
	print servidor
	
print "adios"
socket_s()
