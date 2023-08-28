package com.tech.daoi;

import java.util.List;

import com.tech.model.Account;

public interface DaoI {

public	int savedata(Account ac);

public List<Account> loginCheck(String us,String pass);
	
}
