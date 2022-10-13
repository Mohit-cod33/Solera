package webappgradle.service;

import webappgradleentities.Dealer;

public interface DealerService {
public Dealer createDealer(Dealer dealer);
    
    //Retrieve
    public Dealer retrieveDealerById(Integer dealerId);
    //Update
    public Dealer updateDealer(Dealer dealer);
    //Delete
    public String deleteDealer(Integer dealerId);

}
