package firstProject;

import java.util.Scanner;

public class Inputs {

    public static Scanner enter = new Scanner(System.in);

    public static String inputName(){
        String name;
            do {
            System.out.println("Por favor ingrese su nombre completo");
            name = enter.nextLine();
            }
            while(!name.matches("[a-z A-Z]{5,50}"));
            return name;
    }
    public static String inputPhone(){
        String phone;
        do {
            System.out.println("Por favor ingrese su número de telefono");
            phone = enter.nextLine();
        }while (!phone.matches("[0-9]{7,10}" ));
        return phone;
    }
    public static int inputAge(){
        String  age;
        do {
            System.out.println("Por favor ingrese su edad");
            age = enter.nextLine();
        }while (!age.matches("[0-9]{1,2}"));
        return Integer.parseInt(age);
    }

}
