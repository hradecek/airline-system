package com.hradecek.airline.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * Flight entity represents single flight at storage.
 * </p>
 *
 * @author Ivo Hradek <ivohradek@gmail.com>
 */
@Entity
public class Flight {

    @EmbeddedId
    private FlightPK id;

    @NotNull
    @NotBlank
    @Column(nullable = false)
    private String destination;

    @NotNull
    @NotBlank
    @Column(nullable = false)
    private String origin;
}
