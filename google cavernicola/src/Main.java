import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner mySC = new Scanner(System.in);
        System.out.println("Bienvenido al buscador de textos en paginas webs!");
        System.out.println("Ingresar direccion de la pagina web, ejemplo: https://www.clarin.com");
        String webPage = mySC.nextLine();
        boolean textFind = false;

        System.out.println("Ingresar texto a buscar");
        String userText = mySC.nextLine();
        textFind = seEncuentraPalabraEnTexto(webPage , userText);
        if ( textFind == true){
            System.out.println("Se encontro la palabra: "+ userText +" en: " + webPage);
        } else {
            System.out.println("No se encontro la palabra: "+ userText +" en: " + webPage);
        }
    }

    static boolean seEncuentraPalabraEnTexto(String texto, String palabra) {
        if (texto.indexOf(palabra) > 0) {
            return true;
        } else {
            return false;
        }
    }

    static String obtenerPaginaWeb(String direccion) {
        try {
            URL url = new URL(direccion);
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String content = "";
            String linea = br.readLine();
            while (null != linea) {
                content += linea;
                linea = br.readLine();
            }
            return content;

        } catch (Exception e1) {
            throw new RuntimeException(e1);
        }
    }


}