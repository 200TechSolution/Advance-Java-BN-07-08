package com.tech.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.daoi.DaoI;
import com.tech.model.Account;

@Repository
public class DaoImpl implements DaoI {

	@Autowired
	SessionFactory sf;

	@Override
	public int savedata(Account ac) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		int cid = (int) session.save(ac);
		tx.commit();
		session.close();

		

		return cid;
	}

	@Override
	public List<Account> loginCheck(String us, String pass) {
	     
		Session session=sf.openSession();
		Query q=session.createQuery("from Account");
		List<Account> ac= q.getResultList();
		return ac;
	}

}
