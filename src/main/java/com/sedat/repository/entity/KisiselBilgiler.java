package com.sedat.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KisiselBilgiler {

    @Column(length = 30,
            nullable = false)
    private String isim;

    @Column(length = 30,
            nullable = false)
    private String soyisim;

    @Column(length = 11,
            nullable = false,
            unique = true)
    private String tcKimlikNo;
}
