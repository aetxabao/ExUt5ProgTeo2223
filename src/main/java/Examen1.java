import java.util.Arrays;

public class Examen1 {

    public static void main(String[] args) {
        ej1();
        ej2();
        ej3();
        ej4(new int[] {5, 5, 5, 5, 4});
        ej5();
        ej6();
        ej7();
        ej8();
        ej9();
        ej10();
        ej11();
        ej12();
        ej13();
        ej14();
        ej15();
        ej16();
        ej17();
        ej18();
        ej19();
        ej20();
    }

    /**
     *         a) 16
     *         b) 12
     *         c) 18
     *         d) 14
     */
    public static void ej1() {
        int[] a = {14, 16, 12, 18, 12, 19};
        System.out.println(a[a.length-3]);
    }

    /**
     *          a) int[ ] copia = Arrays.copyOf(numeros, numeros.length - 1);
     *          b) int[ ] copia = Arrays.copyOf(numeros, 0, copia, 0,  numeros.length);
     *          c) int[ ] copia = Arrays.copyOf(numeros, numeros.length);
     *          d) int[ ] copia = Arrays.copyOf(numeros, 0, copia, 0, numeros.length - 1);
     */
    public static void ej2() {
        int[] numeros = {2, 4, 6, 8, 10, 12, 15};
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println(Arrays.toString(copia));
    }

    /**
     *         a) 37
     *         b) 16
     *         c) 22
     *         d) 50
     */
    public static void ej3() {
        int[] a = {3, 5, 12, 55, 89};
        int[] b = a;
        b[2] = b[2] * 2;
        a[2]++;
        System.out.println(a[2] + b[2]);
    }

    /**
     * @param array new int[] {5, 5, 5, 5, 4}
     *
     *          a) [4, 4, 4, 4, 4]
     *          b) [4, 4, 4, 5, 4]
     *          c) [5, 4, 4, 4, 4]
     *          d) [5, 5, 5, 5, 4]
     */
    public static void ej4(int[] array)   {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1])      {
                array[i]--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     *          a) 3
     *          b) 4
     *          c) 7
     *          d) 12
     */
    public static void ej5()  {
        int[][] things =
                {   {10, 1, 3, 4},
                    {4, 3, 1, 12, 7},
                    {3, 2, 6},
                    {212},
                    {24, 4, 3, 7, 15, 32}
                };
        int x = things[2][1];
        System.out.println(things[things[0].length][x]);
    }

    /**
     *          a) [4, 3, 6, 7, 9, 5]
     *          b) [3, 4, 5, 6, 7, 9]
     *          c) [3, 4, 6, 7, 9, 5]
     *          d) [9, 7, 6, 5, 4, 3]
     */
    private static void ej6() {
        int[] items = {4, 9, 3, 7, 6, 5 } ;
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
    }

    /**
     *          a) ogramac
     *          b) rograma
     *          c) ogama
     *          d) ogramaci
     */
    private static void ej7() {
        String str1 = "Examen-de";
        String str2 = "programacion";
        System.out.println(
                str2.substring(2,  4).
                        concat(str2.substring(5,  8))
        );
    }

    /**
     *         a) d
     *         b) e
     *         c) -
     *         d) T
     */
    private static void ej8() {
        String str1 = "Examen-de";
        String str2 = "-programacion";
        String str3 = "-de-la-UT5";

        System.out.println(str1.charAt(str3.length() - 2));
    }

    /**
     *          a) 3
     *          b) 12
     *          c) 11
     *          d) 4
     */
    private static void ej9() {
        String str1 = "Examen-de";
        String str2 = "-programacion";
        String str3 = "-de-la-UT5";

        System.out.println(str2.lastIndexOf("o"));
    }

    /**
     *          a) XX / iguales
     *          b) XX / distintas
     *          c) YY / distintas
     *          d) YY / iguales
     */
    private static void ej10() {
        String str1 = "Examen-de";
        String str2 = "examen-de";
        if (str1.compareTo(str2) > 0)  {
            System.out.print("XX");
        }
        else {
            System.out.print("YY");
        }
        if (str1.equalsIgnoreCase(str2) ) {
            System.out.println(" / iguales");
        }
        else {
            System.out.println(" / distintas");
        }
    }

    /**
     *          a) [H, O, L, A]
     *          b) [H, A, L, O]
     *          c) [V, A, S, O]
     *          d) [H, C, P, V]
     */
    private static void ej11() {
        String[] a = {"HOLA", "CASA", "PELO", "VASO"};
        char[][] m = new char[4][];
        for (int i = 0; i < 4; i++) {
            m[i] = a[i].toCharArray();
        }
        for (int i = 0; i < 4; i++) {
            m[0][i] = m[i][i];
        }
        System.out.println(Arrays.toString(m[0]));
    }

    /**
     *          a) 33
     *          b) 35
     *          c) 15
     *          d) 13
     */
    private static void ej12() {
        int[][] a = {{1,2,3,4},{11,12,13,14},{21,22,23,24}};
        int[][] b = new int[4][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                b[j][i] = a[i][3-j];
            }
        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(Arrays.toString(b[i]));
//        }
        System.out.println(b[2][0]+b[1][1]);
    }

    /**
     *          a) 5
     *          b) 23
     *          c) 14
     *          d) 122
     */
    private static void ej13() {
        String s = "1;7;2;3;4;5;";
        String[] a = s.split(";");
        System.out.println(a[2]+a[3]);
    }

    /**
     *          a) tarabuela
     *          b) abuela
     *          c) tartarabuela
     *          d) abuelo
     */
    private static void ej14() {
        String s = "tartarabuela";
        s.replaceAll("tar", "");
        System.out.println(s);
    }

    /**
     *          a) ra
     *          b) ab
     *          c) bu
     *          d) ta
     */
    private static void ej15() {
        String s = "tartarabuela";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString().substring(6,8));
    }

    /**
     *          a) C
     *          b) A
     *          c) B
     *          d) cadena vacía
     */
    private static void ej16() {
        String s = "<things>" +
                "<item><id>1</id><name>A</name></item>" +
                "<item><id>2</id><name>B</name></item>" +
                "<item><id>3</id><name>C</name></item>" +
                "</things>";
        String[] a = s.split("<name>");
        s = a[2].substring(0,a[2].indexOf("</name>"));
        System.out.println(s);
    }

    /**
     *          a) Kaiser
     *          b) Soze
     *          c) Beni
     *          d) name
     */
    private static void ej17() {
        String s = //textos entre comillas simples
                    "'name':'Kaiser','name':'Soze','name':'Beni'";
        String par = "'name'";//con comillas simples
        for (int i = 0; i < 2; i++) {
            s = s.substring(s.indexOf(par)+par.length()+2);
        }
        s = s.substring(0,s.indexOf("'"));//comilla simple
        System.out.println(s);
    }

    /**
     *          a) [36, 24, 12, 0]
     *          b) [12, 24, 36, 0]
     *          c) [12, 36, 24, 0]
     *          d) [0, 12, 24, 36]
     */
    private static void ej18() {
        int[] numeros = {12, 36, 24, 0};
        for (int i = 0; i < numeros.length - 1; i++) {
            int posmin = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posmin]) {
                    posmin = j;
                }
            }
            int aux = numeros[posmin];
            numeros[posmin] = numeros[i];
            numeros[i] = aux;
        }
        System.out.println(Arrays.toString(numeros));
    }

    /**
     *          a) [12, 13, 24, 36, 0]
     *          b) [12, 24, 36, 13, 0]
     *          c) [12, 24, 36, 13, 13]
     *          d) [12, 13, 24, 36, 36]
     */
    private static void ej19() {
        int valor = 13;
        int[] numeros = {12, 24, 36, 0, 0};
        int tam = 3;
        numeros[tam] = valor;
        int j = tam;// - 1;
        while (j >= 0 && numeros[j] > valor){
            numeros[j + 1] = numeros[j];
            j--;
        }
        numeros[j + 1] = valor;
        tam++;
        System.out.println(Arrays.toString(numeros));
    }

    /**
     *          a) 0
     *          b) 1
     *          c) 2
     *          d) 3
     */
    private static void ej20() {
        int[] numeros = {2,6,8};
        int valorBuscado = 9;
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length - 1;
        int mitad = 0;
        while (izquierda<= derecha && ! encontrado) {
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado) {
                encontrado = true;
            } else if (numeros[mitad] > valorBuscado) {
                derecha = mitad - 1;
            } else {
                izquierda = mitad + 1;
            }
        }
        System.out.println(mitad);
    }


}
