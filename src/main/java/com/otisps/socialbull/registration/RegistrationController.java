package com.otisps.socialbull.registration;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping(path="/api/v1/register")
public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public RedirectView register(@ModelAttribute RegistrationRequest registrationRequest){
        registrationService.register(registrationRequest);
        return new RedirectView("/login");
    }
}
