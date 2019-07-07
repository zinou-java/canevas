package dz.gouv.mesrs.services.impl;


import dz.gouv.mesrs.dao.ComposantDao;
import dz.gouv.mesrs.dao.CommonDao;
import dz.gouv.mesrs.dao.SearchMode;
import dz.gouv.mesrs.model.Composant;
import dz.gouv.mesrs.model.Equipement;
import dz.gouv.mesrs.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("composantService")

public class ComposantServiceImpl extends CommonServiceImpl<Composant, Integer>
        implements ComposantService   {

    @Autowired
    ComposantDao composantDao;

    @Override
    protected CommonDao<Composant, Integer> getDao ()  { return composantDao; }

    @Override
    public List<Composant> findByEquipement(Integer equipement) {

            Composant c = new Composant();
            SearchMode searchMode = new SearchMode();
            searchMode.addFilter(new SearchMode.Filter("idOutil.id",equipement, SearchMode.FilterMode.EQUALS));

            return composantDao.findAllByExample(c,searchMode);

    }
}
