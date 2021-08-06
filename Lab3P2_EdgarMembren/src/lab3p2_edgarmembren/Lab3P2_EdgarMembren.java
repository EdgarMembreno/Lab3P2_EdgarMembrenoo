/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_edgarmembren;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class Lab3P2_EdgarMembren {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Tienda> tien = new ArrayList();
        ArrayList<Restaurantes> restau = new ArrayList();
        ArrayList<Personas> persona = new ArrayList();
        ArrayList<Clientes> clien = new ArrayList();
        ArrayList<restaurante> restaurante = new ArrayList();
        ArrayList<tiendas> tienda = new ArrayList();
        ArrayList<Articulos> arti = new ArrayList();
        ArrayList<Programadores> programadores = new ArrayList();
        ArrayList<Administradores> admin = new ArrayList();
        ArrayList<Motoristas> moto = new ArrayList();
        int opcion = 0;
        int cont_comida = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido a Hugo\n"
                    + "1.Login\n"
                    + "2.Crear Usuario");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    //LOGIN PRINCIPAL
                    System.out.print("Ingrese su usuario: ");
                    String username = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String password = leer.next();

                    if (username.equals("david") && password.equals("1234")) {//USUARIO PROGRAMADOR
                        while (opcion != 21) {
                            System.out.println("Bienvenido a Hugo\n"
                                    + "1.Crear Programador\n"
                                    + "2.Crear Administrador\n"
                                    + "3.Crear Motorista\n"
                                    + "4.Crear Restaurante\n"
                                    + "5.Crear Tienda\n"
                                    + "6.Eliminar Programador\n"
                                    + "7.Eliminar Administrador\n"
                                    + "8.Eliminar Motorista\n"
                                    + "9.Eliminar Restaurante\n"
                                    + "10.Eliminar Tienda\n"
                                    + "11.Modificar Programador\n"
                                    + "12.Modificar Administrador\n"
                                    + "13.Modificar Motorista\n"
                                    + "14.Modificar Restaurante\n"
                                    + "15.Modificar Tienda\n"
                                    + "16.Listar todas los Programadores\n"
                                    + "17.Listar todos los Administradores\n"
                                    + "18.Listar todas los Motoristas\n"
                                    + "19.Listar todas las tiendas\n"
                                    + "20.Listar todos los restaurantes\n"
                                    + "21.Salir del programa");
                            opcion = leer.nextInt();
                            switch (opcion) {
                                case 1: {
                                    System.out.println("Ingrese el lenguaje donde se especializa: ");
                                    String leng = leer.next();
                                    System.out.println("Ingrese su horario: ");
                                    String hora = leer.next();
                                    System.out.println("Ingrese su puesto: ");
                                    String puesto = leer.next();
                                    System.out.println("Ingrese los años de cargo: ");
                                    String años = leer.next();
                                    System.out.println("Ingrese su salario: ");
                                    int salario = leer.nextInt();
                                    System.out.println("Ingrese su nombre : ");
                                    String nombre = leer.next();
                                    System.out.println("Ingrese su apellido: ");
                                    String apellido = leer.next();
                                    System.out.println("Ingrese su id: ");
                                    int id = leer.nextInt();
                                    System.out.println("Ingrese su usuario: ");
                                    String user = leer.next();
                                    System.out.println("Ingrese su contraseña: ");
                                    String conta = leer.next();

                                    persona.add(new Programadores(leng, hora, puesto, años, salario, nombre, apellido, id, user, conta));
                                    programadores.add(new Programadores(leng, hora, puesto, años, salario, nombre, apellido, id, user, conta));
                                    break;

                                }
                                case 2: {
                                    System.out.println("Ingrese sus años de experiencia en venta: ");
                                    int experiencia = leer.nextInt();
                                    System.out.println("Ingrese su puesto: ");
                                    String puesto = leer.next();
                                    System.out.println("Ingrese sus años en el cargo: ");
                                    String cargo = leer.next();
                                    System.out.println("Ingrese su salario: ");
                                    int salario = leer.nextInt();
                                    System.out.println("Ingrese su nombre: ");
                                    String nombre = leer.next();
                                    System.out.println("Ingrese su apellido: ");
                                    String apelliod = leer.next();
                                    System.out.println("Ingrese su id: ");
                                    int id = leer.nextInt();
                                    System.out.println("Ingrese su usuario: ");
                                    String user = leer.next();
                                    System.out.println("Ingrese su contraseña: ");
                                    String conta = leer.next();

                                    persona.add(new Administradores(experiencia, puesto, cargo, salario, nombre, apelliod, id, user, conta));
                                    admin.add(new Administradores(experiencia, puesto, cargo, salario, nombre, apelliod, id, user, conta));
                                    break;
                                }
                                case 3: {
                                    System.out.println("Ingrese sus comisiones: ");
                                    int comision = leer.nextInt();
                                    System.out.println("Ingrese el medio en el cual transporta las ordenes: ");
                                    String transporte = leer.next();
                                    System.out.println("Ingrese la cantidad de cargos que puede llevar: ");
                                    int cargos = leer.nextInt();
                                    System.out.println("Ingrese su puesto: ");
                                    String puesto = leer.next();
                                    System.out.println("Ingrese sus años en el cargo: ");
                                    String cargo = leer.next();
                                    System.out.println("Ingrese su salario: ");
                                    int salario = leer.nextInt();
                                    System.out.println("Ingrese su nombre: ");
                                    String nombre = leer.next();
                                    System.out.println("Ingrese su apellido: ");
                                    String apelliod = leer.next();
                                    System.out.println("Ingrese su id: ");
                                    int id = leer.nextInt();
                                    System.out.println("Ingrese su usuario: ");
                                    String user = leer.next();
                                    System.out.println("Ingrese su contraseña: ");
                                    String conta = leer.next();

                                    persona.add(new Motoristas(comision, transporte, cargos, puesto, cargo, salario, nombre, apelliod, id, user, conta));
                                    moto.add(new Motoristas(comision, transporte, cargos, puesto, cargo, salario, nombre, apelliod, id, user, conta));
                                    break;
                                }
                                case 4: {
                                    while (opcion != 4) {
                                        System.out.println("Agregar Restaurante\n"
                                                + "1.Restaurante\n"
                                                + "2.Comida\n"
                                                + "3.Acompañamiento\n"
                                                + "4.Salir");
                                        switch (opcion) {
                                            case 1: {
                                                System.out.println("Ingrese la ubicacion: ");
                                                String ubicacion = leer.next();
                                                System.out.println("Ingrese el rtn: ");
                                                int rtn = leer.nextInt();
                                                System.out.println("Ingrese el slogan: ");
                                                String slogan = leer.next();
                                                System.out.println("Ingrese las comidas que tienen: ");
                                                String comida = leer.next();
                                                System.out.println("Ingrese el nombre de el restaurante : ");
                                                String nombre = leer.next();

                                                restau.add(new restaurante(ubicacion, rtn, slogan, comida, nombre));
                                                restaurante.add(new restaurante(ubicacion, rtn, slogan, comida, nombre));

                                                break;
                                            }
                                            case 2: {
                                                System.out.println("Ingrese el id :");
                                                int id = leer.nextInt();
                                                System.out.println("Ingrese el precio: ");
                                                int precio = leer.nextInt();
                                                System.out.println("Ingrese la cant por acompañante: ");
                                                int cant = leer.nextInt();
                                                System.out.println("Ingrese el acompañante: ");
                                                String acompa = leer.next();
                                                System.out.println("Ingrese el nombre: ");
                                                String nombre = leer.next();

                                                restau.add(new comidas(id, precio, cant, acompa, nombre));
                                                break;
                                            }
                                            case 3: {
                                                System.out.println("Ingrese el tipo de acompañante: ");
                                                String tipo = leer.next();
                                                System.out.println("Ingrese el precio adicional: ");
                                                int precio = leer.nextInt();
                                                System.out.println("Ingrese El nombre: ");
                                                String nombre = leer.next();

                                                restau.add(new Acompañamientos(tipo, precio, nombre));
                                                break;

                                            }

                                        }
                                    }
                                }
                                case 5: {
                                    while (opcion != 3) {
                                        System.out.println("Agregar Tienda\n"
                                                + "1.Tienda\n"
                                                + "2.Articulos\n"
                                                + "3.Salir");
                                        switch (opcion) {
                                            case 1: {
                                                System.out.println("Ingrese la ubicacion: ");
                                                String ubicacion = leer.next();
                                                System.out.println("Ingrese la cantidad de empleados: ");
                                                int empleados = leer.nextInt();
                                                System.out.println("Ingrese el tiempo de espera aproximado: ");
                                                int tiempo = leer.nextInt();
                                                System.out.println("Ingrese los articulos en venta: ");
                                                String articulo = leer.next();
                                                System.out.println("Ingrese el nombre: ");
                                                String nombre = leer.next();

                                                tien.add(new tiendas(ubicacion, empleados, tiempo, articulo, nombre));
                                                tienda.add(new tiendas(ubicacion, empleados, tiempo, articulo, nombre));
                                                break;

                                            }
                                            case 2: {
                                                System.out.println("Ingrese la categoria de su articulo: ");
                                                String cate = leer.next();
                                                System.out.println("Ingrese el precio del articulo: ");
                                                int precio = leer.nextInt();
                                                System.out.println("Ingrese el nombre del articulo: ");
                                                String nombre = leer.next();
                                                tien.add(new Articulos(cate, precio, nombre));
                                                arti.add(new Articulos(cate, precio, nombre));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 6: {
                                    System.out.println("Ingrese el nombre del programador que desea eliminar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < persona.size(); i++) {
                                        if (nombre.equals(persona.get(i).getNombre())) {
                                            persona.remove(i);
                                        } else {
                                            System.out.println("El programador no existe: ");
                                        }
                                    }

                                    break;
                                }
                                case 7: {
                                    System.out.println("Ingrese el nombre del Administrador que desea borrar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < persona.size(); i++) {
                                        if (nombre.equals(persona.get(i).getNombre())) {
                                            persona.remove(i);
                                        } else {
                                            System.out.println("El Administrador no existe: ");
                                        }
                                    }

                                    break;
                                }
                                case 8: {
                                    System.out.println("Ingrese el nombre del Motorista que desea borrar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < persona.size(); i++) {
                                        if (nombre.equals(persona.get(i).getNombre())) {
                                            persona.remove(i);
                                        } else {
                                            System.out.println("El motorista no existe: ");
                                        }
                                    }

                                    break;
                                }
                                case 9: {
                                    System.out.println("Ingrese el nombre del restaurante que desea eliminar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < restau.size(); i++) {
                                        if (nombre.equals(restau.get(i).getNombre())) {
                                            persona.remove(i);
                                        } else {
                                            System.out.println("El restaurante no existe: ");
                                        }
                                    }

                                    break;

                                }
                                case 10: {
                                    System.out.println("Ingrese el nombre de la tienda que desea eliminar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < tien.size(); i++) {
                                        if (nombre.equals(tien.get(i).getNombre())) {
                                            persona.remove(i);
                                        } else {
                                            System.out.println("La tienda no existe: ");
                                        }
                                    }

                                    break;
                                }
                                case 11: {
                                    System.out.println("Ingrese el nombre del programador que desea modificar");
                                    String nombre = leer.next();
                                    for (int i = 0; i < persona.size(); i++) {
                                        if (nombre.equals(persona.get(i).getNombre())) {
                                            System.out.println("Ingrese el nuevo nombre: ");
                                            String nomb = leer.next();
                                            System.out.println("Ingrese el nuevo apellido: ");
                                            String apellid = leer.next();
                                            System.out.println("Ingrese su nuevo id: ");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese su nuevo ususario: ");
                                            String user = leer.next();
                                            System.out.println("Ingrese su nueva contraseña: ");
                                            String contra = leer.next();

                                            persona.get(i).setNombre(nomb);
                                            persona.get(i).setApellido(apellid);
                                            persona.get(i).setId(id);
                                            persona.get(i).setUser(user);
                                            persona.get(i).setContra(contra);

                                        } else {
                                            System.out.println("El programador no existe: ");
                                        }
                                    }

                                    break;
                                }
                                case 12: {
                                    System.out.println("Ingrese el nombre del Administrador que desea modificar");
                                    String nombre = leer.next();
                                    for (int i = 0; i < persona.size(); i++) {
                                        if (nombre.equals(persona.get(i).getNombre())) {
                                            System.out.println("Ingrese el nuevo nombre: ");
                                            String nomb = leer.next();
                                            System.out.println("Ingrese el nuevo apellido: ");
                                            String apellid = leer.next();
                                            System.out.println("Ingrese su nuevo id: ");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese su nuevo ususario: ");
                                            String user = leer.next();
                                            System.out.println("Ingrese su nueva contraseña: ");
                                            String contra = leer.next();

                                            persona.get(i).setNombre(nomb);
                                            persona.get(i).setApellido(apellid);
                                            persona.get(i).setId(id);
                                            persona.get(i).setUser(user);
                                            persona.get(i).setContra(contra);

                                        } else {
                                            System.out.println("El Administrador no existe: ");
                                        }
                                    }

                                    break;

                                }
                                case 13: {
                                    System.out.println("Ingrese el nombre del Motorista que desea modificar");
                                    String nombre = leer.next();
                                    for (int i = 0; i < persona.size(); i++) {
                                        if (nombre.equals(persona.get(i).getNombre())) {
                                            System.out.println("Ingrese el nuevo nombre: ");
                                            String nomb = leer.next();
                                            System.out.println("Ingrese el nuevo apellido: ");
                                            String apellid = leer.next();
                                            System.out.println("Ingrese su nuevo id: ");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese su nuevo ususario: ");
                                            String user = leer.next();
                                            System.out.println("Ingrese su nueva contraseña: ");
                                            String contra = leer.next();

                                            persona.get(i).setNombre(nomb);
                                            persona.get(i).setApellido(apellid);
                                            persona.get(i).setId(id);
                                            persona.get(i).setUser(user);
                                            persona.get(i).setContra(contra);

                                        } else {
                                            System.out.println("El Motorista no existe: ");
                                        }
                                    }

                                    break;
                                }
                                case 14: {
                                    System.out.println("Ingrese el nombre del restaurante que desea modificar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < restau.size(); i++) {
                                        if (restau.get(i).getNombre().equals(nombre)) {
                                            System.out.println("Ingrese el nuevo nombre del restaurante: ");
                                            String nuevo = leer.next();
                                            restau.get(i).setNombre(nuevo);
                                        }
                                    }
                                    break;
                                }
                                case 15: {
                                    System.out.println("Ingrese el nombre de la tienda que desea eliminar: ");
                                    String nombre = leer.next();
                                    for (int i = 0; i < tien.size(); i++) {
                                        if (nombre.equals(tien.get(i).getNombre())) {
                                            System.out.println("Ingrese el nuevo nombre de la tienda: ");
                                            String nuevo = leer.next();
                                            tien.get(i).setNombre(nuevo);
                                        }
                                    }
                                    break;
                                }
                                case 16: {
                                    for (int i = 0; i < programadores.size(); i++) {
                                        System.out.println("");
                                        System.out.println(programadores.get(i));

                                    }
                                    break;
                                }
                                case 17: {
                                    for (int i = 0; i < admin.size(); i++) {
                                        System.out.println("");
                                        System.out.println(admin.get(i));
                                    }
                                    break;
                                }
                                case 18: {
                                    for (int i = 0; i < moto.size(); i++) {
                                        System.out.println("");
                                        System.out.println(moto.get(i));
                                    }
                                    break;
                                }
                                case 19: {
                                    for (int i = 0; i < tien.size(); i++) {
                                        System.out.println(tien.get(i));
                                    }
                                    break;
                                }
                                case 20: {
                                    for (int i = 0; i < restau.size(); i++) {
                                        System.out.println(restau.get(i));
                                    }
                                    break;
                                }

                            }

                        }

                    }//FIN DEL IF USUARIO PROGRAMADOR
                    for (int i = 0; i < clien.size(); i++) {//OPCIONES DE CLIENTE
                        if (clien.get(i).getUser().equals(username) && clien.get(i).getContra().equals(password)) {
                            while (opcion != 4) {
                                System.out.println("**Hugo**&\n"
                                        + "1.Pedir Comida\n"
                                        + "2.Pedir Articulo\n"
                                        + "3.Eliminar cuenta\n"
                                        + "4.Salir");
                                opcion = leer.nextInt();
                                switch (opcion) {
                                    case 1: {
                                        for (int j = 0; j < restaurante.size(); j++) {
                                            System.out.println(restaurante.get(j));
                                            System.out.println("Ingrese el nombre del restaurante que desea: ");
                                            String nombre = leer.next();
                                            cont_comida++;
                                            for (int k = 0; k < clien.size(); k++) {
                                                clien.get(k).setCantPedidos(cont_comida);
                                            }
                                            for (int e = 0; e < moto.size(); e++) {
                                                moto.get(e).setComisiones(500);
                                            }
                                            System.out.println("Su pedido esta en camino");

                                        }

                                        break;
                                    }
                                    case 2: {
                                        for (int j = 0; j < tienda.size(); j++) {
                                            System.out.println(tienda.get(j));
                                            System.out.println("Ingrese el nombre de la tienda que desea: ");
                                            String nombre = leer.next();
                                            for (int k = 0; k < arti.size(); k++) {
                                                System.out.println(arti.get(k));
                                            }
                                            for (int e = 0; e < clien.size(); e++) {
                                                clien.get(e).setCantPedidos(cont_comida);
                                            }
                                            for (int r = 0; r < moto.size(); r++) {
                                                moto.get(r).setComisiones(1000);
                                            }
                                            System.out.println("Escoja el articulo que desea: ");
                                            String artic = leer.next();
                                            System.out.println("Su pedido esta en camino");

                                        }
                                        break;
                                    }
                                    case 3: {

                                        String nombre = username;
                                        for (int j = 0; j < persona.size(); j++) {
                                            if (nombre.equals(clien.get(i).getUser())) {
                                                persona.remove(j);
                                            } else {
                                                System.out.println("Su usuario fue eliminado con exito");
                                            }
                                        }

                                        break;

                                    }

                                }

                            }

                        } else {
                            System.out.println("No existe ese usario");
                        }

                    }//FIN OPCIONES DEL CLIENTE
                    for (int i = 0; i < moto.size(); i++) {
                        if (moto.get(i).getUser().equals(username) && moto.get(i).getContra().equals(password)) {
                            System.out.println("Modiciar informacion de motorista ");

                            if (moto.get(i).equals(persona.get(i).getNombre())) {
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nomb = leer.next();
                                System.out.println("Ingrese el nuevo apellido: ");
                                String apellid = leer.next();
                                System.out.println("Ingrese su nuevo id: ");
                                int id = leer.nextInt();
                                System.out.println("Ingrese su nuevo ususario: ");
                                String user = leer.next();
                                System.out.println("Ingrese su nueva contraseña: ");
                                String contra = leer.next();

                                persona.get(i).setNombre(nomb);
                                persona.get(i).setApellido(apellid);
                                persona.get(i).setId(id);
                                persona.get(i).setUser(user);
                                persona.get(i).setContra(contra);

                            } else {
                                System.out.println("El Motorista no existe: ");
                            }

                            break;

                        }
                    }
                    for (int i = 0; i < admin.size(); i++) {
                        if (admin.get(i).getUser().equals(username) && admin.get(i).getContra().equals(password)) {
                            System.out.println("Modiciar informacion de Administrador ");

                            if (admin.get(i).equals(persona.get(i).getNombre())) {
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nomb = leer.next();
                                System.out.println("Ingrese el nuevo apellido: ");
                                String apellid = leer.next();
                                System.out.println("Ingrese su nuevo id: ");
                                int id = leer.nextInt();
                                System.out.println("Ingrese su nuevo ususario: ");
                                String user = leer.next();
                                System.out.println("Ingrese su nueva contraseña: ");
                                String contra = leer.next();

                                persona.get(i).setNombre(nomb);
                                persona.get(i).setApellido(apellid);
                                persona.get(i).setId(id);
                                persona.get(i).setUser(user);
                                persona.get(i).setContra(contra);

                            } else {
                                System.out.println("El Administrador no existe: ");
                            }

                            break;

                        }
                    }

                    break;

                }

                case 2: {
                    int pedidos = 0;
                    System.out.println("***Bienvenido al creador de usuario de Hugo**");
                    System.out.println("Ingrese su dominicilio: ");
                    String domicilio = leer.next();
                    System.out.println("Ingrese su nombre : ");
                    String nombre = leer.next();
                    System.out.println("Ingrese su apellido: ");
                    String apellido = leer.next();
                    System.out.println("Ingrese su id: ");
                    int id = leer.nextInt();
                    System.out.println("Ingrese su usuario: ");
                    String user = leer.next();
                    System.out.println("Ingrese su contraseña: ");
                    String conta = leer.next();

                    persona.add(new Clientes(domicilio, pedidos, nombre, apellido, id, user, conta));
                    clien.add(new Clientes(domicilio, pedidos, nombre, apellido, id, user, conta));
                    System.out.println("***Su Usuario fue creado con Exito***");
                    System.out.println("");

                    break;

                }
            }
        }// fin de primeras opciones 

    }

}
