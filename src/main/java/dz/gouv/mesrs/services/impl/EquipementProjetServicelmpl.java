package dz.gouv.mesrs.services.impl;



import dz.gouv.mesrs.dao.CommonDao;
import dz.gouv.mesrs.dao.EquipementProjetDao;
import dz.gouv.mesrs.model.EquipementProjet;
import dz.gouv.mesrs.services.EquipementProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("equipementProjetService")
public class EquipementProjetServicelmpl extends CommonServiceImpl <EquipementProjet, Integer>
        implements EquipementProjetService{

    @Autowired
    EquipementProjetDao equipementProjetDao;

    @Override
    protected CommonDao<EquipementProjet,Integer> getDao() { return equipementProjetDao; }


}
