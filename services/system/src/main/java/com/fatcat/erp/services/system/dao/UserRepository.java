package com.fatcat.erp.services.system.dao;

import com.fatcat.erp.services.system.enties.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
}
