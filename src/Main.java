import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color;
        double lado;
        Cuadrado c1=new Cuadrado("Red",6);
        System.out.println("El area del cuadrado es:"+c1.calcularArea());
        System.out.println("\nEl Color del cuadrado es:"+c1.getColor());
        Scanner x=new Scanner(System.in);
        System.out.println("Ingresar el color para el objeto 2:");
        color=x.next();
        System.out.println("Ingresar el lado para el cuadro 2:");
        lado=x.nextDouble();
        Cuadrado c2=new  Cuadrado(color,lado);
        System.out.println("El area del cuadrado2 es:"+c2.calcularArea());
        System.out.println("\nEl Color del cuadrado2 es:"+c2.getColor());
        Triangulo t1=new Triangulo("Rojo",5,4);
        System.out.println("\n El area del triangulo es:"+t1.calcularArea());
        System.out.println("\n El color es:"+t1.getColor());

    }
}
