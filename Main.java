package application; // eclipse ide

// Author: PHNO - Tecnólogo | Pós-Graduado
// Data Release: 17/10/2023
// Versão Código: 2.0.1v
// Replit: @PHNO, @PHREPLIT
// E-mail: phreplit@gmail.com

// Algorithm: Basic Calculator in Java, with 4 basic functions, with menu and console compilation.

// Algoritmo: Calculadora Basica em Java, com 4 funcoes basicas, com menu e compilacao em console.

import java.io.IOException;
import java.util.Scanner; // importa lib

public class Main {
  
  public static void main(String[] args) throws IOException, InterruptedException {

     int resultsomar; // declara variavel - polimorfismo 1 
     int resultsub;
     int resultmult;
     int resultdiv;
    
    loop: // Menu escolha
    while (true) {

      System.out.println("\n");
      System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println(":: Calculadora Basica em Java - 4 Funcoes Basicas ::");
      System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println("");
      System.out.println(" Menu  \n"); // menu
      
      System.out.println(" 1 - Somar "); // sum
      System.out.println(" 2 - Subtrair "); // subtract
      System.out.println(" 3 - Multiplicar "); // multiply
      System.out.println(" 4 - Dividir "); // divide - divisao simples
      System.out.println(" 5 - Sair "); // exit
      
      System.out.println("\n [9] Sobre "); // about
      
      System.out.println("\n Digite sua escolha 1 a 5: ");

    Scanner scanner = new Scanner(System.in);
    
    int escolha = scanner.nextInt();

    try {
      
    switch (escolha) {
      case 1:
        System.out.println("\n Digite um numero: "); // enter first number
        int a = scanner.nextInt();
        System.out.println("\n Digite outro numero: "); // enter second number
        int b = scanner.nextInt();
        resultsomar = (a + b); // polimorfismo 1 - sum
        // System.out.println("\n");
        System.out.println("\n O resultado da soma:  " + resultsomar); // polimorfismo 1 - variavel - sum result
        // System.out.println("\n Resultado: " + (a + b)); // polimorfismo 2 - calculo direto quando imprimir
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\n Tecle enter para retornar ao menu... \n");
        String enter = scanner1.nextLine();
        clear()
        break;
      case 2:
        System.out.println("\n Digite um numero: ");  
        int c = scanner.nextInt();
        System.out.println("\n Digite outro numero: ");
        int d = scanner.nextInt();
        // System.out.println("\n");
        System.out.println("\n O resultado da subtracao: " + (c - d));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\n Tecle enter para retornar ao menu... \n");
        String enter2 = scanner2.nextLine();
        clear()
        break;
      case 3:
        System.out.println("\n Digite um numero: ");  
        int e = scanner.nextInt();
        System.out.println("\n Digite outro numero: ");
        int f = scanner.nextInt();
        // System.out.println("\n");
        System.out.println("\n O resultado da multiplicacao: " + (e * f)); 
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("\n Tecle enter para retornar ao menu... \n");
        String enter3 = scanner3.nextLine();
        clear()
        break;
      case 4:
        System.out.println("\n Digite um numero: ");   
        int g = scanner.nextInt();
        System.out.println("\n Digite outro numero: ");
        int h = scanner.nextInt();
        // System.out.println("\n");
        System.out.println("\n O resultado da divisao simples: " + (g / h));
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("\n Tecle enter para retornar ao menu... \n");
        String enter4 = scanner4.nextLine();
        clear()
        break;
      case 5:
        System.out.println("\n Algoritmo Finalizado! ");
        break loop;
      case 9:
        clear()
        Scanner scanner9 = new Scanner(System.in);
        System.out.println("\n");
        System.out.println(" Algoritmo: Calculadora Basica em Java ");
        // System.out.println("");
        System.out.println("\n Author: PHNO");
        System.out.println(" Data Release: 17/10/2023");
        System.out.println(" Versao Codigo: 2.0.1v");
        System.out.println(" Replit: @PHNO, @PHREPLIT");
        System.out.println(" E-mail: phreplit@gmail.com");
        System.out.println("");
        System.out.println("\n Tecle enter para retornar ao menu... \n");
        String enter9 = scanner9.nextLine();
        clear()
        break;
      default:
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("\n Erro escolha outra opcao. ");
        System.out.println("\n Tecle enter para retornar ao menu... \n");
        String enter5 = scanner5.nextLine();
        clear()
       }
      } catch (Exception e) {
      Scanner scanner6 = new Scanner(System.in);
      System.out.println("\n Erro no Sistema!");
      System.out.println("\n Tecle enter para retornar ao menu... \n");
      String enter6 = scanner6.nextLine();
      clear();
      }            
    }
   }
      public static void clear() {
	         System.out.print("\033[H\033[2J"); // clear screen
	         System.out.flush();
      }
  }
