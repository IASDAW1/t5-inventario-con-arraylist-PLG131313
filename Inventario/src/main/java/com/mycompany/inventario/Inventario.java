/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventario;

/**
 *
 * @author Pablo1313
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        ArrayList<Double> precios = new ArrayList();
        ArrayList<Integer> cantidades = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Actualizar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(nombres, precios, cantidades);
                    break;
                case 2:
                    actualizarInventario(nombres, cantidades);
                    break;
                case 3:
                    buscarProducto(nombres, precios, cantidades);
                    break;
                case 4:
                    mostrarInventario(nombres, precios, cantidades);
                    break;
                case 5:
                    System.out.println("Fin del inventario");
                    System.exit(0);
                default:
                    System.out.println("No vale esta opcion");
            }
        }
    }

    public static void agregarProducto(ArrayList<String> nombres, ArrayList<Double> precios, ArrayList<Integer> cantidades) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad en stock: ");
        int cantidad = scanner.nextInt();

        nombres.add(nombre);
        precios.add(precio);
        cantidades.add(cantidad);

        System.out.println("Producto agregado correctamente.");
    }

    public static void actualizarInventario(ArrayList<String> nombres, ArrayList<Integer> cantidades) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(nombre)) {
                System.out.print("Ingrese la nueva cantidad en stock: ");
                int nuevaCantidad = scanner.nextInt();
                cantidades.set(i, nuevaCantidad);
                System.out.println("Inventario actualizado correctamente.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public static void buscarProducto(ArrayList<String> nombres, ArrayList<Double> precios, ArrayList<Integer> cantidades) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(nombre)) {
                System.out.println("PRODUCTO:");
                System.out.println("Nombre: " + nombres.get(i) + ", Precio: $" + precios.get(i) + ", Cantidad en stock: " + cantidades.get(i));
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public static void mostrarInventario(ArrayList<String> nombres, ArrayList<Double> precios, ArrayList<Integer> cantidades) {
        System.out.println("INVENTARIO");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i) + ", Precio: $" + precios.get(i) + ", Cantidad en stock: " + cantidades.get(i));
        }
    }
}
