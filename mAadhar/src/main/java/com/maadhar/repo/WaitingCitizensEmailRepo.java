package com.maadhar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maadhar.pojo.WaitingCitizensEmail;

public interface WaitingCitizensEmailRepo extends JpaRepository<WaitingCitizensEmail, String> {

}