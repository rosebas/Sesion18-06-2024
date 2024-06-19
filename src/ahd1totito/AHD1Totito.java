/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahd1totito;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class AHD1Totito {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro juego de totito");
        
        String[][] reiniciarTablero = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        String[][] tablero = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        System.out.println("MOSTRAR LOS ELEMENTOS DE UN ARRAY BIDIMENCIONAL");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println("");
        }
        

        boolean[] listaPosiciones = {false, false, false, false, false, false, false, false, false};
        int turnos = 0;
        boolean flag1 = false;
        
        String fichaUno = "X";
        String fichaDos = "O";
        String jugadorActual = fichaDos;
        
        boolean hayGanador = false;
        while (!hayGanador) {
            boolean posicionCorrecta = false;

            System.out.println("Por favor elige un numero para colocar tu ficha");
            String posicion = scanner.nextLine();
            
                if(flag1 = true){
                    tablero = reiniciarTablero;
                }
                
            while (!posicionCorrecta) {
                
                int posicionInt = Integer.parseInt(posicion);
                if (posicionInt >= 1 && posicionInt <= 9 && listaPosiciones[posicionInt - 1] == false) {

                    posicionCorrecta = true;
                } else {
                    posicionCorrecta = false;
                    System.out.println("Por favor ingrese un numero del 1 al 9");
                    posicion = scanner.nextLine();
                }

            }

            if (jugadorActual.equals(fichaUno)) {
                jugadorActual = fichaDos;
            } else {
                jugadorActual = fichaUno;
            }
            int posicionInt = Integer.parseInt(posicion);

            switch (posicion) {
                case "1":
                    tablero[0][0] = jugadorActual;
                    listaPosiciones[0] = true;
                    break;
                case "2":
                    tablero[0][1] = jugadorActual;
                    listaPosiciones[1] = true;
                    break;
                case "3":
                    tablero[0][2] = jugadorActual;
                    listaPosiciones[2] = true;
                    break;
                case "4":
                    tablero[1][0] = jugadorActual;
                    listaPosiciones[3] = true;
                    break;
                case "5":
                    tablero[1][1] = jugadorActual;
                    listaPosiciones[4] = true;
                    break;
                case "6":
                    tablero[1][2] = jugadorActual;
                    listaPosiciones[5] = true;
                    break;
                case "7":
                    tablero[2][0] = jugadorActual;
                    listaPosiciones[6] = true;
                    break;
                case "8":
                    tablero[2][1] = jugadorActual;
                    listaPosiciones[7] = true;
                    break;
                case "9":
                    tablero[2][2] = jugadorActual;
                    listaPosiciones[8] = true;
                    break;
                default:
                    System.out.println("Ingrese un numero correcto");
            }
            
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print("[" + tablero[i][j] + "]");
                }
                System.out.println("");
            }

            if (tablero[0][0].equals(jugadorActual) && tablero[1][0].equals(jugadorActual) && tablero[2][0].equals(jugadorActual)
                    || tablero[0][1].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][1].equals(jugadorActual)
                    || tablero[0][2].equals(jugadorActual) && tablero[1][2].equals(jugadorActual) && tablero[2][2].equals(jugadorActual)) {
                System.out.println("Felicidades! Gano el jugador con la ficha " + jugadorActual);
                hayGanador = true;
            } else if (tablero[0][0].equals(jugadorActual) && tablero[0][1].equals(jugadorActual) && tablero[0][2].equals(jugadorActual)
                    || tablero[1][0].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[1][2].equals(jugadorActual)
                    || tablero[2][0].equals(jugadorActual) && tablero[2][1].equals(jugadorActual) && tablero[2][2].equals(jugadorActual)) {
                System.out.println("Felicidades! Gano el jugador con la ficha " + jugadorActual);
                hayGanador = true;
            } else if (tablero[0][0].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][2].equals(jugadorActual)
                    || tablero[0][2].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][0].equals(jugadorActual)) {
                System.out.println("Felicidades! Gano el jugador con la ficha " + jugadorActual);
                hayGanador = true;
            }
            
            turnos++;
            
            if((turnos >= 9 && hayGanador == false) || hayGanador == true){
                
                System.out.println("Turnos finalizados, termina el juego");
                System.out.println("Si desea volver a jugar pulse 1");
                
                int opcion = scanner.nextInt();
                if(opcion == 1){
                    hayGanador = true;
                    flag1 = true;
                } else {
                    break;
                }
            }
            
        }

    }   
}