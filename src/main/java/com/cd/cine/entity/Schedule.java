package com.cd.cine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "schedules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDateTime date;

  @OneToMany(mappedBy = "schedule")
  private Set<Ticket> ticket = new HashSet<>();

  @ManyToOne
  @JoinColumn(name = "film_id")
  private Film film;

  @ManyToOne
  @JoinColumn(name = "cinema_id")
  private Cinema cinema;
}
