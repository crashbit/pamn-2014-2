#Un servidor sencillo que devuelve lo que el usuario escribe
import socket

socket_s = socket.socket()
socket_s.bind(("localhost", 1111))
socket_s.listen(10)

print "Servidor ready :D"

sc, addr =socket_s.accept()
while True:
	recibido = sc.recv(1024)
	if(recibido == "quit"):
		break
	print "Recibido: ",recibido
	pal_cliente = raw_input(">> ")
	sc.send(pal_cliente)

print "adios"
sc.close()
socket_s()
