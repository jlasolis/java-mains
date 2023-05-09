package Refactorizado;
import java.util.Scanner;

public class main {
	
	static void mostrarMenu() {
		System.out.println("1-Gestores");
		System.out.println("2-Clientes");
		System.out.println("3-Transferencias");
		System.out.println("4-Mensajes");
		System.out.println("5-Préstamos");
		System.out.println("6-Salir");
	}

	static int suma(int x, int y) {
		return x + y;
		}

	
	static void caberecera() {
		System.out.println("//////// A P L I C A T I V O //////////");
		System.out.println("Estamos en la pantalla de ...");
	}
	
	static void pie() {
		System.out.println("-------- A P L I C A T I V O ----------");
	}
	
	
	static int gestores() {
		main.caberecera();
		System.out.println("--> Gestores");
		main.pie();
		return 1;
		}
	static int clientes() {
		main.caberecera();
		System.out.println("--> Clientes");
		main.pie();
		return 2;
		}
	static int transferencias() {
		main.caberecera();
		System.out.println("--> Transferencias");
		main.pie();
		return 3;
		}
	static int mensajes() {
		main.caberecera();
		System.out.println("--> Mensajes");
		main.pie();
		return 4;
		}
	static int prestamos() {
		main.caberecera();
		System.out.println("--> Prestamos");
		main.pie();
		return 4;
		}
	
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		int numero=0;
		
		do {
			main.mostrarMenu();			
			try {
				numero = keyboard.nextInt();		
			} 
			catch (Exception e) {
				System.out.println("El valor introducido no es válido");
				
			}
			switch (numero) { 
		    case 1:
		    	main.gestores();
		     break;
		    case 2:
		    	main.clientes();	    	
		     break;
		    case 3 :
		    	main.transferencias();
		     break;
		    case 4 :
		    	main.mensajes();
		     break;
		    case 5 :
		    	main.prestamos();
		     break;
		    case 6 :
		    	System.out.println("-> Salir");
		     break;
		    default:		    	
		  }			
		}while ((numero>=1)&&(numero>=6));
		keyboard.close();


	}

}
