// 1PP - Comision 325 - Bustamante Mathias Andres.
// LOS DIAGRAMAS UML ESTAN DENTRO DEL DIRECTORIO /UML/*

import Entidades.*;
import Utilidades_UTN.Controlador;
import Utilidades_UTN.ManejadorDeDatos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nave> listaNaves = new ArrayList<>();
        ///*
        listaNaves.add(new NaveExploracion("Nave TEST 2", 10, 20000, ETipoExploracion.INVESTIGACION));
        listaNaves.add(new Carguero("Nave TEST 1", 5, 10000, 1));
        listaNaves.add(new CruceroEstelar("Nave TEST 3", 2, 50000, 100));
        //*/

        int opcion;
        final String MAIN_MENU = """
                ______________________________________________________________________________
                [MENU DE GESTION DE EXPEDICIONES ESPACIALES]
                 \t[1] Agregar nave.
                 \t[2] Mostrar todas las naves.
                 \t[3] Iniciar exploracion.
                 \t[4] Mostrar naves ordenadas por NOMBRE.
                 \t[5] Mostrar naves ordenadas por AÑO DE LANZAMIENTO.
                 \t[6] Mostrar naves ordenadas por TRIPULACION.
                \t\t[0] SALIR.
                \s
                [OPCION]:\s""";

        do {
            opcion = ManejadorDeDatos.getIntRange(MAIN_MENU, "[ERROR] Opcion no valida.\n", 0, 6);
            switch (opcion) {
                case 0:
                    System.out.println("[PROGRAMA FINALIZADO]");
                    break;
                case 1:
                    Controlador.Controller_Opcion_01(listaNaves);
                    break;
                case 2:
                    Controlador.Controller_Opcion_02(listaNaves);
                    break;
                case 3:
                    Controlador.Controller_Opcion_03(listaNaves);
                    break;
                case 4:
                    Controlador.Controller_Opcion_04(listaNaves);
                    break;
                case 5:
                    Controlador.Controller_Opcion_05(listaNaves);
                    break;
                case 6:
                    Controlador.Controller_Opcion_06(listaNaves);
                    break;
            }
        } while (opcion != 0);
    }
}