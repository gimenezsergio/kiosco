package entidades;

public class programa {
    public static void main(String[] args) {
        Bebida articulo1 = new Bebida("Coca", 0.6, 50, 36);
//        articulo1.nombre = "Coca";
//        articulo1.precio = 50;
//        articulo1.stock = 36;
//        articulo1.litros = 0.6;
        
        System.out.println(articulo1.getStock());
        System.out.println(articulo1);
        articulo1.setStock(20);
        System.out.println(articulo1);        
        //PEDIDO A UN PROVEEDOR
        articulo1.pedidoAlProveedor(230);        
        
        System.out.println("Objeto luego del pedido al proveedor; ");
        System.out.println(articulo1);
        articulo1.consultarElPedido();
        System.out.println("[[OK]]");
    }
}
