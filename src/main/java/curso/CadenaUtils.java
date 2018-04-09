package curso;

public class CadenaUtils {

    public String aLetraCapital(String cadena) {

        String mayuscula = cadena.substring(0, 1).toUpperCase();
        String resto = cadena.substring(1).toLowerCase();
        return mayuscula + resto;
    }

    public String invertir(String cadena) {

        int len = cadena.length();
        String res = "";
        for (int cont = len - 1; cont >= 0; cont--) {
            res = res + cadena.charAt(cont);
        }
        return res;

    }

    public boolean hayNumeros(String cadena) {

        String[] trozos = cadena.split("");
        boolean ind = false;
        for (int cont = 0; cont < trozos.length; cont++) {
            if (trozos[cont].matches("[0-9]")) {
                ind = true;
                break;
            }
        }
        return ind;
    }

    public String mask(String mask, String cadena) {

        String res = "";
        for (int cont = 0; cont < cadena.length(); cont++) {
            String letra = "" + cadena.charAt(cont);
            String letraMask = "" + mask.charAt(cont);
            if (letraMask.equalsIgnoreCase("x")) {
                res = res + letraMask;
            } else {
                res = res + letra;
            }
        }
        return res;
    }
}
