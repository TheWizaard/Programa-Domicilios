import javax.swing.*;


class program{  
    public static void main(String[] args) {
        
        String Nombre_Usuario,Direccion,Correo_Usuario,;
        int DocumentoID,Decision_Tienda,Eleccion_Helado;

        JOptionPane.showMessageDialog(null, "Bienvenido a Nuestra APP de Domicilios", "BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Digite los siguientes datos para registrarlo en el sistema", "INGRESO DE DATOS",JOptionPane.INFORMATION_MESSAGE);
        Nombre_Usuario = JOptionPane.showInputDialog("INTRODUZCA SU NOMBRE", "");
        Direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCION", "");
        Correo_Usuario = JOptionPane.showInputDialog("INGRESE SU CORREO", "");
        DocumentoID = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU DOCUMENTO CC",""));

        JOptionPane.showMessageDialog(null,"Sus datos han sido registrados correctamente","AFIRMACION",JOptionPane.INFORMATION_MESSAGE);

        Decision_Tienda = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE SU TIENDA\n 1)Heladeria Crepes and Waffles\n 2)Dominos Pizza\n 3)OXXO",""));

        switch (Decision_Tienda) {

            case 1 -> {
                JOptionPane.showMessageDialog(null,"Su eleccion se ha ejecutado correctamente\n BIENVENIDO a nuestra Heladeria Crepes and Waffles", "Creppes And Waffles",JOptionPane.INFORMATION_MESSAGE);

                Eleccion_Helado = Integer.parseInt(JOptionPane.showInputDialog("NUESTRA TIENDA OFRECE LOS SIGUIENTES PRODUCTOS, SELECCIONE CUAL LE GUSTARIA ELEGIR", ""));


            }
        

        }
    }        
}
