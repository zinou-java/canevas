package dz.gouv.mesrs.services.impl;

import dz.gouv.mesrs.dao.CommonDao;
import dz.gouv.mesrs.dao.EquipementComposantDao;
import dz.gouv.mesrs.model.EquipementComposant;
import dz.gouv.mesrs.services.EquipementComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service ("equipementComposantService")

public class EquipementComposantServiceImpl extends CommonServiceImpl<EquipementComposant, Integer>
        implements EquipementComposantService {

    @Autowired
    EquipementComposantDao equipementComposantDao;

    @Override
    protected CommonDao<EquipementComposant,Integer> getDao() { return equipementComposantDao; }

}
