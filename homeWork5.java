package charExamples;

public class homeWork5 {
    public static void main(String[] args) {

//        1st method
        int qq = '0';
        System.out.println(qq);

        System.out.println();

//        2nd method (String.valueOf())

        char u = '0';
        String uu = String.valueOf(u);
        int uuu = Integer.parseInt(uu);

        System.out.println(uuu);

        System.out.println();
//        3rd method (getNumericValue() - Character)

        char i = '0';
        int ii = Character.getNumericValue(i);

        System.out.println(ii);


    }
}
