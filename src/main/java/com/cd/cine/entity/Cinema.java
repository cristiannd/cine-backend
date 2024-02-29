package com.cd.cine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cinemas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private Integer capacity;

  @OneToMany(mappedBy = "cinema")
  private List<Schedule> schedules;
}
