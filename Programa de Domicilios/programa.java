import javax.management.openmbean.OpenDataException;
import javax.swing.*;
import javax.swing.event.DocumentEvent;


class program{  
    public static void main(String[] args) {
        
        String Nombre_Usuario,Direccion,Correo_Usuario,Nombre_Titular;
        int DocumentoID,Decision_Tienda,Eleccion_Helado,Confirmacion_Helado,Metodo_Pago,Codigo_tarjeta,Codigo_Seguridad;


        JOptionPane.showMessageDialog(null, "Bienvenido a Nuestra APP de Domicilios", "BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Digite los siguientes datos para registrarlo en el sistema", "INGRESO DE DATOS",JOptionPane.INFORMATION_MESSAGE);
        Nombre_Usuario = JOptionPane.showInputDialog("INTRODUZCA SU NOMBRE", "");
        Direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCION", "");
        Correo_Usuario = JOptionPane.showInputDialog("INGRESE SU CORREO", "");
        DocumentoID = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU DOCUMENTO CC",""));

        JOptionPane.showMessageDialog(null,"Sus datos han sido registrados correctamente","AFIRMACION",JOptionPane.INFORMATION_MESSAGE);

        Decision_Tienda = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE SU TIENDA\n 1)Heladeria Creppes and Waffles\n 2)Dominos Pizza\n 3)OXXO",""));

        switch (Decision_Tienda) {
            //TIENDA 1, CREPPES AND WAFFLES
            case 1 -> {
                JOptionPane.showMessageDialog(null,"Su eleccion se ha ejecutado correctamente\nBIENVENIDO a nuestra Heladeria Crepes and Waffles", "Creppes And Waffles",JOptionPane.INFORMATION_MESSAGE);

                Eleccion_Helado = Integer.parseInt(JOptionPane.showInputDialog("NUESTRA TIENDA OFRECE LOS SIGUIENTES PRODUCTOS, SELECCIONE CUAL LE GUSTARIA ELEGIR\n 1)Capricho Maracuya              Tiene un valor de $15.000\n 2)Copa Suprema               Tiene un valor de $20.000\n 3)Copa Banana Royal            Tiene un Valor de $30.000\n 4)Copa Brownie            Tiene un valor de $33.000", ""));

                switch (Eleccion_Helado){
                    // HELADO 1
                    case 1 ->{
                        JOptionPane.showMessageDialog(null, "Su eleccion ha sido el Helado Capricho Maracuya\nEl helado tiene un Valor de $15.000", "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);
                        
                        Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",""));
                       
                     switch (Metodo_Pago) {
                        //TARJETA CREDITO O DEBITO
                        case 1 ->{

                        JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                        Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito",""));

                        Nombre_Titular = JOptionPane.showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                        Codigo_Seguridad = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta",""));

                        JOptionPane.showMessageDialog(null,"Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario + "\nCon Documento CC: " + DocumentoID + "\nSu factura sera enviada a su correo: " + Correo_Usuario,"DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $15.000\nValor domicilio: $4.000" + "\nTotal de Pago: $19.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                       }
                       
                        //GENERAR RECIBO
                        case 2 ->{

                            JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                            JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $15.000\nValor domicilio: $4.000" + "\nTotal de Pago: $19.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                                }
                }
            }
                //HELADO 2
                   case 2 ->{

                    JOptionPane.showMessageDialog(null, "Su eleccion ha sido el Helado Copa Suprema\nEl helado tiene un Valor de $20.000", "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);
                
                     Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",""));
               
                     switch (Metodo_Pago) {
                      //PSE      
                       case 1 ->{

                     JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                      Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito",""));

                       Nombre_Titular = JOptionPane.showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                    Codigo_Seguridad = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta",""));

                       JOptionPane.showMessageDialog(null,"Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario + "\nCon Documento CC: " + DocumentoID + "\nSu factura sera enviada a su correo: " + Correo_Usuario,"DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                      JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $20.000\nValor domicilio: $4.000" + "\nTotal de Pago: $24.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);


                          }
                //GENERAR RECIBO   
                case 2 ->{

                JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $20.000\nValor domicilio: $4.000" + "\nTotal de Pago: $24.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                                }
                                     }
                    }
                    //HELADO 3
                    case 3 ->{
                        JOptionPane.showMessageDialog(null, "Su eleccion ha sido el Helado Copa Banana Royal\nEl helado tiene un Valor de $30.000", "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);
                        
                        Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",""));
                       
                     switch (Metodo_Pago) {
                        //TARJETA CREDITO O DEBITO
                        case 1 ->{

                        JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                        Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito",""));

                        Nombre_Titular = JOptionPane.showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                        Codigo_Seguridad = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta",""));

                        JOptionPane.showMessageDialog(null,"Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario + "\nCon Documento CC: " + DocumentoID + "\nSu factura sera enviada a su correo: " + Correo_Usuario,"DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $30.000\nValor domicilio: $4.000" + "\nTotal de Pago: $34.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                       }
                       
                        //GENERAR RECIBO
                        case 2 ->{

                            JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                            JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $30.000\nValor domicilio: $4.000" + "\nTotal de Pago: $34.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                                }
                }
            }
            case 4 ->{
                JOptionPane.showMessageDialog(null, "Su eleccion ha sido el Helado Copa Brownie\nEl helado tiene un Valor de $33.000", "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);
                
                Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",""));
               
             switch (Metodo_Pago) {
                //TARJETA CREDITO O DEBITO
                case 1 ->{

                JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito",""));

                Nombre_Titular = JOptionPane.showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                Codigo_Seguridad = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta",""));

                JOptionPane.showMessageDialog(null,"Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario + "\nCon Documento CC: " + DocumentoID + "\nSu factura sera enviada a su correo: " + Correo_Usuario,"DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $33.000\nValor domicilio: $4.000" + "\nTotal de Pago: $37.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                
                break;
               }
               
                //GENERAR RECIBO
                case 2 ->{

                    JOptionPane.showMessageDialog(null, "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI", "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                    JOptionPane.showMessageDialog(null,"Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario + "\nCompra de Un Helado Capricho Maracuya por un valor de $33.000\nValor domicilio: $4.000" + "\nTotal de Pago: $37s.000\nTiempo Estimado de Llegada del Producto: 30 Minutos", "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                
                break;
                        }
        }
    }
                                        }

                } 
                //TIENDA 2, DOMINOS PIZZA
                case 2 ->{

                    //DOMINOS PIZZA

                break;
                        }

                //TIENDA 3, OXXO
                case 3 ->{



                    //OXXO
                         }
                case 4 ->{

                    //TIENDA DE DANIEL
                }
        }
    }
}
  




           

    

