package labfinal_java_jjct_aiaj_odlb;

import java.util.Random;
import java.util.Scanner;

public class LabFinal_Java_JJCT_AIAJ_ODLB {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean Validacion = false;
        Random numero = new Random();
        Random ran = new Random();
        int op, num, D1, D2, D3, D4, d1, d2, d3, d4, num2, i, f, p, dado1, dado2, acumulado1, acumulado2, valor1, valor2, juego;
        op = 1;
        while (op != 0) {
            System.out.println("⚝⚝⚝Bienvenido al Menú Iterativo de Miscelánea de Juegos en Java⚝⚝⚝");
            System.out.println("⚝\t1.Para Punto y Fama");
            System.out.println("⚝\t2.Para Dados");
            System.out.println("⚝\t3.Para Margarita");
            System.out.println("⚝\t0.Para salir");
            System.out.println("⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝");
            System.out.print("Elija una opción: ");
            op = leer.nextInt();
            while (op < 0 | op > 3) {
                System.out.println("✺✺✺Opción invalida, elija nuevamente✺✺✺");
                System.out.println("⚝\t1.Para Punto y Fama");
                System.out.println("⚝\t2.Para Dados");
                System.out.println("⚝\t3.Para Margarita");
                System.out.println("⚝\t0.Para salir");
                System.out.println("⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝⚝");
                System.out.print("Elija una opción: ");
                op = leer.nextInt();
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
                        num = (numero.nextInt(9000) + 1000);
                        D1 = num / 1000;
                        D2 = (num / 100) % 10;
                        D3 = (num / 10) % 10;
                        D4 = num % 10;
                        if (D1 != D2 && D1 != D3 && D1 != D4 && D2 != D3 && D2 != D4 && D3 != D4) {
                            Validacion = true;
                        }
                    }
                    System.out.println("\n➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣");
                    System.out.println("Bienvenido al Juego de Punto y Fama");
                    System.out.println("➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣\n");
                    System.out.println("Intente adivinar el número de 4 cifras (sin digitos repetidos)");
                    System.out.print("➣");
                    num2 = leer.nextInt();
                    while (num2 < 1000 | num2 > 9999) {
                        System.out.println("✺✺Número inválido, digite un número de 4 cifras positivo✺✺");
                        System.out.print("➣");
                        num2 = leer.nextInt();
                    }
                    while (num != num2) {
                        Validacion = true;
                        f = 0;
                        p = 0;
                        d1 = num2 / 1000;
                        d2 = (num2 / 100) % 10;
                        d3 = (num2 / 10) % 10;
                        d4 = num2 % 10;
                        while (Validacion == true) {
                            d1 = num2 / 1000;
                            d2 = (num2 / 100) % 10;
                            d3 = (num2 / 10) % 10;
                            d4 = num2 % 10;
                            if (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4) {
                                Validacion = false;
                            } else {
                                System.out.println("✺✺Combinación inválida, el número no puede tener digitos repetidos✺✺");
                                System.out.print("➣");
                                num2 = leer.nextInt();
                                while (num2 < 1000 | num2 > 9999) {
                                    System.out.println("✺✺Número inválido, digite un número de 4 cifras positivo✺✺");
                                    System.out.print("➣");
                                    num2 = leer.nextInt();
                                }
                            }
                        }
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
                        System.out.println("➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣➣");
                        System.out.println("Ha obtenido " + f + " famas y " + p + " puntos");
                        System.out.println("Digite una nueva combinación: ");
                        System.out.print("➣");
                        num2 = leer.nextInt();
                        while (num2 < 1000 | num2 > 9999) {
                            System.out.println("✺✺Número inválido, digite un número de 4 cifras positivo✺✺");
                            System.out.print("➣");
                            num2 = leer.nextInt();
                        }
                        i = i + 1;
                    }
                    System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                    System.out.println("!!!Ha adivinado el número!!");
                    System.out.println("Intentos: " + i);
                    System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔\n");
                    break;

                case 2:
                    i = 1;
                    acumulado1 = 0;
                    acumulado2 = 0;
                    System.out.println("\n★★★★★★★★★★★★★★★★★★★★★★★★★★");
                    System.out.println("★★ Bienvenido al Juego de los Dados  ★★");
                    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
                    //Ciclo para las rondas
                    do {
                        System.out.println("★★★★★★★★★★★★★★★★★★★");
                        System.out.println("★         Ronda: " + i + "          ★");
                        System.out.println("★★★★★★★★★★★★★★★★★★★ \n\n");
                        //Ciclo para el jugador 1
                        do {
                            System.out.println("★★★ Turno Jugador 1 ★★★");
                            System.out.println("Introduzca un 1 para lanzar los dados");
                            juego = leer.nextInt();
                            while (juego != 1) {
                                System.out.println("✺✺Introduzca un valor válido✺✺");
                                juego = leer.nextInt();
                            }
                            //Asignación aleatoria de valor
                            dado1 = ran.nextInt(6) + 1;
                            dado2 = ran.nextInt(6) + 1;
                            System.out.println("★★★★★★★★★★★★★★★");
                            System.out.println("★ Primer dado: " + dado1 + "      ★");
                            System.out.println("★ Segundo dado: " + dado2 + "     ★");
                            System.out.println("★★★★★★★★★★★★★★★ \n\n");
                            //Punto por sacar doble (El condicional evita que en la primera repetición del ciclo se incremente acumulado1)
                            if (dado1 == dado2) {
                                acumulado1 = acumulado1 + 1;
                                System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
                                System.out.println("El Jugador 1 ganó un punto por sacar doble");
                                System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
                                System.out.println("Puntaje Jugador 1: " + acumulado1);
                                System.out.println("Puntaje Jugador 2: " + acumulado2 + "\n");
                            }
                        } while (dado1 == dado2);
                        valor1 = dado1 + dado2;
                        //Ciclo para el jugador 2
                        do {
                            System.out.println("★★★ Turno Jugador 2 ★★★");
                            System.out.println("Introduzca un 1 para lanzar los dados");
                            juego = leer.nextInt();
                            while (juego != 1) {
                                System.out.println("✺✺Introduzca un valor válido✺✺");
                                juego = leer.nextInt();
                            }
                            //Asignación aleatoria de valor
                            dado1 = ran.nextInt(6) + 1;
                            dado2 = ran.nextInt(6) + 1;
                            System.out.println("★★★★★★★★★★★★★★★");
                            System.out.println("★ Primer dado: " + dado1 + "      ★");
                            System.out.println("★ Segundo dado: " + dado2 + "     ★");
                            System.out.println("★★★★★★★★★★★★★★★  \n\n");
                            //Punto por sacar doble (El condicional evita que en la primera repetición del ciclo se incremente acumulado2)
                            if (dado1 == dado2) {
                                acumulado1 = acumulado1 + 1;
                                System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
                                System.out.println("» El Jugador 2 ganó punto por sacar doble");
                                System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
                                System.out.println("Puntaje jugador 1: " + acumulado1);
                                System.out.println("Puntaje jugador 2: " + acumulado2 + "\n");
                            }
                        } while (dado1 == dado2);
                        valor2 = dado1 + dado2;
                        //Comparación de resultados
                        if (valor1 > valor2) {
                            acumulado1 = acumulado1 + 3;
                            System.out.println("➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                            System.out.println("➟ El jugador 1 ganó el turno");
                            System.out.println("➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                            i++;
                        } else {
                            if (valor1 < valor2) {
                                acumulado2 = acumulado2 + 3;
                                System.out.println("➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                                System.out.println("➟ El jugador 2 ganó el turno");
                                System.out.println("➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                                i++;
                            } else {
                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                System.out.println("➳ Empate, la ronda se repite");
                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                            }
                        }
                        //Puntos para el ganador de la ronda
                        System.out.println("Puntaje Jugador 1: " + acumulado1);
                        System.out.println("Puntaje Jugador 2: " + acumulado2 + "\n");
                    } while (i <= 21 && acumulado1 - acumulado2 < 15 && acumulado2 - acumulado1 < 15);
                    //Ganador y puntajes
                    if (acumulado1 > acumulado2) {
                        System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                        System.out.println("!!!El Jugador 1 es el ganador!!!");
                        System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                    } else {
                        if (acumulado2 > acumulado1) {
                            System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                            System.out.println("!!!El Jugador 2 es el ganador!!!");
                            System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                        } else {
                            System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                            System.out.println("!!!El partido quedo en empate!!!");
                            System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                        }
                    }
                    System.out.println("➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟");
                    System.out.println("Puntaje Jugador 1: " + acumulado1);
                    System.out.println("Puntaje Jugador 2: " + acumulado2);
                    System.out.println("➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟➟\n");
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
                    System.out.println("\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
                    System.out.println("❀❀ Bienvenido al juego de Margarita ❀❀ ");
                    System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀\n");
                    System.out.println("➥ Empieza Jugador 1 ");
                    System.out.println("¿Que ficha desea retirar?");
                    System.out.print("➥➥");
                    op = leer.nextInt();
                    while (op < 1 | op > 9) {
                        System.out.println("✺✺✺✺Posición inválida, digite nuevamente✺✺✺");
                        System.out.print("➥➥");
                        op = leer.nextInt();
                    }
                    while (p1 == 0 | p2 == 0 | p3 == 0 | p4 == 0 | p5 == 0 | p6 == 0 | p7 == 0 | p8 == 0 | p9 == 0) {
                        switch (op) {
                            case 1:
                                val = 0;
                                td = 0;
                                if (p1 == 0) {
                                    if (turno % 2 == 0) {
                                        p1 = 2;
                                    } else {
                                        p1 = 1;
                                    }
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p4 != 0 & p2 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 4 o 2?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 4 & fc != 2) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
                                                }
                                                if (fc == 4) {
                                                    if (p4 == 0) {
                                                        if (turno % 2 == 0) {
                                                            p4 = 2;
                                                        } else {
                                                            p4 = 1;
                                                        }
                                                        val = 1;
                                                    } else {
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 2) {
                                                        if (p2 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p2 = 2;
                                                            } else {
                                                                p2 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p3 != 0 & p1 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 3 o 1?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 3 & fc != 1) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 1) {
                                                        if (p1 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p1 = 2;
                                                            } else {
                                                                p1 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p5 != 0 & p2 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 5 o 2?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 5 & fc != 2) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 2) {
                                                        if (p2 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p2 = 2;
                                                            } else {
                                                                p2 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p6 != 0 & p1 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 6 o 1?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 6 & fc != 1) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 1) {
                                                        if (p1 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p1 = 2;
                                                            } else {
                                                                p1 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p7 != 0 & p3 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 7 o 3?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 7 & fc != 3) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 3) {
                                                        if (p3 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p3 = 2;
                                                            } else {
                                                                p3 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p8 != 0 & p4 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 8 o 4?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 8 & fc != 4) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 4) {
                                                        if (p4 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p4 = 2;
                                                            } else {
                                                                p4 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p9 != 0 & p5 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 9 o 5?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 9 & fc != 5) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 5) {
                                                        if (p5 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p5 = 2;
                                                            } else {
                                                                p5 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p9 != 0 & p6 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 9 o 6?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 9 & fc != 6) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 6) {
                                                        if (p6 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p6 = 2;
                                                            } else {
                                                                p6 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
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
                                    System.out.println("¿Desea retirar una segunda ficha contigua?");
                                    System.out.println("1. Si (Presione cualquier otro número para No)");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                    if (op == 1) {
                                        while (val == 0) {
                                            if (p8 != 0 & p7 != 0) {
                                                System.out.println("\n➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                System.out.println("➳➳ No tiene fichas contiguas disponibles ➳➳");
                                                System.out.println("➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳➳");
                                                val = 1;
                                            } else {
                                                System.out.println("¿Que ficha desea retirar, 8 o 7?");
                                                System.out.print("➥➥");
                                                fc = leer.nextInt();
                                                while (fc != 8 & fc != 7) {
                                                    System.out.println("✺✺Ficha inválida, digite nuevamente✺✺");
                                                    System.out.print("➥➥");
                                                    fc = leer.nextInt();
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
                                                        System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                        System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                    }
                                                } else {
                                                    if (fc == 7) {
                                                        if (p7 == 0) {
                                                            if (turno % 2 == 0) {
                                                                p7 = 2;
                                                            } else {
                                                                p7 = 1;
                                                            }
                                                            val = 1;
                                                        } else {
                                                            System.out.println("\n✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
                                                            System.out.println("✷✷ Ficha ya tomada ✷✷");
                                                            System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("\n֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    System.out.println("֎ Ficha no válida ֎");
                                    System.out.println("֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎֎");
                                    td = 1;
                                }
                                break;
                        }
                        if (p1 == 0 | p2 == 0 | p3 == 0 | p4 == 0 | p5 == 0 | p6 == 0 | p7 == 0 | p8 == 0 | p9 == 0) {
                            if (td == 0) {
                                turno = turno + 1;
                                if (turno % 2 == 0) {
                                    System.out.println("\n➥ Sigue Jugador 2");
                                } else {
                                    System.out.println("\n➥ Sigue Jugador 1");
                                }
                                System.out.println("¿Que ficha desea retirar?");
                                System.out.print("➥➥");
                                op = leer.nextInt();
                                while (op < 1 | op > 9) {
                                    System.out.println("✺✺✺✺Posición inválida, digite nuevamente✺✺✺");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                }
                            } else {
                                System.out.println("\n¿Que ficha desea retirar otra vez?");
                                System.out.print("➥➥");
                                op = leer.nextInt();
                                while (op < 1 | op > 9) {
                                    System.out.println("✺✺✺✺Posición inválida, digite nuevamente✺✺✺");
                                    System.out.print("➥➥");
                                    op = leer.nextInt();
                                }
                            }
                        }
                    }
                    if (p1 != 0 & p2 != 0 & p3 != 0 & p4 != 0 & p5 != 0 & p6 != 0 & p7 != 0 & p8 != 0 & p9 != 0) {
                        if (turno % 2 != 0) {
                            System.out.println("\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                            System.out.println("!!!El Jugador 1 es el ganador!!!");
                            System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔\n");
                        } else {
                            if (turno % 2 == 0) {
                                System.out.println("\n✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                                System.out.println("!!!El Jugador 2 es el ganador!!!");
                                System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔\n");
                            }
                        }
                    }
                    break;

            }

        }

    }

}
