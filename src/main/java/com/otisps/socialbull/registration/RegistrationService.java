package com.otisps.socialbull.registration;

import com.otisps.socialbull.appuser.ApplicationUser;
import com.otisps.socialbull.appuser.ApplicationUserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final ApplicationUserService appUserService;
    private final PasswordEncoder passwordEncoder;

    public RegistrationService(ApplicationUserService appUserService, PasswordEncoder passwordEncoder) {
        this.appUserService = appUserService;
        this.passwordEncoder = passwordEncoder;
    }

    public String register(RegistrationRequest registrationRequest) {
        // TODO : Validate!
        // TODO : Email User!
        ApplicationUser unaddedUser = new ApplicationUser(
                registrationRequest.getEmail(),
                registrationRequest.getUsername(),
                registrationRequest.getGivenName(),
                registrationRequest.getFamilyName(),
                passwordEncoder.encode(registrationRequest.getPassword()),
                "USER");

        return this.appUserService.createNewApplicationUser(unaddedUser).toString();
    }
}

