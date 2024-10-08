public class Parseador {

    public int obtenerParte1(String ecuacion) {
        String[] partes = ecuacion.split("x");
        return Integer.parseInt(partes[0].trim());
    }

    public int obtenerParte2(String ecuacion) {
        String[] partes = ecuacion.split("[+=]");
        return Integer.parseInt(partes[1].trim());
    }

    public int obtenerParte3(String ecuacion) {
        String[] partes = ecuacion.split("=");
        return Integer.parseInt(partes[1].trim());
    }

    public String obtenerOperador(String ecuacion) {
        if (ecuacion.contains("+")) {
            return "+";
        } else if (ecuacion.contains("-")) {
            return "-";
        }
        return "";
    }
}