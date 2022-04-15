package com.otisps.socialbull.appuser;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.Sets;
import static com.otisps.socialbull.appuser.AppUserPermission.POST_READ;
import static com.otisps.socialbull.appuser.AppUserPermission.POST_WRITE;

import java.util.Set;
import java.util.stream.Collectors;

public enum AppUserRole {
    USER(Sets.newHashSet(POST_READ)),
    ADMIN(Sets.newHashSet(POST_READ, POST_WRITE));

    private final Set<AppUserPermission> permissions;

    AppUserRole(Set<AppUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<AppUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());

        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }

    public String getRole(){
        return this.name();
    }

}
