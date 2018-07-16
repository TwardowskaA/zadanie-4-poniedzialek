import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int i = 0;

        Scanner scan = new Scanner(System.in);
        double suma = 0;
        while(i < 5){
            System.out.println("Podaj liczby");
            int userNumber = scan.nextInt();
            suma = suma + userNumber;
            i++;
        }

        System.out.println(suma);

    }

}
