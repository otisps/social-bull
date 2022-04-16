package com.otisps.socialbull.appuser;

import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService {

    private final ApplicationUserRepository applicationUserRepository;

    public ApplicationUserService(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    public ApplicationUser createNewApplicationUser(ApplicationUser applicationUser){
        return this.applicationUserRepository.save(applicationUser);
    }
}
