package com.tech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.daoi.DaoI;
import com.tech.model.Account;
import com.tech.servicei.ServiceI;


@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	DaoI di;
	@Override
	public int saveData(Account ac) {
		
		return di.savedata(ac);
	}
	@Override
	public List<Account> loginCheck(String us, String pass) {
		
		return di.loginCheck(us, pass);
	}

}
