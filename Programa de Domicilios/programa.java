import javax.swing.*;


class program{  
    public static void main(String[] args) {
        
        String Nombre_Usuario,Direccion,Correo_Usuario;
        int DocumentoID,Decision_Tienda,Eleccion_Helado;

        JOptionPane.showMessageDialog(null, "Bienvenido a Nuestra APP de Domicilios", "BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Digite los siguientes datos para registrarlo en el sistema", "INGRESO DE DATOS",JOptionPane.INFORMATION_MESSAGE);
        Nombre_Usuario = JOptionPane.showInputDialog("INTRODUZCA SU NOMBRE", "");
        Direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCION", "");
        Correo_Usuario = JOptionPane.showInputDialog("INGRESE SU CORREO", "");
        DocumentoID = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU DOCUMENTO CC",""));

        JOptionPane.showMessageDialog(null,"Sus datos han sido registrados correctamente","AFIRMACION",JOptionPane.INFORMATION_MESSAGE);

        Decision_Tienda = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE SU TIENDA\n 1)Heladeria Creppes and Waffles\n 2)Dominos Pizza\n 3)OXXO",""));

        switch (Decision_Tienda) {

            case 1 -> {
                JOptionPane.showMessageDialog(null,"Su eleccion se ha ejecutado correctamente\n BIENVENIDO a nuestra Heladeria Crepes and Waffles", "Creppes And Waffles",JOptionPane.INFORMATION_MESSAGE);

                Eleccion_Helado = Integer.parseInt(JOptionPane.showInputDialog("NUESTRA TIENDA OFRECE LOS SIGUIENTES PRODUCTOS, SELECCIONE CUAL LE GUSTARIA ELEGIR\n 1)Capricho Maracuya          Tiene un valor de $15.000\n 2)Copa Suprema         Tiene un valor de $20.000\n 3)Copa Banana Royal         Tiene un Valor de $30.000\n 4)Copa Brownie         Tiene un valor de $33.000", ""));

                switch (Eleccion_Helado){

                    case 1 ->{
                        JOptionPane.showMessageDialog(null, "Su eleccion ha sido el Helado Capricho Maracuya\n El helado tiene un Valor de $15.000", "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);



                    }
                }

            }
        

        }
    }        
}
