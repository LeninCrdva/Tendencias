from zeep import Client

clienteJava = Client("http://localhost:8080/ServicioWeb_SOAP/WSOperations?WSDL")
clientePhp = Client('http://localhost/soap/ServicePhp.php?wsdl')


#Llamar a la funcion de Java llamada login
if clienteJava.service.login("lenin", "lenin123"):
    print('Credenciales correctas')
else:
    print('Credenciales incorrectas')

vuelto = clienteJava.service.procesarPago(5, 10)

if vuelto != -1:
    print('Pago realizado correctamente')
    print('Su vuelto es %s' % vuelto)
else: 
    print('Saldo insuficiente')


print('Los resultados a continuacion son acerca del SW de Php')
# Llama a la función comprobarPalindroma del servicio web SOAP
cadena = "anilina"  # Cambia esta cadena según tus necesidades
resultado = clientePhp.service.comprobarPalindroma(cadena)

# Imprime la respuesta del servicio web SOAP
print(resultado)


