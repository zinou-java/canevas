package dz.gouv.mesrs.dao.impl;

import dz.gouv.mesrs.dao.EquipementProjetDao;
import dz.gouv.mesrs.model.EquipementProjet;
import org.springframework.stereotype.Repository;


@Repository("equipementProjetDaoImpl")
public class EquipementProjetDaoimpl extends CommonDaoImpl <EquipementProjet, Integer> implements
        EquipementProjetDao {

    @Override
    protected Class <EquipementProjet> getDomainClass () {return  EquipementProjet.class;}



}
