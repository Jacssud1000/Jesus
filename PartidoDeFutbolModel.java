package br.com.meli.partidafutbol.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(
        name = "tb_partidosDeFutbol"
)
public class PartidoDeFutbolModel implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private Long id;
    private String timeCasa;
    private String timeVisitante;
    private String resultado;
    private String estadio;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaehora")
    private Date dataHoraPartida;

    //@ManyToMany(mappedBy = "partidoDeFutbolModels", fetch = FetchType.EAGER)
    //private Set<ClubModel> clubs;

    @ManyToOne
    private EstadioModel locals;

    private PartidoDeFutbolModel(Long id, String timeCasa, String timeVisitante, String resultado, String estadio) {
        this.id = id;
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.resultado = resultado;
        this.estadio = estadio;
    }

    public PartidoDeFutbolModel(String timeCasa, String timeVisitante, String resultado, String estadio, Date dataHoraPartida, EstadioModel locals) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.resultado = resultado;
        this.estadio = estadio;
        this.dataHoraPartida = dataHoraPartida;
        this.locals = locals;
    }
/* private PartidoDeFutbolModel(Date dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }*/

    public PartidoDeFutbolModel() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimeCasa() {
        return this.timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return this.timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getEstadio() {
        return this.estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public EstadioModel getLocals() {
        return this.locals;
    }

    public void setLocals(EstadioModel locals) {
        this.locals = locals;
    }

    public Date getdataHoraPartida() {
        return dataHoraPartida;
    }

    public void setFechaehora(LocalDateTime fechaHora) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PartidoDeFutbolModel that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getTimeCasa(), that.getTimeCasa()) && Objects.equals(getTimeVisitante(), that.getTimeVisitante()) && Objects.equals(getResultado(), that.getResultado()) && Objects.equals(getEstadio(), that.getEstadio()) && Objects.equals(getdataHoraPartida(), that.getdataHoraPartida()) && Objects.equals(getLocals(), that.getLocals());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTimeCasa(), getTimeVisitante(), getResultado(), getEstadio(), getdataHoraPartida(), getLocals());
    }

    public LocalDateTime getDataHoraPartida() {
        return getDataHoraPartida();
    }
}
