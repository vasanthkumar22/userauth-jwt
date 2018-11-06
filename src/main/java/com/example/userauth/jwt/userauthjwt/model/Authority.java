package com.example.userauth.jwt.userauthjwt.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Authority {

    @Id
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;
}
