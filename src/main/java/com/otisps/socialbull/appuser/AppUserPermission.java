package com.otisps.socialbull.appuser;

public enum AppUserPermission {
    POST_READ("post:read"),
    POST_WRITE("post:write");

    private final String permission;

    AppUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }



}
