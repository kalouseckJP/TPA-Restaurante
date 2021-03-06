import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class principal{
    public static void main(String[] args) throws IOException{
        int cantidadPersonasReserva;
        int cantidadMesasReserva;
        int cantidadPlatosEspeciales;
        int cantidadServiciosExtras;
        String elMenuEspecial;
        String nombreCompleto;
        String comida;
        String degustacion;
        int rut;
        float horaInicio;
        float horaFin;
        
        //Mesas
        Mesas.crearMesas();
        
        // Datos personales del cliente
        nombreCompleto = JOptionPane.showInputDialog("Escriba su nombre completo para comenzar a registrar su reserva");
        rut = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su RUT sin digito verificador"));
        while(rut>26000000 || rut<16000000){
            rut = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el RUT SIN DIGITO VERIFICADOR"));
        }

        // Horas reserva
        horaInicio = Float.parseFloat(JOptionPane.showInputDialog("Escriba la hora a la cual llegara, por ejemplo:   16.30"));
        while(horaInicio < 5 || horaInicio > 5.59 && horaInicio < 6 || horaInicio > 6.59 && horaInicio < 7 || horaInicio > 7.59 && horaInicio < 
        8 || horaInicio > 8.59 && horaInicio < 9 || horaInicio > 9.59 && horaInicio < 10 || horaInicio > 10.59 && horaInicio < 11 || horaInicio > 
            11.59 && horaInicio < 12 || horaInicio >  12.59 && horaInicio < 13 || horaInicio > 13.59 && horaInicio < 14 || horaInicio > 
            14.59 && horaInicio < 15 || horaInicio > 15.59 && horaInicio < 16 || horaInicio > 16.59 && horaInicio < 17 || horaInicio > 
            17.59 && horaInicio < 18 || horaInicio > 18.59 && horaInicio < 19 || horaInicio > 19.59 && horaInicio < 20 || horaInicio > 
            20.59 && horaInicio < 21 || horaInicio > 21.59 && horaInicio < 22 || horaInicio > 22.59 && horaInicio < 23){
            horaInicio = Float.parseFloat(JOptionPane.showInputDialog("Escriba una hora valida a la cual llegara, por ejemplo:   16.30"));
        }
        horaFin = Float.parseFloat(JOptionPane.showInputDialog("Escriba la hora a la cual finalizar?? su reserva, por ejemplo:  19.50"));
        while(horaInicio>horaFin){
            horaFin = Float.parseFloat(JOptionPane.showInputDialog("Escriba un hora valida a la cual finalizar?? su reserva, por ejemplo:  19.50"));
        }
        // Verificar si el cliente es visitante o no
        Object [] visitante = {"Si", "No"};
        Object revisar_visitante = JOptionPane.showInputDialog(null, "??Estas usando el servicio de hotel?", "Reservacion", 
        JOptionPane.QUESTION_MESSAGE, null, visitante, visitante[0]);

        // Verificar el tipo de reserva
        Object [] tipo_reserva = {"Normal", "Evento", "Matrimonio"};
        Object revisar_reserva = JOptionPane.showInputDialog(null, "??Que tipo de reserva quiere realizar?", "Reservacion", JOptionPane.QUESTION_MESSAGE, null, tipo_reserva, tipo_reserva[0]);

        // En caso de que sea MATRIMONIO
        if (revisar_reserva==tipo_reserva[2]){
            Object [] confirmarMatrimonio = {"Si", "No"};
            Object ConfirmaPago = JOptionPane.showInputDialog(null, "Para realizar esta reserva debe pagar $200.000. ??Desea confirmar pago?", "Reservacion - Matrimonio", 
            JOptionPane.QUESTION_MESSAGE, null, confirmarMatrimonio, confirmarMatrimonio[0]);
            if (ConfirmaPago==confirmarMatrimonio[0]){
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Pago y reservacion efectuada. El resto de la atencion pactada del evento el dia anterior, todo lo demas que sea consumido o utilizado se cobrara despues de la realizacion del evento");
                
                // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                reserva ReservaMatrimonio = new reserva((String)nombreCompleto, (int)rut, (float)horaInicio, (float)horaFin, (String)revisar_reserva);
                ReservaMatrimonio.guardarReservaMatrimonio();
            }else{
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Pago y reservacion cancelada.");
            }
        }

        // En caso de que sea tipo EVENTO
        if (revisar_reserva==tipo_reserva[1]){          
            Object [] modalidad_reserva = {"Abierta", "Semicerrada", "Cerrada"};
            Object [] opciones_areas = {"Central", "Sala Varas", "Sala Montt", "Terraza"};
            Object modalidad = JOptionPane.showInputDialog(null, "??Que modalidad desea?", "Reservacion", 
            JOptionPane.QUESTION_MESSAGE, null, modalidad_reserva, modalidad_reserva[0]);

            // Modalidad ABIERTA
            if(modalidad==modalidad_reserva[0]){
                Object area_elegida = JOptionPane.showInputDialog(null, "??Que area reservara?", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, opciones_areas, opciones_areas[0]);
                cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("??Cuantas personas asistiran dentro de su reserva?"));
                Object [] menuEspecial = {"Si", "No"};
                Object confirmarMenu = JOptionPane.showInputDialog(null, "??Desea hacer un menu especial?, este tendra un costo establecido por el chef", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, menuEspecial, menuEspecial[0]);
                if (confirmarMenu==menuEspecial[0]){
                    cantidadPlatosEspeciales = Integer.parseInt(JOptionPane.showInputDialog("??Cuantos menu especial desea realizar?"));
                    int i=0;
                    for(i=0;i<cantidadPlatosEspeciales;i++){
                        elMenuEspecial = JOptionPane.showInputDialog("??Ingrese el plato numero " + (i+1)+ " especial que desea?");
                    }
                }
                Object [] serviciosEspeciales = {"Si", "No"};
                Object serviciosExtra = JOptionPane.showInputDialog(null, "??Desea tener servicios extra? - (DJ y sistemas de Sonido, Anfitrion del Evento/Espectaculo, Fotografia y estudios externos e internos, decoracion al gusto del cliente y seguridad)", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, serviciosEspeciales, serviciosEspeciales[0]);
                if(serviciosExtra==serviciosEspeciales[0]){
                    cantidadServiciosExtras = Integer.parseInt(JOptionPane.showInputDialog("??Cuantos servicios especiales desea tener en su evento?"));
                    int i=0;
                    for(i=0;i<cantidadServiciosExtras;i++){
                        Object [] opcionesServiciosExtra = {"DJ y sistemas de sonido", "Anfitrion", "Fotografia y estudios", "Decoracion", "Seguridad"};
                        Object servicioContratado = JOptionPane.showInputDialog(null, "Servicio numero "+(i+1)+" a contratar:", "Reservacion - Evento", 
                        JOptionPane.QUESTION_MESSAGE, null, opcionesServiciosExtra, opcionesServiciosExtra[0]);                        
                    }              
                }

                // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                reserva EventoAbierto = new reserva((String)nombreCompleto, (int)rut, (float)horaInicio, (float)horaFin, (String)revisar_reserva, (String)modalidad, (int)cantidadPersonasReserva, (String)area_elegida);
                EventoAbierto.guardarReservaEventoAbiertoyCerrado();
            }

                
            // Modalidad SEMICERRADA
            if(modalidad==modalidad_reserva[1]){               
                cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("??Cuantas personas asistiran dentro de su reserva?"));
                int i=0;        
                Object [] opcionesAreasSemicerrado = {"Central", "Sala Varas", "Sala Montt", "Terraza"};
                Object [] segundasOpcionesAreasSemicerrado = {"Central", "Sala Varas", "Sala Montt", "Terraza", "Ninguna area mas"};
                Object primeraAreaElegida = JOptionPane.showInputDialog(null, "??Que area reservara?", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, opcionesAreasSemicerrado, opcionesAreasSemicerrado[0]);                         
                Object segundaAreaElegida = JOptionPane.showInputDialog(null,"Elija otra area en caso de que sea necesaria en su reserva, de lo contrario, opte por 'Ninguna area mas'", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, segundasOpcionesAreasSemicerrado, segundasOpcionesAreasSemicerrado[0]);             
                Object [] menuEspecial = {"Si", "No"};
                Object confirmarMenu = JOptionPane.showInputDialog(null, "??Desea hacer un menu especial?, este tendra un costo establecido por el chef", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, menuEspecial, menuEspecial[0]);
                if (confirmarMenu==menuEspecial[0]){
                    cantidadPlatosEspeciales = Integer.parseInt(JOptionPane.showInputDialog("??Cuantos menu especial desea realizar?"));
                    for(i=0;i<cantidadPlatosEspeciales;i++){
                        elMenuEspecial = JOptionPane.showInputDialog("??Ingrese el plato numero " + (i+1)+ " especial que desea?");
                    }
                }
                Object [] serviciosEspeciales = {"Si", "No"};
                Object serviciosExtra = JOptionPane.showInputDialog(null, "??Desea tener servicios extra? - (DJ y sistemas de Sonido, Anfitrion del Evento/Espectaculo, Fotografia y estudios externos e internos, decoracion al gusto del cliente y seguridad)", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, serviciosEspeciales, serviciosEspeciales[0]);
                if(serviciosExtra==serviciosEspeciales[0]){
                    cantidadServiciosExtras = Integer.parseInt(JOptionPane.showInputDialog("??Cuantos servicios especiales desea tener en su evento?"));
                    for(i=0;i<cantidadServiciosExtras;i++){
                        Object [] opcionesServiciosExtra = {"DJ y sistemas de sonido", "Anfitrion", "Fotografia y estudios", "Decoracion", "Seguridad"};
                        Object servicioContratado = JOptionPane.showInputDialog(null, "Servicio numero "+(i+1)+" a contratar:", "Reservacion - Evento", 
                        JOptionPane.QUESTION_MESSAGE, null, opcionesServiciosExtra, opcionesServiciosExtra[0]);                        
                    }              
                }

                // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                reserva ReservaEventoSemicerrado = new reserva((String)nombreCompleto, (int)rut, (float)horaInicio, (float)horaFin, 
                (String)revisar_reserva, (String)modalidad, (int)cantidadPersonasReserva, (String)primeraAreaElegida, (String)segundaAreaElegida);
                ReservaEventoSemicerrado.guardarReservaEventoSemicerrado();              
            }
            
            // Modalidad CERRADA
            if(modalidad==modalidad_reserva[2]){
                cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("??Cuantas personas asistiran dentro de su reserva?"));
                Object [] menuEspecial = {"Si", "No"};
                Object confirmarMenu = JOptionPane.showInputDialog(null, "??Desea hacer un menu especial?, este tendra un costo establecido por el chef", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, menuEspecial, menuEspecial[0]);
                if (confirmarMenu==menuEspecial[0]){
                    cantidadPlatosEspeciales = Integer.parseInt(JOptionPane.showInputDialog("??Cuantos menu especial desea realizar?"));
                    int i=0;
                    for(i=0;i<cantidadPlatosEspeciales;i++){
                        elMenuEspecial = JOptionPane.showInputDialog("??Ingrese el plato numero " + (i+1)+ " especial que desea?");
                    }
                }
                Object [] serviciosEspeciales = {"Si", "No"};
                Object serviciosExtra = JOptionPane.showInputDialog(null, "??Desea tener servicios extra? - (DJ y sistemas de Sonido, Anfitrion del Evento/Espectaculo, Fotografia y estudios externos e internos, decoracion al gusto del cliente y seguridad)", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, serviciosEspeciales, serviciosEspeciales[0]);
                if(serviciosExtra==serviciosEspeciales[0]){
                    cantidadServiciosExtras = Integer.parseInt(JOptionPane.showInputDialog("??Cuantos servicios especiales desea tener en su evento?"));
                    int i=0;
                    for(i=0;i<cantidadServiciosExtras;i++){
                        Object [] opcionesServiciosExtra = {"DJ y sistemas de sonido", "Anfitrion", "Fotografia y estudios", "Decoracion", "Seguridad"};
                        Object servicioContratado = JOptionPane.showInputDialog(null, "Servicio numero "+(i+1)+" a contratar:", "Reservacion - Evento", 
                        JOptionPane.QUESTION_MESSAGE, null, opcionesServiciosExtra, opcionesServiciosExtra[0]);                        
                    }              
                }

                // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                reserva EventoCerrado = new reserva((String)nombreCompleto, (int)rut, (float)horaInicio, (float)horaFin, (String)revisar_reserva, (String)modalidad, (int)cantidadPersonasReserva, "Todas");
                EventoCerrado.guardarReservaEventoAbiertoyCerrado();
            }   
        }

        // Caso en que la reserva sea tipo NORMAL
        if (revisar_reserva==tipo_reserva[0]){
            Object [] opciones_areas = {"Central", "Sala Varas", "Sala Montt", "Terraza"};
            cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("??Cuantas personas asistiran dentro de su reserva?"));
            cantidadMesasReserva = Integer.parseInt(JOptionPane.showInputDialog("??Cuantas mesas usara para su reserva? - Las mesas se pueden de a 2, 3 y 5 personas"));
            Object areaElegida = JOptionPane.showInputDialog(null, "??Que plan de comida desea?", "Reservacion - Evento", 
            JOptionPane.QUESTION_MESSAGE, null, opciones_areas, opciones_areas[0]);

            // Comidas y degustaciones
            int i=0;
            Object [] planes_comida = {"Incial: Incluye el plato principal de una comida (almuerzo o cena) del menu diario a gusto del chef. ($20.000)", "Intermedio: Incluye una comida de tres tiempos (entrada, fondo y postre) del menu diario a gusto del chef ($45.000).", "Avanzado: Incluye dos comidas, almuerzo y cena, de tres tiempos del menu abierto de especialidad del chef. ($60.000)", "Ninguno"};
            Object [] planes_degustacion = {"Locales: Incluye tres platos locales en una interpretacion unica. ($30.000)","Internacionales: Incluye tres platos internacionales en una interpretacion unica. ($36.000)", "Cocina Fusion: Incluye tres platos creados en base a alimentos locales, pero utilizando tecnicas de otros paises enuna interpretacion unica. ($40.000)", "Ninguno"};
            for(i=0;i<cantidadPersonasReserva;i++){
                Object PlanComidaElegida = JOptionPane.showInputDialog(null, "??Que plan de comida desea?", "Reservacion - Evento", 
                JOptionPane.QUESTION_MESSAGE, null, planes_comida, planes_comida[0]);
                if(PlanComidaElegida==planes_comida[0]){
                    PlanComidaElegida = "Inicial";
                }
                if(PlanComidaElegida==planes_comida[1]){
                    PlanComidaElegida = "Intermedio";
                }
                if(PlanComidaElegida==planes_comida[2]){
                    PlanComidaElegida = "Avanzado";
                }
                Object PlanDegustacionElegida = JOptionPane.showInputDialog(null, "??Que plan de degustacion desea?", "Reservacion", 
                JOptionPane.QUESTION_MESSAGE, null, planes_degustacion, planes_degustacion[0]);
                if(PlanDegustacionElegida==planes_degustacion[0]){
                    PlanDegustacionElegida = "Local";
                }
                if(PlanDegustacionElegida==planes_degustacion[1]){
                    PlanDegustacionElegida = "Internacional";
                }
                if(PlanDegustacionElegida==planes_degustacion[2]){
                    PlanDegustacionElegida = "Cocina fusion";
                }
            }

            // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
            reserva ReservaNormal = new reserva((String)nombreCompleto, (int)rut, (float)horaInicio, (float)horaFin, (int)cantidadPersonasReserva, (int)cantidadMesasReserva,
            (String)revisar_reserva, (String)areaElegida);
            ReservaNormal.guardarReservaNormal();              
        }     
    }
}