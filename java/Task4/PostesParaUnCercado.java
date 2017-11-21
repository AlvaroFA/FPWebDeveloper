import java.util.Scanner;

public class PostesParaUnCercado {

    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);
        int largo;
        int ancho;
        int distPostes;
        int numPostes;

        largo = leo.nextInt();
        ancho = leo.nextInt();
        distPostes = leo.nextInt();

        while (largo != 0 && ancho != 0 && distPostes != 0) {
            
            //inicio
            int posteAncho;
            int posteLargo;

            if (largo <= distPostes && ancho <= distPostes) {
                numPostes = 4;
            } else {

                posteLargo = (int) largo / distPostes;
                if (largo % distPostes == 0) {
                    posteLargo = posteLargo - 1;
                }

                posteAncho = (int) ancho / distPostes;
                if (ancho % distPostes == 0) {
                    posteAncho = posteAncho - 1;
                }
                numPostes = (posteLargo + posteAncho) * 2 + 4;
                
                
                
            }
            
            System.out.println(numPostes);

            largo = leo.nextInt();
            ancho = leo.nextInt();
            distPostes = leo.nextInt();

        }
    }
}
