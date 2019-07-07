package dz.gouv.mesrs.dao.impl;

import dz.gouv.mesrs.dao.EquipementComposantDao;
import dz.gouv.mesrs.model.EquipementComposant;
import org.springframework.stereotype.Repository;


@Repository("equipementComposantDaoImpl")
public class EquipementComposantDaoImpl extends CommonDaoImpl<EquipementComposant, Integer> implements
        EquipementComposantDao{

    @Override
    protected Class<EquipementComposant> getDomainClass () { return EquipementComposant.class; }
}
