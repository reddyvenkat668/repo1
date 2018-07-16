package com.cg.wallet.db;
import java.time.LocalDateTime;
import java.util.HashMap;
import com.cg.wallet.bean.Account;

public class WalletDb {
	private static HashMap<String,Account> walletDb=new HashMap<String,Account>();

	public static HashMap<String, Account> getWalletMap() {
			return walletDb;
}

	Account obj=new Account();

static{

	walletDb.put("9949111111",new Account("9949111111","Sunil","sunil@gmail.com",200.0,LocalDateTime.now()));
	walletDb.put("9949222222",new Account("9949222222","Anil","anil@gmail.com",5000.0,LocalDateTime.now()));
	walletDb.put("9949333333",new Account("9949333333","Veeru","veeru@gmail.com",500.0,LocalDateTime.now()));
	walletDb.put("9949444444",new Account("9949444444","Willian","william@gmail.com",600.0,LocalDateTime.now()));
	walletDb.put("9949555555",new Account("9949555555","John","john@gmail.com",100.0,LocalDateTime.now()));
	walletDb.put("9949666666",new Account("9949666666","Tynson","tynson@gmail.com",300.0,LocalDateTime.now()));

	}

}
