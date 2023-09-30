package com.sedat;

import com.sedat.Criteria.OgrenciCriteria;
import com.sedat.Criteria.OgretmenCriteria;
import com.sedat.Criteria.SinifCriteria;
import com.sedat.repository.entity.Ogretmen;
import com.sedat.repository.entity.Sinif;

public class Main {
    public static void main(String[] args) {
//        Session session = HibernateUtility.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Ogretmen ogretmen = Ogretmen.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Ugur")
//                        .soyisim("Celik")
//                        .tcKimlikNo("123343245")
//                        .build())
//                .brans(EBrans.FIZIK)
////                .iseBaslamaTarihi(LocalDate.of(2022,01,15))
//                .build();
//
//        session.save(ogretmen);
//
//        KisiselBilgiler kisiselBilgiler1 = KisiselBilgiler.builder()
//                .isim("Ali")
//                .soyisim("Veli")
//                .tcKimlikNo("123423")
//                .build();
//        KisiselBilgiler kisiselBilgiler2 = KisiselBilgiler.builder()
//                .isim("Sedat")
//                .soyisim("Akdoğan")
//                .tcKimlikNo("24534324")
//                .build();
//        Ogrenci ogrenci1 = Ogrenci.builder()
//                .kisiselBilgiler(kisiselBilgiler1)
//                .dogumTarihi(LocalDate.of(1997,01,05))
//                .build();
//
//        Ogrenci ogrenci2 = Ogrenci.builder()
//                .kisiselBilgiler(kisiselBilgiler2)
//                .build();
//        session.save(ogrenci1);
//        session.save(ogrenci2);
////        Sinif sinif = Sinif.builder()
////                .sinifAdi("JavaBoost11")
////                .ogretmenId(1L)
////                .ogrenciler(Arrays.asList(ogrenci1.toString(),ogrenci2.toString()))
////                .build();
//
//        Sinif sinif = Sinif.builder()
//                .sinifAdi("JavaBoost11")
//                .ogretmenId(ogretmen.getId())
//                .ogrenciler(List.of(ogrenci1.getKisiselBilgiler().getIsim(),ogrenci2.getKisiselBilgiler().getIsim()))
//                .build();
//
//        session.save(sinif);
//
//        transaction.commit();
//        session.close();


        OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
       // ogretmenCriteria.findAll();
     //   ogretmenCriteria.findById(1L);

        OgrenciCriteria ogrenciCriteria = new OgrenciCriteria();
       // ogrenciCriteria.findAll();
       // ogrenciCriteria.findById(2L);

        SinifCriteria sinifCriteria = new SinifCriteria();
       // sinifCriteria.findAll();
        sinifCriteria.findById(1L);

    }

}