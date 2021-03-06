package org.springframework.flex.hibernate3.domain;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedFloorAttributes {

    private Integer emergencyExits;

    public void setEmergencyExits(Integer emergencyExits) {
        this.emergencyExits = emergencyExits;
    }

    public Integer getEmergencyExits() {
        return emergencyExits;
    }
}
