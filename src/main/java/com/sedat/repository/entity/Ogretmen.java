package com.sedat.repository.entity;

import com.sedat.enums.EBrans;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ogretmen_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ogretmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Enumerated(EnumType.STRING)
    private EBrans brans;

    @Builder.Default
    @Column(nullable = false)
    private LocalDate iseBaslamaTarihi = LocalDate.now();

    @Embedded
    KisiselBilgiler kisiselBilgiler;

}