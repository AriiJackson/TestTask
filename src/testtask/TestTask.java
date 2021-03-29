/* 
    ¿Qué tiene que hacer nuestra app?

    Para optimizar el desarrollo de nuestra app, la implementaremos por partes. 
    Esta primera instancia debe enfocarse en modelar el concepto de tarea. 
    Por ahora nuestra app se limitará a:
        1. Agregar una Tarea. Una tarea posee una descripción, 
    un estado (completa/incompleta), una fecha límite para ser completada.
        2. Ver una Lista de tareas. La lista debe mostrar el estado, 
    la descripción y la fecha límite de cada tarea.
        3. Mostrar una tarea con su número (posición en el listado) 
    y poder marcarla como terminada (si está incompleta, cambiar su estado 
    a completa), o eliminarla (ya no estará en el listado de tareas).

*/

package testtask;

import java.util.Scanner;

public class TestTask {
    
    public static void main(String[] args) {
        
        //Variable para tomar dato del usuario
        Scanner dato = new Scanner(System.in);
        
        //Variable para menu
        int opcion;
        
        //Variables auxiliares
        String descripcion = "", fechaEntrega = "", nombre1 = "", nombre2 = "",
                estado = "";     
        boolean estado1 = false, estado2 = false;
        int prioridad = 0;
        
        //Menu, pedir dato al usuario
        System.out.println("Cargar una tarea al sistema\n"
                + "[1] Ingresar tarea simple\n"
                + "[2] Ingresar tarea completa\n"
                + "Opcion: ");
        opcion = dato.nextInt();

        //Menu 
        switch(opcion) {
            case 1: 
                dato.nextLine();
                
                System.out.println("Ingrese tarea simple");
                System.out.println("Nombre: ");
                nombre1 = dato.nextLine();
                
                System.out.println("Estado de la tarea(Completa/Incompleta): ");
                estado = dato.nextLine();
                
                if(estado.equals("Completa")) 
                    estado1 = true;
                
                break;
            case 2:
                dato.nextLine();
                
                System.out.println("Ingrese tarea con datos completos");
                System.out.println("Nombre: ");
                nombre2 = dato.nextLine();
                
                System.out.println("Descripcion: ");
                descripcion = dato.nextLine();
                
                System.out.println("Fecha de Entrega: ");
                fechaEntrega = dato.nextLine();
                
                System.out.println("Estado de la tarea(Completa/Incompleta): ");
                estado = dato.nextLine();
                
                if(estado.equals("Completa")) 
                    estado2 = true;
                
                System.out.println("Prioridad: ");
                prioridad = dato.nextInt();
                break;
            default:
                System.out.println("Lo siento, no es una opción valida"
                        + "\nIngrese nuevamente");
                break;
        }
        
        //Objeto tarea
        Task task1 = new Task(nombre1, fechaEntrega, estado1);
        Task task2 = new Task(descripcion, fechaEntrega, nombre2, prioridad, 
                estado2);
        
        //Mostrar en pantalla
        if(opcion == 1) {
            System.out.println("La tarea ingresada es: ");
            System.out.println("Nombre: " + task1.getNombre());
            
            if(estado1 == true)
                System.out.println("Estado: Completo");
            else
                System.out.println("Estado: Incompleto");
        }
        else {
            System.out.println("La tarea ingresada es: ");
            System.out.println("Nombre: " + task2.getNombre());
            System.out.println("Descripcion: " + task2.getDescripcion());
            System.out.println("Fecha de entrega: " + task2.getFechaEntrega());
            
            if(estado2 == true)
                System.out.println("Estado: Completo");
            else
                System.out.println("Estado: Incompleto");
            
            System.out.println("Prioridad: " + task2.getPrioridad());
        }
        
    }
}