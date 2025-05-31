package Utilidades_UTN;

import Entidades.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Controlador {
    public static void Controller_Opcion_01(List<Nave> listaNaves) {
        int opcion;
        String OPCIONES = """
                --- TIPO DE NAVE ---
                \t[1] Nave de Exploracion.
                \t[2] Carguero.
                \t[3] Crucero Estelar.
                \t\t[0] SALIR.
                \s
                [OPCION]:\s""";

        do {
            opcion = ManejadorDeDatos.getIntRange(OPCIONES, "[ERROR] Opcion no valida.\n", 0, 3);
            switch (opcion) {
                case 0:
                    System.out.println("[SALIENDO DE AGREGAR NAVE]");
                    break;
                case 1:
                    NaveExploracion n1 = new NaveExploracion(
                            ManejadorDeDatos.getString("Nombre de la nave: ", "[ERROR] Nombre no valido."),
                            ManejadorDeDatos.getIntRange("Capacidad de tripulacion: ", "[ERROR] Capacidad no valida. ", 0, 10),
                            ManejadorDeDatos.getIntRange("Año de lanzamiento: ", "[ERROR] Año no valido.", 2000, Integer.MAX_VALUE),
                            null);

                    switch (ManejadorDeDatos.getIntRange("""
                            Tipo de exploracion:
                            [1] Cartografia.
                            [2] Investigacion.
                            [3] Contacto.
                            \tOPCION:\s""", "[ERROR] Opcion no valida.", 1, 3)) {

                        case 1:
                            n1.setTipoExploracion(ETipoExploracion.CARTOGRAFIA);
                            break;
                        case 2:
                            n1.setTipoExploracion(ETipoExploracion.INVESTIGACION);
                            break;
                        case 3:
                            n1.setTipoExploracion(ETipoExploracion.CONTACTO);
                        default:
                            System.out.println("[ERROR.] Opcion no valida.");
                    }

                    if (!listaNaves.contains(n1)) {
                        System.out.println("[NAVE DE EXPLORACION GENERADA CON EXITO]\n" + n1);
                        listaNaves.add(n1);
                    } else {
                        System.out.println("[ERROR] La nave ya existe.");
                    }
                    break;
                case 2:
                    Carguero n2 = new Carguero(
                            ManejadorDeDatos.getString("Nombre de la nave: ", "[ERROR] Nombre no valido."),
                            ManejadorDeDatos.getIntRange("Capacidad de tripulacion: ", "[ERROR] Capacidad no valida. ", 0, 10),
                            ManejadorDeDatos.getIntRange("Año de lanzamiento: ", "[ERROR] Año no valido.", 2000, Integer.MAX_VALUE),
                            ManejadorDeDatos.getIntRange("Capacidad de carga: ", "[ERROR] Capacidad no valida.", 0, 500)); // Se valida menor a 100 pero el ejercicio dice que menor a 100 se setea a 100 por eso min 0

                    if (!listaNaves.contains(n2)) {
                        System.out.println("[NAVE CARGUERO GENERADA CON EXITO]\n" + n2);
                        listaNaves.add(n2);
                    } else {
                        System.out.println("[ERROR] La nave ya existe.");
                    }
                    break;
                case 3:
                    CruceroEstelar n3 = new CruceroEstelar(
                            ManejadorDeDatos.getString("Nombre de la nave: ", "[ERROR] Nombre no valido."),
                            ManejadorDeDatos.getIntRange("Capacidad de tripulacion: ", "[ERROR] Capacidad no valida. ", 0, 10),
                            ManejadorDeDatos.getIntRange("Año de lanzamiento: ", "[ERROR] Año no valido.", 2000, Integer.MAX_VALUE),
                            ManejadorDeDatos.getIntRange("Capacidad de pasajeros: ", "[ERROR] Capacidad no valida.", 0, 1000));

                    if (!listaNaves.contains(n3)) {
                        System.out.println("[NAVE CRUCERO ESTELAR GENERADA CON EXITO]\n" + n3);
                        listaNaves.add(n3);
                    } else {
                        System.out.println("[ERROR] La nave ya existe.");
                    }
                    break;
            }
        } while (opcion != 0);
    }

    public static void Controller_Opcion_02(List<Nave> listaNaves) {
        System.out.println("[LISTADO DE NAVES]");
        Controlador.mostrarListado(listaNaves);
    }

    public static void Controller_Opcion_03(List<Nave> listaNaves) {
        System.out.println("[INICIANDO MISIONES DE EXPLORACION]");
        int count = 0;
        for (Nave n : listaNaves) {
            count++;
            System.out.println("[" + count + "] " + n.iniciarExploracion());
        }
    }

    public static void Controller_Opcion_04(List<Nave> listaNaves) {
        System.out.println("[LISTADO DE NAVES ORDENADOS POR NOMBRE]");
        Collections.sort(listaNaves); // Se ordena por interfaz Comparable, Collections utiliza compareTo()
        Controlador.mostrarListado(listaNaves);
    }

    public static void Controller_Opcion_05(List<Nave> listaNaves) {
        System.out.println("[LISTADO DE NAVES ORDENADOS POR LANZAMIENTO] DESCENDENTE");
        Nave.ordenarCriterio(listaNaves, Comparator.comparing(Nave::getAnioDeLanzamiento).reversed());
        Controlador.mostrarListado(listaNaves);
    }

    public static void Controller_Opcion_06(List<Nave> listaNaves) {
        System.out.println("[LISTADO DE NAVES ORDENADOS TRIPULACION] DESCENDENTE");
        Nave.ordenarCriterio(listaNaves, Comparator.comparing(Nave::getCapacidadDeTripulacion).reversed());
        Controlador.mostrarListado(listaNaves);
    }

    private static void mostrarListado(List<Nave> listaNaves) {
        if (listaNaves == null || listaNaves.isEmpty()) {
            System.out.println("[ERROR] Lista vacia.");
        } else {
            int count = 0;
            for (Nave n : listaNaves) {
                count++;
                System.out.println("[" + count + "] " + n);
            }
        }
    }
}
