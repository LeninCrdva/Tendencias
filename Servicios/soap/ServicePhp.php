<?php

require 'lib/nusoap.php';

function comprobarPalindroma($name) {
    $name = strtolower(str_replace(' ', '', $name));
    $reversed = strrev($name);

    if ($name === $reversed) {
        return "La cadena es un palindromo";
    } else {
        return "La cadena no es un palindromo";
    }
}

$namespace = "PhpSoap";
$server = new nusoap_server();
$server->configureWSDL("ServicePhp", $namespace);
$server->soap_defencoding = 'UTF-8';  // Establecer la codificación a UTF-8
$server->decode_utf8 = false;         // Deshabilitar la decodificación UTF-8
$server->encode_utf8 = true;

$server->register(
        "comprobarPalindroma",
        array("name" => "xsd:string"),
        array("return" => "xsd:string"),
        $namespace,
        false,
        '',
        'literal'
);

$POST_DATA = file_get_contents("php://input");
$server->service($POST_DATA);
