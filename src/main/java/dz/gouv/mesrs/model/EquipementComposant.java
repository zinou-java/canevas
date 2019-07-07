package dz.gouv.mesrs.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "equipement_composant")


public class EquipementComposant extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "id_equipement")
    private Equipement idOutil;

    @ManyToOne
    @JoinColumn(name = "id_composant")
    private Composant idComposant;


}
