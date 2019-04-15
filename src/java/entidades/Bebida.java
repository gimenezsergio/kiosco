package entidades;

public class Bebida {
    private String nombre;
    private double litros;
    private double precio;
    private int stock;
    private int pedidoAlproveedor; //Es la cantidad a pedir       
    public Bebida(String nombre, double litros, double precio, int stock) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
        this.stock = stock;
    }    
    void consultarElPedido() {
        System.out.println("El pedido del producto " + nombre + " es: " + pedidoAlproveedor);
    }
    void pedidoAlProveedor(int parametroPedidoAlproveedor) {                
        this.pedidoAlproveedor = parametroPedidoAlproveedor;        
    }
    
    @Override
    public String toString() {
        return "Bebida{" + "nombre=" + nombre + ", litros=" + litros + ", precio=" + precio + ", stock=" + stock + '}';
    }   

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    

    
    
    
}
