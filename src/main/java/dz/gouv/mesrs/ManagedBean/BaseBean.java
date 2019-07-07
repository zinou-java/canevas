package dz.gouv.mesrs.ManagedBean;



import dz.gouv.mesrs.model.ListeRg;
import dz.gouv.mesrs.services.*;
import dz.gouv.mesrs.services.nc.NomenclatureService;
import dz.gouv.mesrs.services.ppm.RefEtablissementService;
import dz.gouv.mesrs.services.ppm.RefTypePieceConstitutiveService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Setter
@Getter
public abstract class BaseBean {

    public int step;

    @Autowired
    EquipementService equipementService;

    @Autowired
    ComposantService composantService;

    @Autowired
    ProjetService projetService;

    @Autowired
    ListeService listeService;

    @Autowired
    ListeRgService listeRgService;

    @Autowired
    RefEtablissementService refEtablissementService;

    @Autowired
    NomenclatureService nomenclatureService;

    @Autowired
    EquipementComposantService equipementComposantService;

    @Autowired
    EquipementProjetService equipementProjetService;

    @Autowired
    DetailEquipementProjetService detailEquipementProjetService;


    @Autowired
    RefTypePieceConstitutiveService refTypePieceConstitutiveService;

    public abstract void init();

}

