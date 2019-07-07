package dz.gouv.mesrs.dao.impl;


import dz.gouv.mesrs.dao.ListeRgDao;
import dz.gouv.mesrs.model.ListeRg;
import org.springframework.stereotype.Repository;

@Repository ("ListeRgDaoImpl")

public class ListeRgDaolmpl extends CommonDaoImpl <ListeRg, Integer>
        implements ListeRgDao {

    @Override
    protected Class <ListeRg> getDomainClass () {return  ListeRg.class;}
}
