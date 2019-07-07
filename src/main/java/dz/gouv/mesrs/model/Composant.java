package dz.gouv.mesrs.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "composant")

public class Composant extends BaseEntity {


    @Column (name = "nom")
    private String nomComposant;

    @ManyToOne
    @JoinColumn (name = "id_outils")
    private Equipement idOutil;
}
