package webappgradle.service;

import webappgradle.dao.DealerDAO;
import webappgradle.dao.DealerDaoImpl;
import webappgradleentities.Dealer;

public class DealerSerImpl implements DealerService {
	DealerDAO ddao=new DealerDaoImpl();
	@Override
	public Dealer createDealer(Dealer dealer) {
		// TODO Auto-generated method stub
		return ddao.createDealer(dealer);
	}

	@Override
	public Dealer retrieveDealerById(Integer dealerId) {
		// TODO Auto-generated method stub
		return ddao.retrieveDealerById(dealerId);
	}

	@Override
	public Dealer updateDealer(Dealer dealer) {
		// TODO Auto-generated method stub
		return ddao.updateDealer(dealer);
	}

	@Override
	public String deleteDealer(Integer dealerId) {
		// TODO Auto-generated method stub
		return ddao.deleteDealer(dealerId);
	}

}
