<?php

require 'lib/nusoap.php';

$clientej = new nusoap_client("http://localhost:8080/ServicioWeb_SOAP/WSOperations?WSDL", false);
$cliente = new nusoap_client("http://localhost/soap/ServicePhp.php?wsdl", false);

if ($clientej->call('login', ['nombre' => 'lenin', 'contra' => 'lenin123'])) {
    print("Inicio de sesion correcto\n");
    $vuelto = $clientej->call('procesarPago', ['total' => 5, 'pago' => 10]);

    if ($vuelto != -1) {
        print("Pago realizado correctamente\n");
    } else {
        print("Saldo insuficiente\n");
    }

    // Llama al método comprobarPalindroma() del servicio web SOAP
    $resultado = $cliente->call('comprobarPalindroma', ['palabra' => 'oro']);

    print($resultado . "\n");
} else {
    print("Credenciales incorrectas\n");
}


