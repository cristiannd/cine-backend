package com.cd.cine.entity;

import jakarta.persistence.*;
import lombok.*;

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
}
