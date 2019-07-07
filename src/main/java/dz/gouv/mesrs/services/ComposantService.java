package dz.gouv.mesrs.services;

import dz.gouv.mesrs.model.Composant;
import dz.gouv.mesrs.model.Equipement;

import java.util.List;

public interface ComposantService extends CommonService<Composant,Integer> {
    public List<Composant> findByEquipement(Integer equipement);
}
