package com.sedat.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_ogrenci")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Builder.Default
    @Column(nullable = false)
    private LocalDate dogumTarihi = LocalDate.now();

    @Embedded
    KisiselBilgiler kisiselBilgiler;
}
