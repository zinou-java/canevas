package dz.gouv.mesrs.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table (name = "listerg")

public class ListeRg extends BaseEntity{

    @Column(name = "region")
    private String region;
}
