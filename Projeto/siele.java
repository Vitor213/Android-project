import java.util.Scanner;

class aula {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("digite o salario");
       float salario = scanner.nextFloat();
       
       System.out.println("digite a porcentagem do aumento");
       float porcentagem = scanner.nextFloat();
       System.out.println();
       
       float novo_salario = salario + (salario * porcentagem / 100);
       
       System.out.println("O reajuste salarial sera de  " + novo_salario );