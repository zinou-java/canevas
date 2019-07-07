package dz.gouv.mesrs.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "equipement_projet")



public class EquipementProjet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_equipement")
    private Equipement idequipement;

    @Column (name = "qte")
    private Integer quant;

    @ManyToOne
    @JoinColumn (name = "id_projet")
    private Projet idprojet;

}
