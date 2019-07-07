package dz.gouv.mesrs.dao.impl;


import dz.gouv.mesrs.dao.ComposantDao;
import dz.gouv.mesrs.model.Composant;
import org.springframework.stereotype.Repository;


@Repository("composantDaoImpl")

public class ComposantDaoImpl extends CommonDaoImpl<Composant, Integer> implements
        ComposantDao {

    @Override
    protected Class<Composant> getDomainClass () { return Composant.class; }


}




