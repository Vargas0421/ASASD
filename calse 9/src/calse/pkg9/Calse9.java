package calse.pkg9;
import javax.swing.JOptionPane;
public class Calse9 {
    public static void main(String[] args) {
        
        
       
        String h ="";
        int p =0;
        h = JOptionPane.showInputDialog( "Cuantos porfuctos se tienen?");
        p = (int) Double.parseDouble(h);

        Producto arrproducto[] = new Producto[p]; 

       
        for (int x = 0; x < arrproducto.length; x++) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la infromacino de cada producto " + x);
            String y ="";
            int codigo = 0;
            y = JOptionPane.showInputDialog( "Ingrese la cedula"); 
            codigo = (int) Double.parseDouble(y);
            String f ="";
            int cantidad = 0;
            f = JOptionPane.showInputDialog( "Ingrese la cedula"); 
            cantidad = (int) Double.parseDouble(f);
            String nombreDelProducto = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto");
            String appellido1 = JOptionPane.showInputDialog(null, "Ingrese el primer apellido");
        
    
}
}
