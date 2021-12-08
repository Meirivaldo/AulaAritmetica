public class Aula4 {
    public static void main(String[] args) {
        System.out.println();

        //conjução ambas devem ser verdades, &&, and;
        //Disjunção só é verdade se tiver pelo menos uma verdade, ||, or;
        //Disjunção exclusiva Só é verdade se os operandos forem falsos, ^, xor;
        //Negação inversão do operando (se for verdade torma falso, e se for falso torna verdade,!.

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        boolean b5 = true;
        boolean b6 = false;

        System.out.println(b2 && b4 || b6);


    }

}

.