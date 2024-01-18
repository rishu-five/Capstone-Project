package com.maadhar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maadhar.pojo.AadharCard;

public interface AadharCardRepo extends JpaRepository<AadharCard, Long>{

}