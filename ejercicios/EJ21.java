public class EJ21 {

        public static void main(String[] args) {

                int i;
                double impar, resultado;

                impar = 1;
                i = 0;
                resultado = 0;

                while (i++ < 10) {
                        resultado += impar;
                        impar += 2;
                }
                System.out.println("La suma de los primos es: " + resultado);
        }
}
