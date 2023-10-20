package lab2p1_carlosflores;

import java.util.Scanner;

public class Lab2P1_CarlosFlores{
    
    public static void main(String[] args){
            Scanner leer = new Scanner (System.in);
            System.out.println("******* M E N U *******");
            System.out.println("Ingrese la operacion que desea realizar.");
            System.out.println("1.Dibujando triangulos");
            System.out.println("2.Area de figuras");
            System.out.println("3.Evaluando numeros");
            System.out.println("4.Salir del programa");
            int opcion = leer.nextInt();
            while(opcion>0&&opcion<4){
                
                
                if(opcion == 1){
                    System.out.println("Ingrese longitud 1");
                    int long1 = leer.nextInt();
                    System.out.println("Ingrese longitud 2");
                    int long2 = leer.nextInt();
                    System.out.println("Ingrese longitud 3");
                    int long3 = leer.nextInt();
                    if(long1<0||long2<0||long3<0){
                        System.out.println("Las longitudes no pueden ser negativas");
                    }
                    else{
                            if(long1 + long2 > long3&&long1 + long3 > long2&&long2 + long3 > long1){
                                System.out.println("Las longitudes ingresadas forman un triangulo.");
                            }
                            else{
                                    if(long1 + long2 <= long3||long1 + long3 <= long2||long2 + long3 <= long1){
                                        System.out.println("Las longitudes ingresadas no forman un triangulo.");
                                    }
                            }
                    }
                }//Fin de opcion1
                
                
                if(opcion == 2){
                    char resp = 's';
                    while(resp == 's'||resp == 'S'){
                        System.out.println();
                        System.out.println("******* M E N U *******");
                        System.out.println("Ingrese la figura de la que desea calcular el area ");
                        System.out.println("1.Rectangulo");
                        System.out.println("2.Triangulo");
                        System.out.println("3.Circulo");
                        int figu = leer.nextInt();
                        if(figu == 1){
                            System.out.println("Ingrese la base");
                            double base = leer.nextInt();
                            System.out.println("Ingrese la altura");
                            double altura = leer.nextInt();
                            double result = base * altura;
                            System.out.println("El area del recatangulo es: " + result);
                        }
                        if(figu == 2){
                            System.out.println("Ingrese la base");
                            double base = leer.nextInt();
                            System.out.println("Ingrese la altura");
                            double altura = leer.nextInt();
                            double result = 0.5 * base * altura;
                            System.out.println("El area del triangulo es: " + result);
                        }
                        if(figu == 3){
                            System.out.println("Ingrese el radio");
                            double radio = leer.nextInt();
                            double result = Math.PI * Math.pow(radio, 2);
                            System.out.println("El area del circulo es: " + result);
                        }
                        System.out.println();   
                    System.out.println("Desea calcular el area de otra figura?[s/n]");
                    resp =  leer.next().charAt(0);
                    }//fin de while    
                       
                }//fin de opcion2
                
                
                if(opcion == 3){
                    int cont = 1;
                    int cont_divis = 0;
                    System.out.println("Ingrese un numero");
                    int num = leer.nextInt();
                    while(cont<=num){
                        if(num%cont == 0){ 
                            cont_divis = cont_divis + 1;
                        }  
                    cont = cont+1;
                    }//fin while
                    if(num % 2 == 0&&cont_divis == 2){
                        System.out.println("El numero es par y primo");
                    }
                    else{
                            if(num % 2 < 0||num % 2 > 0&&cont_divis == 2){
                                System.out.println("El numero es impar y primo");
                            }
                            else{
                                    if(num % 2 == 0){
                                        System.out.println("El numero es par");
                                    }
                                    else{
                                            if(num % 2 < 0||num % 2 > 0){
                                                System.out.println("El numero es impar");
                                            }
                                    }
                            }
                    }
                    
                }//fin de opcion3
            
            System.out.println();
            System.out.println("******* M E N U *******");
            System.out.println("Ingrese la operacion que desea realizar.");
            System.out.println("1.Dibujando triangulos");
            System.out.println("2.Area de figuras");
            System.out.println("3.Evaluando numeros");
            System.out.println("4.Salir del programa");
            opcion = leer.nextInt();   
            }//Fin de while
        System.out.println("SALIO DEL PROGRAMA :D");        
    }//fin del main
    
}//fin class
