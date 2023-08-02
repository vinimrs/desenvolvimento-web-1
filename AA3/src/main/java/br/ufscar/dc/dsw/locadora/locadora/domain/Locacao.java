package br.ufscar.dc.dsw.locadora.locadora.domain;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

//@ValidLocacao(message = "{ValidLocacao.locacao}")
@Entity
@Table(name = "Locacao",
    uniqueConstraints = @UniqueConstraint(columnNames = {"hour", "date", "client_id"})
)
public class Locacao extends AbstractEntity<Long> {
  @NotNull
  @Column(nullable = false, columnDefinition = "Time", name = "hour")
  private LocalTime hour;

  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @Column(nullable = false, columnDefinition = "Date", name = "date")
  private LocalDate date;

  @NotNull(message = "{NotNull.locacao.locadora}")
  @ManyToOne
  @JoinColumn(name = "rentalCompany_id")
  private Locadora rentalCompany;

  @NotNull()
  @ManyToOne
  @JoinColumn(name = "client_id")
  private Cliente client;


  public LocalTime getHour() {
    return hour;
  }

  public void setHour(LocalTime hour) {
    this.hour = hour;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Locadora getRentalCompany() {
    return rentalCompany;
  }

  public void setRentalCompany(Locadora rentalCompany) {
    this.rentalCompany = rentalCompany;
  }

  public Cliente getClient() {
    return client;
  }

  public void setClient(Cliente client) {
    this.client = client;
  }
}
