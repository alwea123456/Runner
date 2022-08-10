package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Authorities", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Username", "Roleid"})
})
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @ManyToOne
    @JoinColumn(name = "Username")
    private Account account;
    @ManyToOne  @JoinColumn(name = "Roleid")
    private Role role;
}
