package com.bitscoder.Authentication_System.repository;

import com.bitscoder.Authentication_System.model.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepository extends JpaRepository<Otp, Long> {

    Otp findByEmail(String email);

    Otp findAllByEmail(String email);
}
