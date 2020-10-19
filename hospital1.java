package hospital;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class hospital1{
	public static void main(String[] args) {
		Scanner myVar = new Scanner(System.in);
		boolean cond = true;
		int i=0;
		List<helper> hosp = new ArrayList<>();
		while(cond!=false) {
			int s=0;
			System.out.println("##########MENU##########");
			System.out.println("1- Adicionar um paciente");
			System.out.println("2- Buscar um paciente");
			System.out.println("3- Excluir uma informação");
			System.out.println("4- Alterar uma infomação");
			System.out.println("5- sair");
			s = myVar.nextInt();
			if (s==1) {
				
			}
			if (s==2) {
				
			}
			if (s==3) {
				
			}
			if (s==4) {
				
			}
			if (s==5) {
				break;
			}

		}
	}

}