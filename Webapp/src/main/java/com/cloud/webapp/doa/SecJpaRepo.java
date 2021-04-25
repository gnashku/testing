package com.cloud.webapp.doa;

import com.cloud.webapp.model.users;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SecJpaRepo extends JpaRepository<users ,Integer> {
    users findByUsername (String username);
}
