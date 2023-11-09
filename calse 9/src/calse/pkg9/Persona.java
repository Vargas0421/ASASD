package calse.pkg9;


public class Producto {
    private String nombreDelProducto;
    private int codigo;
    private int cantidad;

    public Persona(String nombreDelProducto, int codigo, int cantidad) {
        this.nombreDelProducto = nombreDelProducto;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
