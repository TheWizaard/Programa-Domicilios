import javax.swing.*;


class program{  
    public static void main(String[] args) {
        
        String Nombre_Usuario,Direccion,Correo_Usuario,Decision_Tienda;
        int DocumentoID;

        JOptionPane.showMessageDialog(null, "Bienvenido a Nuestra APP de Domicilios", "BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Digite los siguientes datos para registrarlo en el sistema", "INGRESO DE DATOS",JOptionPane.INFORMATION_MESSAGE);
        Nombre_Usuario = JOptionPane.showInputDialog("INTRODUZCA SU NOMBRE", "");
        Direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCION", "");
        Correo_Usuario = JOptionPane.showInputDialog("INGRESE SU CORREO", "");
        DocumentoID = Integer.parseInt(JOptionPane.showInputDialog("",""));

        JOptionPane.showMessageDialog(null,"Sus datos han sido registrados correctamente","AFIRMACION",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showInputDialog(null,"Eliga la tienda a la cual desea", Correo_Usuario, DocumentoID)
    }        
}
