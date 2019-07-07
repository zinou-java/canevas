package dz.gouv.mesrs.ManagedBean;


import dz.gouv.mesrs.model.*;
import dz.gouv.mesrs.services.ListeRgService;
import lombok.Data;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.List;


@Data
@Named("equipementBean")
@Scope("session")
@ViewScoped

public class EquipementBean extends BaseBean {


    List<Equipement> equipements;
    List<Projet> projets;
    List<Composant> composants;
    List<Liste> listes;
    List<ListeRg> listeRgs;
    List<EquipementComposant> equipementComposants;
    List<EquipementProjet> equipementProjets;
    List<DetailEquipementProjet> detailEquipementProjets;

    private Boolean shownew;
    private Boolean showhide;


    private Projet projet;
    private Equipement equipement;
    private Composant composant;
    private EquipementComposant equipementComposant;
    private Liste liste;
    private ListeRg listeRg;
    private Integer idComposant;
    private Integer idEquipement;
    private Integer idEquipementComposant;
    private EquipementProjet equipementProjet;
    private DetailEquipementProjet detailEquipementProjet;

    private Integer idProjet;
    private Integer idEquipementProjet;
    private Integer etablissementListe;
    private Integer regionListeRg;



    @PostConstruct
    public void init() {
        equipement = new Equipement();
        composant = new Composant();
        equipementComposant = new EquipementComposant();
        projet = new Projet();
        liste = new Liste();
        listeRg = new ListeRg();
        equipementProjet = new EquipementProjet();
        detailEquipementProjet = new DetailEquipementProjet();

        shownew = false;
        showhide = true;
    }


    @PostConstruct
    public void getAll() {
        equipements = equipementService.findAll();
        composants = composantService.findByEquipement(idEquipement);
        projets = projetService.findAll();
        listes = listeService.findAll();
        listeRgs = listeRgService.findAll();
        equipementProjets = equipementProjetService.findAll();
        equipementComposants = equipementComposantService.findAll();
    }




    public void addEquipementProjet(){

        Equipement e = getEquipementService().findById(idEquipement);
        equipementProjet.setIdequipement(e);
        equipementProjetService.save(equipementProjet);
        FacesContext.getCurrentInstance().addMessage
                (null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "l'equipempent est enregistré", null));
        }




    public void addEquipement(Composant comp){

        Equipement e = getEquipementService().findById(idEquipement);
        equipementComposant.setIdOutil(e);
       //Composant c = getComposantService().findById(idComposant);
        equipementComposant.setIdComposant(comp);
        equipementComposantService.save(equipementComposant);
        detailEquipementProjet.setIdEquipementComposant(equipementComposant);
        detailEquipementProjet.setIdEquipementProjet(equipementProjet);
        detailEquipementProjetService.save(detailEquipementProjet);
        detailEquipementProjet = new DetailEquipementProjet();
        equipementComposant = new EquipementComposant();

        }



    public void addList(){

        composants = composantService.findByEquipement(idEquipement);

    }



    public void addProjet () {

        Liste l = getListeService().findById(etablissementListe);
        ListeRg r = getListeRgService().findById(regionListeRg);
        projet.setEtablissement(l);
        projet.setConfregionale(r);
        projetService.save(projet);
        equipementProjet.setIdprojet(projet);
        equipementProjetService.save(equipementProjet);
        projet = new Projet();
        FacesContext.getCurrentInstance().addMessage
                (null, new FacesMessage(FacesMessage.SEVERITY_INFO, "le projet est enregistré", null));
    }



    public void removeProjet(Projet pro) {
        projetService.remove(pro);
        projets = projetService.findAll();
        FacesContext.getCurrentInstance().addMessage
                (null, new FacesMessage(FacesMessage.SEVERITY_INFO, "l'equipempent est supprimÃ©", null));
    }




    public void remove(EquipementComposant eqp) {
        equipementComposantService.remove(eqp);
        equipementComposants = equipementComposantService.findAll();
        FacesContext.getCurrentInstance().addMessage
                (null, new FacesMessage(FacesMessage.SEVERITY_INFO, "l'equipempent est supprimÃ©", null));
    }



    public  void show(){
        shownew = true;
    }

}
