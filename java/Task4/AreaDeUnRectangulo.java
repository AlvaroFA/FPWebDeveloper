
import java.util.Scanner;

public class AreaDeUnRectangulo {

    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);
        int xAbajo;
        int yAbajo;
        int xArriba;
        int yArriba;
        xAbajo = leo.nextInt();
        yAbajo = leo.nextInt();
        xArriba = leo.nextInt();
        yArriba = leo.nextInt();
        while (xAbajo <= xArriba && yAbajo <= yArriba) {
            int resultado = (xArriba - xAbajo) * (yArriba - yAbajo);
            System.out.println(resultado + "");
            xAbajo = leo.nextInt();
            yAbajo = leo.nextInt();
            xArriba = leo.nextInt();
            yArriba = leo.nextInt();
        }

    }
}
