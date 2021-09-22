public class recursividad {
    public static String invertirCadena(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
