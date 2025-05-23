// 1PP - Comision 325 - Bustamante Mathias Andres.

import Utilidades_UTN.Controlador;
import Utilidades_UTN.ManejadorDeDatos;

public class Main {
    public static void main(String[] args) {
        int opcion;
        final String MAIN_MENU = """
                [TITULO]
                 \t[1] Opcion 1.
                 \t[2] Opcion 2.
                 \t[3] Opcion 3.
                 \t[4] Opcion 4.
                 \t[5] Opcion 5.
                \t\t[0] SALIR.
                \s
                [OPCION]:\s""";

        do {
            opcion = ManejadorDeDatos.getIntRange(MAIN_MENU, "[ERROR] Opcion no valida.\n", 0, 5);
            switch (opcion) {
                case 0:
                    System.out.println("[PROGRAMA FINALIZADO]");
                    break;
                case 1:
                    Controlador.Controller_Opcion_01();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcion != 0);
    }
}