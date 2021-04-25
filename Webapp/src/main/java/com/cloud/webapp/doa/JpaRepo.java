package com.cloud.webapp.doa;

import com.cloud.webapp.model.employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepo extends JpaRepository<employees, Integer> {
}
