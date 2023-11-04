using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClienteNETS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            WSOperaciones.WSOperationsClient clientejava = new WSOperaciones.WSOperationsClient();
            ServicioPhp.ServicePhpPortTypeClient clientephp = new ServicioPhp.ServicePhpPortTypeClient();

            if (clientejava.login("lenin", "lenin123"))
            {
                Console.WriteLine("Credenciales Correctas");
                Console.WriteLine("Servicio de Java");
                int vuelto = clientejava.procesarPago(2, 5);
                if(vuelto > 0)
                {
                    Console.WriteLine("Su vuelto es: " + vuelto+"\n");
                } else
                {
                    Console.WriteLine("Saldo insuficiente");
                }
                String palabra = "Anita lava la tina";
                Console.WriteLine("Servicio de PHP");
                Console.WriteLine(clientephp.comprobarPalindroma(palabra));
                Console.ReadLine();
            } else
            {
                Console.WriteLine("Credenciales incorrectas");
                Console.Read();
            }

            clientephp.Close();
            clientejava.Close();
        }
    }
}
