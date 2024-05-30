package labfinal_java_jjct_odlb_aiaj;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LabFinal_Java_JJCT_ODLB_AIAJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean Validacion = false;
        Random numero = new Random();
        Random ran = new Random();
        int op, num, D1, D2, D3, D4, d1, d2, d3, d4, num2, i, f, p, dado1, dado2, acumulado1, acumulado2, valor1, valor2, juego;
        op = 1;
        while (op != 0) {
            JOptionPane.showMessageDialog(null,
                    "✦✦ Bienvenido al Menú Iterativo de Miscelánea de Juegos en Java ✦✦\n"
                    + "✦\t1.Para Punto y Fama                                                                                          ✦\n"
                    + "✦\t2.Para Dados                                                                                                       ✦\n"
                    + "✦\t3.Para Margarita                                                                                                 ✦\n"
                    + "✦\t0.Para Salir                                                                                                           ✦\n"
                    + "✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
            op = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción: "));
            //Se valida la opcion ingresada
            while (op < 0 | op > 3) {
                System.out.println("✺✺✺Opción inválida, elija nuevamente✺✺✺");
                JOptionPane.showMessageDialog(null,
                        "✺✺✺Opción inválida, elija nuevamente✺✺✺\n\n"
                        + "✦✦ Bienvenido al Menú Iterativo de Miscelánea de Juegos en Java ✦✦\n"
                        + "✦\t1.Para Punto y Fama                                                                                          ✦\n"
                        + "✦\t2.Para Dados                                                                                                       ✦\n"
                        + "✦\t3.Para Margarita                                                                                                 ✦\n"
                        + "✦\t0.Para Salir                                                                                                           ✦\n"
                        + "✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
                op = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción: "));
            }
            switch (op) {
                case 1:
                    i = 1;
                    D1 = 0;
                    D2 = 0;
                    D3 = 0;
                    D4 = 0;
                    num = 0;
                    while (Validacion == false) {
                        //Se crea aleatoriamente el numero en un rango de 1 a 8999 y se se le suma 1000 para que siempre sea un numero de 4 cifras
                        num = (numero.nextInt(9000) + 1000);
                        //Se saca digito por digito
                        D1 = num / 1000;
                        D2 = (num / 100) % 10;
                        D3 = (num / 10) % 10;
                        D4 = num % 10;
                        if (D1 != D2 && D1 != D3 && D1 != D4 && D2 != D3 && D2 != D4 && D3 != D4) {
                            Validacion = true;
                            //Si los digitos son todos diferentes uno del otro entonces se sale del ciclo
                        }
                    }
                    JOptionPane.showMessageDialog(null,
                            "\n➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣"
                            + "Bienvenido al Juego de Punto y Fama"
                            + "➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣\n"
                            + "Intente adivinar el número de 4 cifras (sin digitos repetidos)");
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("✺✺Digite un numero de 4 cifras positivo✺✺"));
                    //Se valida el numero ingresado
                    while (num2 < 1000 | num2 > 9999) {
                        JOptionPane.showMessageDialog(null,
                                "✺✺Número inválido, digite un número de 4 cifras positivo✺✺");
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("✺✺Número inválido, digite un número de 4 cifras positivo✺✺"));
                    }
                    while (num != num2) {
                        //Se inicializa Validacion en True para que no haya errores al repetir el bucle
                        Validacion = true;
                        f = 0;
                        p = 0;
                        d1 = num2 / 1000;
                        d2 = (num2 / 100) % 10;
                        d3 = (num2 / 10) % 10;
                        d4 = num2 % 10;
                        while (Validacion == true) {
                            //Se vuelven a sacar los digitos del numero ingresado luego de un error
                            d1 = num2 / 1000;
                            d2 = (num2 / 100) % 10;
                            d3 = (num2 / 10) % 10;
                            d4 = num2 % 10;
                            if (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4) {
                                Validacion = false;
                                //Si los digitos del numero ingresado son todos diferentes uno del otro se sale del bucle
                            } else {
                                //Si al menos un digito es repetido entonces se solicita otro numero y se repite el bucle
                                JOptionPane.showMessageDialog(null,
                                        "✺✺Combinación inválida, el número no puede tener digitos repetidos✺✺");
                                num2 = Integer.parseInt(JOptionPane.showInputDialog("✺✺Combinación inválida, el número no puede tener digitos repetidos✺✺"));
                                //Se valida el numero ingresado
                                while (num2 < 1000 | num2 > 9999) {
                                    JOptionPane.showMessageDialog(null,
                                            "✺✺Número inválido, digite un número de 4 cifras positivo✺✺");
                                    num2 = Integer.parseInt(JOptionPane.showInputDialog("✺✺Número inválido, digite un número de 4 cifras positivo✺✺"));
                                }
                            }
                        }
                        //Condicionales para calcular el numero de famas y puntos del numero ya validado
                        if (D1 == d1) {
                            f = f + 1;
                        }
                        if (D2 == d2) {
                            f = f + 1;
                        }
                        if (D3 == d3) {
                            f = f + 1;
                        }
                        if (D4 == d4) {
                            f = f + 1;
                        }
                        if (d1 == D2 | d1 == D3 | d1 == D4) {
                            p = p + 1;
                        }
                        if (d2 == D1 | d2 == D3 | d2 == D4) {
                            p = p + 1;
                        }
                        if (d3 == D1 | d3 == D2 | d3 == D4) {
                            p = p + 1;
                        }
                        if (d4 == D1 | d4 == D2 | d4 == D3) {
                            p = p + 1;
                        }
                        JOptionPane.showMessageDialog(null,
                                "➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣\n"
                                + "Ha obtenido " + f + " famas y " + p + " puntos\n"
                                + "Digite una nueva combinación: ");
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite una nueva combinación: "));
                        //Se valida el numero ingresado
                        while (num2 < 1000 | num2 > 9999) {
                            JOptionPane.showMessageDialog(null,
                                    "✺✺Número inválido, digite un número de 4 cifras positivo✺✺");
                            num2 = Integer.parseInt(JOptionPane.showInputDialog("✺✺Número inválido, digite un número de 4 cifras positivo✺✺"));
                        }
                        //Contador de intentos
                        i = i + 1;
                    }
                    JOptionPane.showMessageDialog(null,
                            "✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔\n"
                            + "!!!Ha adivinado el número!!\n"
                            + "Intentos: " + i
                            + "\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                    break;

                case 2:
                    i = 1;
                    acumulado1 = 0;
                    acumulado2 = 0;

                    JOptionPane.showMessageDialog(null,
                            "\n★★★★★★★★★★★★★★★★★★★★★★★★★★\n"
                            + "★★ Bienvenido al Juego de los Dados                        ★★\n"
                            + "★★★★★★★★★★★★★★★★★★★★★★★★★★\n");

                    // Ciclo para las rondas
                    do {
                        JOptionPane.showMessageDialog(null,
                                "★★★★★★★★★★★★★★★★★★★\n"
                                + "★         Ronda: " + i + "                                           ★\n"
                                + "★★★★★★★★★★★★★★★★★★★\n\n");

                        // Ciclo para el jugador 1
                        do {
                            JOptionPane.showMessageDialog(null, "★★★ Turno Jugador 1 ★★★");
                            juego = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un 1 para lanzar los dados"));
                            while (juego != 1) {
                                JOptionPane.showMessageDialog(null, "✺✺Introduzca un valor válido✺✺");
                                juego = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un 1 para lanzar los dados"));
                            }

                            // Asignación aleatoria de valor
                            dado1 = ran.nextInt(6) + 1;
                            dado2 = ran.nextInt(6) + 1;
                            JOptionPane.showMessageDialog(null,
                                    "★★★★★★★★★★★★★★★\n"
                                    + "★ Primer dado: " + dado1 + "                        ★\n"
                                    + "★ Segundo dado: " + dado2 + "                    ★\n"
                                    + "★★★★★★★★★★★★★★★\n\n");

                            // Punto por sacar doble
                            if (dado1 == dado2) {
                                acumulado1++;
                                JOptionPane.showMessageDialog(null,
                                        "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n"
                                        + "El Jugador 1 ganó un punto por sacar doble\n"
                                        + "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n"
                                        + "Puntaje Jugador 1: " + acumulado1 + "\n"
                                        + "Puntaje Jugador 2: " + acumulado2 + "\n");
                            }
                        } while (dado1 == dado2);
                        valor1 = dado1 + dado2;

                        // Ciclo para el jugador 2
                        do {
                            JOptionPane.showMessageDialog(null, "★★★ Turno Jugador 2 ★★★");
                            juego = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un 1 para lanzar los dados"));
                            while (juego != 1) {
                                JOptionPane.showMessageDialog(null, "✺✺Introduzca un valor válido✺✺");
                                juego = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un 1 para lanzar los dados"));
                            }

                            // Asignación aleatoria de valor
                            dado1 = ran.nextInt(6) + 1;
                            dado2 = ran.nextInt(6) + 1;
                            JOptionPane.showMessageDialog(null,
                                    "★★★★★★★★★★★★★★★\n"
                                    + "★ Primer dado: " + dado1 + "                        ★\n"
                                    + "★ Segundo dado: " + dado2 + "                    ★\n"
                                    + "★★★★★★★★★★★★★★★\n\n");

                            // Punto por sacar doble
                            if (dado1 == dado2) {
                                acumulado2++;
                                JOptionPane.showMessageDialog(null,
                                        "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n"
                                        + "El Jugador 2 ganó un punto por sacar doble\n"
                                        + "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\n"
                                        + "Puntaje Jugador 1: " + acumulado1 + "\n"
                                        + "Puntaje Jugador 2: " + acumulado2 + "\n");
                            }
                        } while (dado1 == dado2);
                        valor2 = dado1 + dado2;

                        // Comparación de resultados
                        if (valor1 > valor2) {
                            acumulado1 += 3;
                            JOptionPane.showMessageDialog(null,
                                    "➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟\n"
                                    + "➟ El jugador 1 ganó el turno\n"
                                    + "➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                            i++;
                        } else if (valor1 < valor2) {
                            acumulado2 += 3;
                            JOptionPane.showMessageDialog(null,
                                    "➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟\n"
                                    + "➟ El jugador 2 ganó el turno\n"
                                    + "➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                            i++;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳\n"
                                    + "➳ Empate, la ronda se repite\n"
                                    + "➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                        }

                        // Puntos para el ganador de la ronda
                        JOptionPane.showMessageDialog(null,
                                "Puntaje Jugador 1: " + acumulado1 + "\n"
                                + "Puntaje Jugador 2: " + acumulado2 + "\n");
                    } while (i <= 21 && Math.abs(acumulado1 - acumulado2) < 15);

                    // Ganador y puntajes
                    if (acumulado1 > acumulado2) {
                        JOptionPane.showMessageDialog(null,
                                "✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔\n"
                                + "!!!El Jugador 1 es el ganador!!!\n"
                                + "✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                    } else if (acumulado2 > acumulado1) {
                        JOptionPane.showMessageDialog(null,
                                "✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔\n"
                                + "!!!El Jugador 2 es el ganador!!!\n"
                                + "✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳\n"
                                + "!!!El partido quedo en empate!!!\n"
                                + "➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                    }

                    JOptionPane.showMessageDialog(null,
                            "➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟\n"
                            + "Puntaje Jugador 1: " + acumulado1 + "\n"
                            + "Puntaje Jugador 2: " + acumulado2 + "\n"
                            + "➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟\n");
                    break;

                case 3:
                    int p1 = 0,
                     p2 = 0,
                     p3 = 0,
                     p4 = 0,
                     p5 = 0,
                     p6 = 0,
                     p7 = 0,
                     p8 = 0,
                     p9 = 0,
                     fc,
                     turno = 1,
                     td = 0,
                     val;

                    JOptionPane.showMessageDialog(null,
                            "\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀"
                            + "\n❀❀ Bienvenido al Juego de la Margarita ❀❀ \n"
                            + "❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀\n");
                    JOptionPane.showMessageDialog(null,
                            "\n➥ Empieza Jugador 1 \n"
                            + "¿Qué ficha desea retirar?\n");

                    op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una ficha del 1 al 9"));

                    // Se valida la ficha ingresada
                    while (op < 1 | op > 9) {
                        JOptionPane.showMessageDialog(null, "✘✘ Posición inválida, digite nuevamente ✘✘");
                        op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una ficha del 1 al 9"));
                    }

                    // Bucle en el que verifica si al menos una posición está vacía, sino se declara el ganador
                    while (p1 == 0 | p2 == 0 | p3 == 0 | p4 == 0 | p5 == 0 | p6 == 0 | p7 == 0 | p8 == 0 | p9 == 0) {
                        switch (op) { // Switch con 9 opciones, una por cada ficha
                            case 1:
                                // Se inicializan estas variables en cero en cada caso
                                val = 0;
                                td = 0;
                                if (p1 == 0) {
                                    if (turno % 2 == 0) {
                                        p1 = 2;
                                    } else {
                                        p1 = 1;
                                    }

                                    // Se pregunta al usuario si desea retirar una segunda ficha, sino lo desea, se pasa el turno
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));

                                    if (op == 1) {
                                        while (val == 0) { // Bucle que valida cada posible situación
                                            // Si ambas fichas contiguas están tomadas, se imprime dicho mensaje y se pasa el turno
                                            if (p4 != 0 & p2 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 4 o 2?"));
                                                while (fc != 4 & fc != 2) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 4) {
                                                    if (p4 == 0) { // Si la ficha contigua está vacía, se asigna el valor correspondiente
                                                        if (turno % 2 == 0) {
                                                            p4 = 2;
                                                        } else {
                                                            p4 = 1;
                                                        }
                                                        val = 1;
                                                    } else { // Si la ficha contigua tiene valor, se imprime el mensaje
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 2) {
                                                    if (p2 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p2 = 2;
                                                        } else {
                                                            p2 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    // Si el jugador eligió esta ficha y esta ya tiene valor, se imprime el mensaje y se asigna td a 1
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 2:
                                val = 0;
                                td = 0;
                                if (p2 == 0) {
                                    if (turno % 2 == 0) {
                                        p2 = 2;
                                    } else {
                                        p2 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p3 != 0 & p1 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 6 o 1?"));
                                                while (fc != 3 & fc != 1) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 3) {
                                                    if (p3 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p3 = 2;
                                                        } else {
                                                            p3 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 1) {
                                                    if (p1 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p1 = 2;
                                                        } else {
                                                            p1 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 3:
                                val = 0;
                                td = 0;
                                if (p3 == 0) {
                                    if (turno % 2 == 0) {
                                        p3 = 2;
                                    } else {
                                        p3 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p5 != 0 & p2 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 6 o 1?"));
                                                while (fc != 5 & fc != 2) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 5) {
                                                    if (p5 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p5 = 2;
                                                        } else {
                                                            p5 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 2) {
                                                    if (p2 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p2 = 2;
                                                        } else {
                                                            p2 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 4:
                                val = 0;
                                td = 0;
                                if (p4 == 0) {
                                    if (turno % 2 == 0) {
                                        p4 = 2;
                                    } else {
                                        p4 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p6 != 0 & p1 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 6 o 1?"));
                                                while (fc != 6 & fc != 1) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 6) {
                                                    if (p6 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p6 = 2;
                                                        } else {
                                                            p6 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 1) {
                                                    if (p1 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p1 = 2;
                                                        } else {
                                                            p1 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 5:
                                val = 0;
                                td = 0;
                                if (p5 == 0) {
                                    if (turno % 2 == 0) {
                                        p5 = 2;
                                    } else {
                                        p5 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p7 != 0 & p3 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 7 o 3?"));
                                                while (fc != 7 & fc != 3) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 7) {
                                                    if (p7 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p7 = 2;
                                                        } else {
                                                            p7 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 3) {
                                                    if (p3 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p3 = 2;
                                                        } else {
                                                            p3 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 6:
                                val = 0;
                                td = 0;
                                if (p6 == 0) {
                                    if (turno % 2 == 0) {
                                        p6 = 2;
                                    } else {
                                        p6 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p8 != 0 & p4 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 8 o 4?"));
                                                while (fc != 8 & fc != 4) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 8) {
                                                    if (p8 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p8 = 2;
                                                        } else {
                                                            p8 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 4) {
                                                    if (p4 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p4 = 2;
                                                        } else {
                                                            p4 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 7:
                                val = 0;
                                td = 0;
                                if (p7 == 0) {
                                    if (turno % 2 == 0) {
                                        p7 = 2;
                                    } else {
                                        p7 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p9 != 0 & p5 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 9 o 5?"));
                                                while (fc != 9 & fc != 5) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 9) {
                                                    if (p9 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p9 = 2;
                                                        } else {
                                                            p9 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 5) {
                                                    if (p5 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p5 = 2;
                                                        } else {
                                                            p5 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 8:
                                val = 0;
                                td = 0;
                                if (p8 == 0) {
                                    if (turno % 2 == 0) {
                                        p8 = 2;
                                    } else {
                                        p8 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p9 != 0 & p6 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 9 o 6?"));
                                                while (fc != 9 & fc != 6) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 9) {
                                                    if (p9 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p9 = 2;
                                                        } else {
                                                            p9 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 6) {
                                                    if (p6 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p6 = 2;
                                                        } else {
                                                            p6 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                            case 9:
                                val = 0;
                                td = 0;
                                if (p9 == 0) {
                                    if (turno % 2 == 0) {
                                        p9 = 2;
                                    } else {
                                        p9 = 1;
                                    }
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Desea retirar una segunda ficha contigua?\n1. Si (Presione cualquier otro número para No)"));
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p8 != 0 & p7 != 0) {
                                                JOptionPane.showMessageDialog(null,
                                                        "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳"
                                                        + "\n➳➳ No tiene fichas contiguas disponibles ➳➳"
                                                        + "\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                fc = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar, 8 o 7?"));
                                                while (fc != 8 & fc != 7) {
                                                    fc = Integer.parseInt(JOptionPane.showInputDialog("✘✘ Ficha inválida, digite nuevamente ✘✘"));
                                                }
                                                if (fc == 8) {
                                                    if (p8 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p8 = 2;
                                                        } else {
                                                            p8 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                } else if (fc == 7) {
                                                    if (p7 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p7 = 2;
                                                        } else {
                                                            p7 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "\n✷✷✷✷✷✷✷✷✷✷✷✷"
                                                                + "\n✷✷ Ficha ya tomada ✷✷"
                                                                + "\n✷✷✷✷✷✷✷✷✷✷✷✷");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "\n֎֎֎֎֎֎֎֎֎"
                                            + "\n֎ Ficha no válida ֎"
                                            + "\n֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                        }
                        // Condicional para que cuando sea el último turno y se elija la última ficha no se sume un turno más
                        if (p1 == 0 || p2 == 0 || p3 == 0 || p4 == 0 || p5 == 0 || p6 == 0 || p7 == 0 || p8 == 0 || p9 == 0) {
                            // Si td es 0, significa que no ha cambiado su valor por ende no ha habido ningún error al elegir una ficha y el turno puede seguir
                            if (td == 0) {
                                turno = turno + 1;
                                if (turno % 2 == 0) { // Si el turno es par, le toca al jugador 2, sino, al jugador 1
                                    JOptionPane.showMessageDialog(null, "❀ Sigue Jugador 2 ❀");
                                } else {
                                    JOptionPane.showMessageDialog(null, "❀ Sigue Jugador 1 ❀");
                                }
                                op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una ficha del 1 al 9"));
                                while (op < 1 || op > 9) {
                                    JOptionPane.showMessageDialog(null, "✘✘ Posición inválida, digite nuevamente ✘✘");
                                    op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una ficha del 1 al 9"));
                                }
                            } else { // Si td no es cero, entonces es 1, lo que significa que el jugador eligió una ficha ya tomada y tiene que volver a elegir una hasta que sea válida. El turno no se aumenta
                                op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar otra vez?"));
                                while (op < 1 || op > 9) {
                                    JOptionPane.showMessageDialog(null, "✘✘ Posición inválida, digite nuevamente ✘✘");
                                    op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué ficha desea retirar?"));
                                }
                            }
                        }

// Si todas las fichas tienen un valor diferente de cero, significa que ya están tomadas y se debe anunciar al jugador
                        if (p1 != 0 && p2 != 0 && p3 != 0 && p4 != 0 && p5 != 0 && p6 != 0 && p7 != 0 && p8 != 0 && p9 != 0) {
                            if (turno % 2 != 0) { // Como el ganador es el último que eligió una ficha, se evalúa con el turno. Si es impar, gana el jugador 1, sino, el jugador 2
                                JOptionPane.showMessageDialog(null,
                                        "\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔"
                                        + "\n!!!El Jugador 1 es el ganador!!!"
                                        + "\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔"
                                        + "\n!!!El Jugador 2 es el ganador!!!"
                                        + "\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                            }
                        }
                    }
                    break;

            }

        }

    }

}
