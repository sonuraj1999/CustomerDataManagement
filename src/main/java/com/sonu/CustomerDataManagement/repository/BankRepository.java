package com.sonu.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonu.CustomerDataManagement.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer> {

}
