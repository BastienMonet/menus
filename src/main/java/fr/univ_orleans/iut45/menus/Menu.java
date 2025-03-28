package fr.univ_orleans.iut45.menus;

import java.util.ArrayList;
import java.util.List;

class Menu {
    protected List<Plat> entrees;
    protected List<Plat> plats_principaux;
    protected List<Plat> desserts;

    public Menu(List<Plat> entrees,
                List<Plat> plats_principaux,
                List<Plat> desserts) {
        this.entrees = entrees;
        this.plats_principaux = plats_principaux;
        this.desserts = desserts;
    }

    public List<Plat> getEntrees() {
        return this.entrees;
    }

    public List<Plat> getPlatsPrincipaux() {
        return this.plats_principaux;
    }

    public List<Plat> getDesserts() {
        return this.desserts;
    }

    public boolean estComplet(){
        if(entrees.size() == 0 || plats_principaux.size() == 0 || desserts.size() == 0){
            return false;
        }
        else
            return true;
    }

    public boolean contientAllergene(String nomAllergene){
        for(Plat p : entrees){
            if(p.aAllergenes() && p.getAllergenes().contains(nomAllergene))
                return true;
        }

        for(Plat p : plats_principaux){
            if(p.aAllergenes() && p.getAllergenes().contains(nomAllergene))
                return true;
        }

        for(Plat p : desserts){
            if(p.aAllergenes() && p.getAllergenes().contains(nomAllergene))
                return true;
        }
        return false;
    }



    public List<String> listeAllergene(){
        List<String> list = new ArrayList<>();
        
        for(Plat p : entrees){
            if (p.aAllergenes())
                list.addAll(p.getAllergenes());
        }

        for(Plat p : plats_principaux){
            if (p.aAllergenes())
                list.addAll(p.getAllergenes());
        }

        for(Plat p : desserts){
            if (p.aAllergenes())
                list.addAll(p.getAllergenes());
        }
        return list;
    }
}
