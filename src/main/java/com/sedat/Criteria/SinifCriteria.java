package com.sedat.Criteria;



import com.sedat.repository.entity.Sinif;
import com.sedat.util.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class SinifCriteria {

    private EntityManager entityManager;
    private CriteriaBuilder criteriaBuilder;


    public SinifCriteria() {

        entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder = entityManager.getCriteriaBuilder();
    }

    public List<Sinif> findAll(){
        CriteriaQuery<Sinif> criteria = criteriaBuilder.createQuery(Sinif.class);
        Root<Sinif> root = criteria.from(Sinif.class);
        criteria.select(root);
        List<Sinif> sinifList = entityManager.createQuery(criteria).getResultList();
        sinifList.forEach(System.out::println);
        return sinifList;
    }

    public Sinif findById(Long id){
        CriteriaQuery<Sinif> criteria = criteriaBuilder.createQuery(Sinif.class);
        Root<Sinif> root = criteria.from(Sinif.class);
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        Sinif sinif = entityManager.createQuery(criteria).getSingleResult();
        System.out.println(sinif);
        return sinif;


    }



}

