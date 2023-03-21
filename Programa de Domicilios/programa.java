import javax.management.openmbean.OpenDataException;
import javax.print.attribute.standard.JobPriority;
import javax.swing.*;
import javax.swing.event.DocumentEvent;

class program {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ImageIcon Creppes_And_Waffles = new ImageIcon("Programa de Domicilios/TIENDA_CREPPES.jpeg");
        String Nombre_Usuario, Direccion, Correo_Usuario, Nombre_Titular;
        int DocumentoID, Decision_Tienda, Eleccion_Helado, Metodo_Pago, Codigo_tarjeta, Codigo_Seguridad, repetir = 1,
                seguir = 1;

        JOptionPane.showMessageDialog(null, "Bienvenido a Nuestra APP de Domicilios", "BIENVENIDO",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Digite los siguientes datos para registrarlo en el sistema",
                "INGRESO DE DATOS", JOptionPane.INFORMATION_MESSAGE);
        Nombre_Usuario = JOptionPane.showInputDialog("INTRODUZCA SU NOMBRE", "");
        Direccion = JOptionPane.showInputDialog("INGRESE SU DIRECCION", "DIRECCION");
        Correo_Usuario = JOptionPane.showInputDialog("INGRESE SU CORREO", "");
        DocumentoID = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU DOCUMENTO CC", ""));

        JOptionPane.showMessageDialog(null, "Sus datos han sido registrados correctamente", "AFIRMACION",
                JOptionPane.INFORMATION_MESSAGE);

        while (repetir == 1) {
            Decision_Tienda = Integer.parseInt(JOptionPane.showInputDialog(
                    "SELECCIONE SU TIENDA\n 1)Heladeria Creppes and Waffles\n 2)Dominos Pizza\n 3)OXXO \n 4)KFC", ""));

            switch (Decision_Tienda) {
                // TIENDA 1, CREPPES AND WAFFLES
                case 1 -> {
                    JOptionPane.showMessageDialog(null,
                            "Su eleccion se ha ejecutado correctamente\nBIENVENIDO a nuestra Heladeria Crepes and Waffles",
                            "Creppes And Waffles", JOptionPane.INFORMATION_MESSAGE, Creppes_And_Waffles);
                    Eleccion_Helado = Integer.parseInt(JOptionPane.showInputDialog(
                            "NUESTRA TIENDA OFRECE LOS SIGUIENTES PRODUCTOS, SELECCIONE CUAL LE GUSTARIA ELEGIR\n 1)Capricho Maracuya              Tiene un valor de $15.000\n 2)Copa Suprema               Tiene un valor de $20.000\n 3)Copa Banana Royal            Tiene un Valor de $30.000\n 4)Copa Brownie            Tiene un valor de $33.000",
                            ""));

                    switch (Eleccion_Helado) {
                        // HELADO 1
                        case 1 -> {
                            JOptionPane.showMessageDialog(null,
                                    "Su eleccion ha sido el Helado Capricho Maracuya\nEl helado tiene un Valor de $15.000",
                                    "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);

                            Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",
                                    ""));

                            switch (Metodo_Pago) {
                                // TARJETA CREDITO O DEBITO
                                case 1 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    Codigo_tarjeta = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito", ""));

                                    Nombre_Titular = JOptionPane
                                            .showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                                    Codigo_Seguridad = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));

                                    JOptionPane.showMessageDialog(null,
                                            "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                    + "\nCon Documento CC: " + DocumentoID
                                                    + "\nSu factura sera enviada a su correo: " + Correo_Usuario,
                                            "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $15.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $19.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }

                                // GENERAR RECIBO
                                case 2 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $15.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $19.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }
                            }
                        }
                        // HELADO 2
                        case 2 -> {

                            JOptionPane.showMessageDialog(null,
                                    "Su eleccion ha sido el Helado Copa Suprema\nEl helado tiene un Valor de $20.000",
                                    "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);

                            Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",
                                    ""));

                            switch (Metodo_Pago) {
                                // PSE
                                case 1 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    Codigo_tarjeta = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito", ""));

                                    Nombre_Titular = JOptionPane
                                            .showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                                    Codigo_Seguridad = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));

                                    JOptionPane.showMessageDialog(null,
                                            "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                    + "\nCon Documento CC: " + DocumentoID
                                                    + "\nSu factura sera enviada a su correo: " + Correo_Usuario,
                                            "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $20.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $24.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                }
                                // GENERAR RECIBO
                                case 2 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $20.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $24.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }
                            }
                        }
                        // HELADO 3
                        case 3 -> {
                            JOptionPane.showMessageDialog(null,
                                    "Su eleccion ha sido el Helado Copa Banana Royal\nEl helado tiene un Valor de $30.000",
                                    "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);

                            Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",
                                    ""));

                            switch (Metodo_Pago) {
                                // TARJETA CREDITO O DEBITO
                                case 1 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    Codigo_tarjeta = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito", ""));

                                    Nombre_Titular = JOptionPane
                                            .showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                                    Codigo_Seguridad = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));

                                    JOptionPane.showMessageDialog(null,
                                            "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                    + "\nCon Documento CC: " + DocumentoID
                                                    + "\nSu factura sera enviada a su correo: " + Correo_Usuario,
                                            "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $30.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $34.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }

                                // GENERAR RECIBO
                                case 2 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $30.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $34.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }
                            }
                        }
                        case 4 -> {
                            JOptionPane.showMessageDialog(null,
                                    "Su eleccion ha sido el Helado Copa Brownie\nEl helado tiene un Valor de $33.000",
                                    "ELECCION HELADO", JOptionPane.INFORMATION_MESSAGE);

                            Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Seleccione Su Metodo de Pago\n 1)Tarjeta de Credito o Debito\n 2)Generar Recibo",
                                    ""));

                            switch (Metodo_Pago) {
                                // TARJETA CREDITO O DEBITO
                                case 1 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago con tarjeta de Credito o Debito",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    Codigo_tarjeta = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de la Trajeta de Credito o Debito", ""));

                                    Nombre_Titular = JOptionPane
                                            .showInputDialog("Digite el Nombre del Titular de la Tarjeta", "");

                                    Codigo_Seguridad = Integer.parseInt(JOptionPane
                                            .showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));

                                    JOptionPane.showMessageDialog(null,
                                            "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                    + "\nCon Documento CC: " + DocumentoID
                                                    + "\nSu factura sera enviada a su correo: " + Correo_Usuario,
                                            "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $33.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $37.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }

                                // GENERAR RECIBO
                                case 2 -> {

                                    JOptionPane.showMessageDialog(null,
                                            "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI",
                                            "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                    JOptionPane.showMessageDialog(null, "Nombre de Usuario: " + Nombre_Usuario
                                            + "\nDocumento CC:" + DocumentoID + "\nCorreo: " + Correo_Usuario
                                            + "\nCompra de Un Helado Capricho Maracuya por un valor de $33.000\nValor domicilio: $4.000"
                                            + "\nTotal de Pago: $37s.000\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                            "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);

                                    break;
                                }

                            }

                        }
                    }

                }
                // TIENDA 2, DOMINOS PIZZA
                case 2 -> {
                    int repetireleccionDP = 1, totalTODO = 0, productosPizza, cantidad, cantidadFinal = 0, valor;

                    JOptionPane.showMessageDialog(null, "Ha Seleccionado Domino's Pizza", "Domino's Pizza",
                            JOptionPane.INFORMATION_MESSAGE);
                    while (repetireleccionDP == 1) {
                        productosPizza = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Le ofrecemos estos productos: \n 1: Pizza Mediana con Jamon y Piña $18.900 \n 2: Domicombo-Pizza Grande + Arequipe Rolls + Gaseosa 1.5 L Valor $45.900 \n 3: Pizza Dominisima- Pizza Mediana + Arequipe Rolls + Gaseosa 1.5 L - Valor $29.000"));

                        switch (productosPizza) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Su eleccion ha sido Pizza Mediana Valor $18.900",
                                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                                cantidad = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Cuantas Pizza´s Medianas van a ser?"));
                                valor = 18900;
                                totalTODO += valor * cantidad;
                                cantidadFinal = cantidad;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Su eleccion ha sido Pizza Domicombo Valor $45.900",
                                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                                cantidad = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Cuantas Pizza´s Domicombo van a ser?"));
                                valor = 45900;
                                totalTODO += valor * cantidad;
                                cantidadFinal = cantidad;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,
                                        "Su eleccion ha sido Pizza Dominisima Valor $29.900", "Confirmación",
                                        JOptionPane.INFORMATION_MESSAGE);
                                cantidad = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Cuantas Pizza´s Dominisimas van a ser?"));
                                valor = 29000;
                                totalTODO += valor * cantidad;
                                cantidadFinal = cantidad;
                                break;
                        }

                        Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Cual es su Metodo de Pago? \n 1: Tarjeta de Credito \n 2: Tarjeta de Debito \n 3: Generar Recibo"));
                        switch (Metodo_Pago) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Usted ha elegido Tarjeta de Credito");
                                Nombre_Titular = JOptionPane.showInputDialog(null, "Nombre Titular de la Tarjeta",
                                        "Nombre Titular", JOptionPane.INFORMATION_MESSAGE);
                                Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Numero de la Tarjeta", "Numero Tarjeta", JOptionPane.INFORMATION_MESSAGE));
                                Codigo_Seguridad = Integer.parseInt(
                                        JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));
                                int Cuotas = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingrese numero de cuotas a pagar", "Cuotas", JOptionPane.INFORMATION_MESSAGE));
                                JOptionPane.showMessageDialog(null,
                                        "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                + "\nCon Documento CC: " + DocumentoID
                                                + "\nSu factura sera enviada a su correo: " + Correo_Usuario
                                                + "\n Referida a: " + Cuotas + " cuotas",
                                        "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Usted ha elegido Tarjeta de Debito");
                                Nombre_Titular = JOptionPane.showInputDialog(null, "Nombre Titular de la Tarjeta",
                                        "Nombre Titular", JOptionPane.INFORMATION_MESSAGE);
                                Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Numero de la Tarjeta", "Numero Tarjeta", JOptionPane.INFORMATION_MESSAGE));
                                Codigo_Seguridad = Integer.parseInt(
                                        JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));
                                JOptionPane.showMessageDialog(null,
                                        "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                + "\nCon Documento CC: " + DocumentoID
                                                + "\nSu factura sera enviada a su correo: " + Correo_Usuario,
                                        "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:

                                JOptionPane.showMessageDialog(null,
                                        "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI",
                                        "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error",
                                        JOptionPane.WARNING_MESSAGE);
                                break;

                        }
                        if (productosPizza == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID
                                            + "\nCorreo: " + Correo_Usuario + "\n Hace Compra de " + cantidadFinal
                                            + " Pizza Mediana por un total de un valor de " + (totalTODO)
                                            + "\nValor domicilio: $4.000 \nTotal de Pago: " + (totalTODO + 4000)
                                            + "\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                    "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        } else if (productosPizza == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID
                                            + "\nCorreo: " + Correo_Usuario + "\n Hace Compra de " + cantidadFinal
                                            + " Domicombo por un total de un valor de " + (totalTODO)
                                            + "\nValor domicilio: $4.000 \nTotal de Pago: " + (totalTODO + 4000)
                                            + "\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                    "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        } else if (productosPizza == 3) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID
                                            + "\nCorreo: " + Correo_Usuario + "\n Hace Compra de " + cantidadFinal
                                            + " Pizza Dominisima por un total de un valor de " + (totalTODO)
                                            + "\nValor domicilio: $4.000 \nTotal de Pago: " + (totalTODO + 4000)
                                            + "\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                    "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        }

                        repetireleccionDP = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Quiere Elegir Otro Producto de Dominos Pizza? \n 1: Si \n 2: No"));
                        totalTODO = 0;
                    }

                    break;
                }

                // TIENDA 3, OXXO
                case 3 -> {

                }

                case 4 -> {

                    // KFC
                    int repetirKFC = 1, cantidad, valor, totalTODO = 0, cantidadFinal = 0;
                    JOptionPane.showMessageDialog(null, "Has seleccionado KFC", "KFC", JOptionPane.INFORMATION_MESSAGE);
                    while (repetirKFC == 1) {
                        int productosKFC = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Los productos que tenemos de KFC son: \n 1: Wow Box Duo $50.000 \n 2: Wow Bucket Original $49.900 \n 3:Snack Bucket Gaseosa $56.000"));
                        switch (productosKFC) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el producto Wow Box Duo",
                                        "Wow Box Duo", JOptionPane.INFORMATION_MESSAGE);
                                cantidad = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Cuantos de este Wow box duo van a ser?"));
                                valor = 50000;
                                totalTODO += valor * cantidad;
                                cantidadFinal = cantidad;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el producto Wow Bucket Duo",
                                        "Wow Box Original", JOptionPane.INFORMATION_MESSAGE);
                                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Cuantos de este Wow Bucket Original van a ser?"));
                                valor = 49900;
                                totalTODO += valor * cantidad;
                                cantidadFinal = cantidad;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el producto Snack Bucket Gaseosa",
                                        "Wow Box Original", JOptionPane.INFORMATION_MESSAGE);
                                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Cuantos de este Snack Bucket Gaseosa van a ser?"));
                                valor = 56000;
                                totalTODO += valor * cantidad;
                                cantidadFinal = cantidad;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Invalida");
                                break;

                        }
                        Metodo_Pago = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Cual es su Metodo de Pago? \n 1: Tarjeta de Credito \n 2: Tarjeta de Debito \n 3: Generar Recibo"));
                        switch (Metodo_Pago) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Usted ha elegido Tarjeta de Credito");
                                Nombre_Titular = JOptionPane.showInputDialog(null, "Nombre Titular de la Tarjeta",
                                        "Nombre Titular", JOptionPane.INFORMATION_MESSAGE);
                                Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Numero de la Tarjeta", "Numero Tarjeta", JOptionPane.INFORMATION_MESSAGE));
                                Codigo_Seguridad = Integer.parseInt(
                                        JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));
                                int Cuotas = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingrese numero de cuotas a pagar", "Cuotas", JOptionPane.INFORMATION_MESSAGE));
                                JOptionPane.showMessageDialog(null,
                                        "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                + "\nCon Documento CC: " + DocumentoID
                                                + "\nSu factura sera enviada a su correo: " + Correo_Usuario
                                                + "\n Referida a: " + Cuotas + " cuotas",
                                        "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Usted ha elegido Tarjeta de Debito");
                                Nombre_Titular = JOptionPane.showInputDialog(null, "Nombre Titular de la Tarjeta",
                                        "Nombre Titular", JOptionPane.INFORMATION_MESSAGE);
                                Codigo_tarjeta = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Numero de la Tarjeta", "Numero Tarjeta", JOptionPane.INFORMATION_MESSAGE));
                                Codigo_Seguridad = Integer.parseInt(
                                        JOptionPane.showInputDialog("Digite el Codigo de Seguridad de la Tarjeta", ""));
                                JOptionPane.showMessageDialog(null,
                                        "Su compra ha sido Confirmada, Usuario: " + Nombre_Usuario
                                                + "\nCon Documento CC: " + DocumentoID
                                                + "\nSu factura sera enviada a su correo: " + Correo_Usuario,
                                        "DATOS-FACTURA", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case 3:

                                JOptionPane.showMessageDialog(null,
                                        "Usted ha elegido el Metodo de Pago para Generar Recibo\nDirijase al punto de pago mas cercano e indique el siguiente codigo de pago: 3234240943553EI",
                                        "METODO DE PAGO", JOptionPane.INFORMATION_MESSAGE);

                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error",
                                        JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        if (productosKFC == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID
                                            + "\nCorreo: " + Correo_Usuario + "\nHace Compra de " + cantidadFinal
                                            + " Wow Box Duo por un total de un valor de " + (totalTODO)
                                            + "\nValor domicilio: $4.000 \nTotal de Pago: " + (totalTODO + 4000)
                                            + "\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                    "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        } else if (productosKFC == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID
                                            + "\nCorreo: " + Correo_Usuario + "\nHace Compra de " + cantidadFinal
                                            + " Wow Bucket Original por un total de un valor de " + (totalTODO)
                                            + "\nValor domicilio: $4.000 \nTotal de Pago: " + (totalTODO + 4000)
                                            + "\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                    "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        } else if (productosKFC == 3) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre de Usuario: " + Nombre_Usuario + "\nDocumento CC:" + DocumentoID
                                            + "\nCorreo: " + Correo_Usuario + "\nHace Compra de " + cantidadFinal
                                            + " Snack Bucket Gaseosa por un total de un valor de " + (totalTODO)
                                            + "\nValor domicilio: $4.000 \nTotal de Pago: " + (totalTODO + 4000)
                                            + "\nTiempo Estimado de Llegada del Producto: 30 Minutos",
                                    "Pre-visualizacion de Factura", JOptionPane.INFORMATION_MESSAGE);
                        }

                        repetirKFC = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Quiere Elegir Otro Producto de KFC? \n 1: Si \n 2: No"));
                        totalTODO = 0;
                    }
                }

            }
            repetir = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Volver a la seleccion de Tiendas? 1: Si \n 2:No", "Volver", JOptionPane.INFORMATION_MESSAGE));
        }

    }
}
