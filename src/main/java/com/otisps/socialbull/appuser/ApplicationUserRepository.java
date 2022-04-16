package com.otisps.socialbull.appuser;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {

    List<ApplicationUser> findApplicationUserByUsername(String username);

}
