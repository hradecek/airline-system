package com.hradecek.airline.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Ivo Hradek <ivohradek@gmail.com>
 */
@Embeddable
public class FlightPK implements Serializable {
    private Integer number;
    private String prefix;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
