
package testtask;


public class Task {
    
    private String descripcion, fechaEntrega, nombre;
    private boolean estado = false;
    private int prioridad;
   
    //Constructor para atributo simple
    public Task(String nombre, String fechaEntrega, boolean estado){
        this.nombre = nombre;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }
    
    //Constructor para todos los atributos
    public Task(String descripcion, String fechaEntrega, String nombre,
            int prioridad, boolean estado) {
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.estado = estado;
    }
    
    //Get and Set
    public boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getFechaEntrega() {
        return fechaEntrega;
    }
    
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public int getPrioridad() {
        return prioridad;
    }
    
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void serNombre(String nombre) {
        this.nombre = nombre;
    }
}
