public class EJ19 {
        public static void main(String[] args) {
                int i;
                double resultado, num1;

                i = 0;
                num1 = 1;
                resultado = 0;
                while(i < 100) {
                        resultado = Math.pow(num1++,2) + resultado;

                        System.out.println(resultado);
                        i++;
                }
        }
}
