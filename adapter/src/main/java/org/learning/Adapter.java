package org.learning;

public class Adapter implements NewInterface {
    private OldService oldService;

    public Adapter(OldService oldService) {
        this.oldService = oldService;
    }

    public String newRequest() {
        return oldService.oldRequest();
    }
}