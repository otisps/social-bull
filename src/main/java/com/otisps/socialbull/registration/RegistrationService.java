package com.otisps.socialbull.registration;

import com.otisps.socialbull.appuser.ApplicationUser;
import com.otisps.socialbull.appuser.ApplicationUserService;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final ApplicationUserService appUserService;

    public RegistrationService(ApplicationUserService appUserService) {
        this.appUserService = appUserService;
    }

    public String register(RegistrationRequest registrationRequest) {
        ApplicationUser unaddedUser = new ApplicationUser(
                registrationRequest.getEmail(),
                registrationRequest.getUsername(),
                registrationRequest.getGivenName(),
                registrationRequest.getFamilyName(),
                registrationRequest.getPassword());

        return this.appUserService.createNewApplicationUser(unaddedUser).toString();
    }
}

