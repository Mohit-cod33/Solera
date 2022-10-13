package webappgradle.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import webappgradleentities.Dealer;

public class DealerDaoImpl implements DealerDAO{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
    EntityManager em = emf.createEntityManager();



   @Override
    public Dealer createDealer(Dealer dealer) {
        // TODO Auto-generated method stub
        em.getTransaction().begin();
        em.persist(dealer);
        em.getTransaction().commit();
        return dealer;
    }



   @Override
    public Dealer retrieveDealerById(Integer dealerId) {
//	   Dealer dealer1 = em.find(Dealer.class, dealer);
        return null;
    }



   @Override
    public Dealer updateDealer(Dealer dealer) {
        // TODO Auto-generated method stub
        Dealer dealer1 = em.find(Dealer.class, dealer);
        if(dealer1 !=null) {
            dealer1.setCity(dealer.getCity());
            dealer1.setDealerName(dealer.getDealerName());
            em.getTransaction().begin();
            em.persist(dealer1);
            em.getTransaction().commit();
        }
        return dealer1;
    }



   @Override
    public String deleteDealer(Integer dealerId) {
        // TODO Auto-generated method stub
        em.getTransaction().begin();
        Dealer dealer = em.find(Dealer.class, dealerId);
        em.remove(dealerId);
        em.getTransaction().commit();
        
        return "Deleted successfully";
    }

}
