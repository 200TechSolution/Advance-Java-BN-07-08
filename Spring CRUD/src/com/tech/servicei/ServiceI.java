package com.tech.servicei;

import java.util.List;

import com.tech.model.Account;

public interface ServiceI {
	
    public 	int saveData(Account ac);
    
    public List<Account> loginCheck(String us,String pass);

}
