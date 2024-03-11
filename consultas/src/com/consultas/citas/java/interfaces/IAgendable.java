package com.consultas.citas.java.interfaces;

import java.time.LocalDateTime;

public interface IAgendable {

    //definir comportamiento que otras clases deben implementar 
    //implementar: generar el codigo funete o instrucciones de los metodos
    public void agendarCita(LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fecha);
    
}
