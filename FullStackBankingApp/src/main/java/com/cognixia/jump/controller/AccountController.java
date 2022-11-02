package com.cognixia.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Accounts;
import com.cognixia.jump.repository.AccountsRepository;

@RestController
@RequestMapping("/api")
public class AccountController {

	@Autowired
	AccountsRepository accRepo;
	
	@GetMapping("/account/all")
	public List<Accounts> getAllAccounts(){
		return accRepo.findAll();
	}
	
	@GetMapping("/account")
	public List<Accounts> getAllAccountsByCustomerID(@RequestParam Integer CustomerID){
		return accRepo.findAccountsByID(CustomerID);
	}
	
	@GetMapping("/account/one")
	public Accounts getOneAccount(@RequestParam Integer AccountID) {
		return accRepo.getById(AccountID);
	}
	
	@PostMapping("/account/create")
	public String createAccount(@RequestBody Accounts account) {
		String result = "";
		if(account.getCustomer_id() != null) {
			Integer cid = account.getAccount_id();
			String acc_name = account.getAccount_name();
			String acc_type = account.getAccount_type();
			Double acc_bal = account.getBalance();
			Accounts newOne = new Accounts(acc_name, acc_type, acc_bal, cid);
			accRepo.save(newOne);
			result = "Account created. ID Number is : "+ newOne.getAccount_id();
		}else {
			result = "Account not created";
		}
		return result;
	}
	
	@PutMapping("/account/update")
	public String updateAccount(@RequestBody Accounts acc) {
		String result = "";
		Accounts curr = accRepo.getById(acc.getAccount_id());
		curr.setAccount_name(acc.getAccount_name());
		curr.setAccount_type(acc.getAccount_type());
		curr.setBalance(acc.getBalance());
		curr.setCustomer_id(acc.getCustomer_id());
		accRepo.save(curr);
		result = "Account "+acc.getAccount_name()+" is updated."; 
		return result;
	}
	
	@DeleteMapping("/account/delete")
	public String deleteAccount(@RequestParam Integer AccountID) {
		String result = "";
		Accounts acc = accRepo.getById(AccountID);
		if(acc.getAccount_name() != null) {
			String name = acc.getAccount_name();
			Integer id = acc.getAccount_id();
			accRepo.delete(acc);
			result = "Account "+name+" has been deleted.";
		}else {
			result = "Account is not deleted.";
		}
		return result;
		}
}
