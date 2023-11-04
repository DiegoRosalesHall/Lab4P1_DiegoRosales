package lab4p1_diegorosales;

import java.util.Scanner;

public class LAB4P1_DIEGOROSALES {

    public static void main(String[] args) {
        int contador_menu = 1;
        Scanner mcgregor = new Scanner(System.in);
        while (contador_menu == 1) {
            System.out.println(" ");
            System.out.println("Bienvenido al menu, eliga su programa");
            System.out.println("1.~ Inversion espacial");
            System.out.println("2.~ Balanza de cadenas");
            System.out.println("3.~ Cifrado de mensajes");
            System.out.println("4.~ Finalizacion del programa");

            int opcion_menu = mcgregor.nextInt();
            switch (opcion_menu) {
                case 1: {

                    String a = " ";
                    int contadorchar = 0;
                    String palabra;
                    char espacio = a.charAt(0);
                    while (true) {
                        System.out.println("Ingrese la cadena: ");
                        mcgregor.nextLine();
                        String cadena = mcgregor.nextLine();
                        if (cadena.length() < 5) {
                            System.out.println("Error, numero menor a 5");
                            break;
                        } else {
                            int cadenalength = cadena.length();

                            cadenalength = cadenalength - 1;

                            for (int i = 0; i < cadena.length(); i++) {
                                char cadena_2 = cadena.charAt(i);

                                if (cadena_2 == espacio || i == cadena.length() - 1) {
                                    palabra = cadena.substring(contadorchar, i + 1);
                                    int contador = palabra.length();

                                    for (int j = 0; j < palabra.length(); j++) {
                                        char p = palabra.charAt(contador - 1);
                                        System.out.print(p);
                                        contador = contador - 1;
                                    }

                                    System.out.print(" ");
                                    contadorchar = i + 1;

                                }
                            }

                        }
                        break;
                    }

                    break;
                }

                case 2:
                    String cadena1 = "";
                    int maximo = 0;
                    int cadena2 = 0;
                    int cadena3 = 0;
                    int cadena4 = 0;
                    int peso = 0;
                    int x = 1;
                    mcgregor.nextLine();
                    for (int i = 0; i < 3; i++) {

                        System.out.println("Ingrese la cadena " + x);
                        peso = 0;
                        cadena1 = mcgregor.nextLine();
                        for (int j = 0; j < cadena1.length(); j++) {
                            char m = cadena1.charAt(j);
                            int valor = m;
                            peso += valor;

                        }
                        if (x == 1) {
                            cadena2 = peso;
                        } else if (x == 2) {
                            cadena3 = peso;
                        } else if (x == 3) {
                            cadena4 = peso;
                        }

                        x++;

                    }
                    System.out.println("Peso cadena 1: " + cadena2);
                    System.out.println("Peso cadena 2: " + cadena3);
                    System.out.println("Peso cadena 3: " + cadena4);

                    if (cadena2 > cadena3 && cadena2 > cadena4) {
                        System.out.println("La cadena 1 es la mas pesada");
                    } else if (cadena3 > cadena2 && cadena3 > cadena4) {
                        System.out.println("La cadena 2 es la mas pesada");
                    } else if (cadena4 > cadena2 && cadena4 > cadena3) {
                        System.out.println("La cadena 3 es la mas pesada");
                    }

                    break;

                case 3:
                    int m1 = 0;
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    mcgregor.nextLine();
                    String mensaje = mcgregor.nextLine();
                    System.out.print("Mensaje decifrado: ");
                    for (int i = 0; i < mensaje.length(); i++) {
                        char m = mensaje.charAt(i);
                        m1 = (int) m;
                        m1 = m1 + 2;

                        char c = (char) m1;

                        System.out.print(c);

                    }

                    break;

                case 4:
                    contador_menu = 0;
                    System.out.println("Fin del programa :( ");
                    break;

            }// FIN MENU
        }// FIN WHILE MENU
    }// FIN MAIN

}// FIN CLASS
