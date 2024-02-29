package com.cd.cine.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "films")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String description;

  @OneToMany(mappedBy = "film")
  private List<Schedule> schedules;
}
