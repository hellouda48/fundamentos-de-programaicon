import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner la=new Scanner(System.in);
		int dia;
		int mes;
		int a�o;
		int dia2;
		int a�o2;
		a�o2=2022;
		int mes2;
		mes2=9;
		int edad;
		System.out.println("Teclea el dia");
		dia=la.nextInt();
		System.out.println("Teclea el mes");
		mes=la.nextInt();
		System.out.println("Teclea el a�o");
		a�o=la.nextInt();
		System.out.println("Teclea el dia de hoy");
		dia2=la.nextInt();
	
		if(mes<mes2){
			
				edad=a�o2-a�o;
				System.out.println("Tu edad es"+edad);
			}else{
				if(mes==mes2){
					if(dia<dia2){
						edad=a�o2-a�o;
						System.out.println("Tu edad es"+edad);
					}
				}
			}
		}
		
	}


