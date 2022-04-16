package com.otisps.socialbull.registration;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/register")
public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public String register(@ModelAttribute RegistrationRequest registrationRequest){
        return registrationService.register(registrationRequest);
    }
}
