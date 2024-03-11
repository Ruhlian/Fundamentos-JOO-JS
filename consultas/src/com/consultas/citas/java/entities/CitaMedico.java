package com.consultas.citas.java.entities;

import java.time.LocalDateTime;
import com.consultas.citas.java.enums.EstadoCita;
import com.consultas.citas.java.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable {

    private Medico medico;
    private String motivo;
    private EstadoCita estado;

    public CitaMedico(int id,
                     LocalDateTime fecha,
                     Paciente paciente,
                     Consultorio consultorio,
                     Medico m,
                     String motivo,
                     EstadoCita estado)
        {
        super(id, fecha, paciente, consultorio);
        this.medico = m;
        this.motivo = motivo;
        this.estado = estado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        this.estado = EstadoCita.AGENDADA;
    }

    @Override
    public void cancelarCita() {
        
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        
    }

}
