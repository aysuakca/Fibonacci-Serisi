import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {

        int numb1 = 0 , numb2= 1;

    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int n = input.nextInt();

        for (int i = 0; i<=n; i++){
            System.out.print(numb1 + " ");
            int gecici = numb1 + numb2;
            numb1 = numb2;
            numb2 = gecici;
        }

            }


















