package com.sedat;


import com.sedat.controller.OgrenciController;
import com.sedat.controller.OgretmenController;
import com.sedat.controller.SinifController;
import com.sedat.enums.EBrans;
import com.sedat.repository.entity.KisiselBilgiler;
import com.sedat.repository.entity.Ogrenci;
import com.sedat.repository.entity.Ogretmen;
import com.sedat.repository.entity.Sinif;
import com.sedat.repository.hql.OgrenciDao;

import java.util.List;

import com.sedat.util.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

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


//        OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
//       // ogretmenCriteria.findAll();
//     //   ogretmenCriteria.findById(1L);
//
//        OgrenciCriteria ogrenciCriteria = new OgrenciCriteria();
//       // ogrenciCriteria.findAll();
//       // ogrenciCriteria.findById(2L);
//
//        SinifCriteria sinifCriteria = new SinifCriteria();
//       // sinifCriteria.findAll();
//        sinifCriteria.findById(1L);

//        OgrenciDao ogrenciDao = new OgrenciDao();
//        List<Ogrenci> ogrenciList = ogrenciDao.findAll();
//        ogrenciList.stream().forEach(x->{
//            System.out.println(x);
//        });

        /*Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ali")
                        .soyisim("Dogan")
                        .tcKimlikNo("2534566")
                        .build())
                .dogumTarihi(LocalDate.of(1995,3,19))
                .build();

        OgrenciController ogrenciController = new OgrenciController();
        ogrenciController.save(ogrenci);*/

      /*  Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Sedat")
                        .soyisim("Akdogan")
                        .tcKimlikNo("455545345345")
                        .build())
                .dogumTarihi(LocalDate.of(1997,5,19))
                .build();
        OgrenciController ogrenciController = new OgrenciController();
        ogrenciController.save(ogrenci);

        Ogretmen ogretmen = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("Hoca")
                        .tcKimlikNo("45345365")
                        .build())
                .iseBaslamaTarihi(LocalDate.of(1996,6,23))
                .brans(EBrans.BIYOLOJI)
                .build();

        ;*/
        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Sedat")
                        .soyisim("Akdogan")
                        .tcKimlikNo("455545345345")
                        .build())
                .dogumTarihi(LocalDate.of(1997,5,19))
                .build();

        Ogretmen ogretmen1 = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Alp")
                        .soyisim("Ikinci")
                        .tcKimlikNo("54723245")
                        .build())
                .iseBaslamaTarihi(LocalDate.of(1996,6,23))
                .brans(EBrans.BIYOLOJI)
                .build();
        // OgretmenController ogretmenController = new OgretmenController();
       // ogretmenController.save(ogretmen1);

        Sinif sinif = Sinif.builder()
                .sinifAdi("ÖZBOKUBONCUKLULAR")
                .ogretmenId(1L)
                .ogrenciler(List.of(ogrenci.getKisiselBilgiler().getIsim()))
                .build();
        SinifController sinifController = new SinifController();
        sinifController.save(sinif);
//        session.save(ogrenci);
//        transaction.commit();
//        session.close();


    }

}