import java.util.Scanner;
public class Exercicios1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int x = sc1.nextInt();
        int y = sc2.nextInt();

        int soma = x+y;

        System.out.println("O resultado da sua soma é igual a " + soma);

    }
}

# Exercício 2 = Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.


Código:


Não consegui fazer até agora ( vou tentar de novo amanhã)

#Exercício 3 = Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Código:
import java.util.Scanner;
public class Exercicios1 {
    public static void main(String[] args) {
        int A,B,C,D;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int x,y,z;
        x = A * B;
        y = C * D;
        z = x-y;

        System.out.print(z);

    }
}

#Exercício 4 = Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

Código:
import java.util.Scanner;
public class Exercicios1 {
    public static void main(String[] args) {
        int funcionarios;
        double hours;
        double slr;

        Scanner sc = new Scanner(System.in);

        funcionarios = sc.nextInt();
        hours= sc.nextDouble();
        slr = sc.nextDouble();

        double x;
        x = slr * hours;

        System.out.println("o número de funcionários é de " + funcionarios);
        System.out.println("O salário é de R$ " + x);

    }
}














Exercícios 5 e 6 vou fazer amanhã.

  
