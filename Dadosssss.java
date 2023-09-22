package Actividades;
import java.util.Random;
import java.util.Scanner;
public class Dadosssss {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        char tirarDeNuevo = 'y';

		        while (tirarDeNuevo == 'y') {
		            System.out.println("Tirando los dados...");
		            int dado1 = random.nextInt(6) + 1;
		            int dado2 = random.nextInt(6) + 1; 

		            System.out.println("Sus valores son:");
		            System.out.println(dado1);
		            System.out.println(dado2);

		            try {
		                System.out.print("¿Desea volver a tirar los dados (y = yes)? ");
		                String respuesta = scanner.next();
		                tirarDeNuevo = respuesta.charAt(0);;
		            } catch (Exception e) {
		                System.out.println("No válido");
		            }
		        }

		        System.out.println("¡Gracias por jugar Ludo :)");
		        scanner.close();
		        System.exit(0);
		    }
		}

	


