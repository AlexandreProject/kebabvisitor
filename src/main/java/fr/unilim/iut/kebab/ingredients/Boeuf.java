package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.visitor.VisiteurdeRegime;

public class Boeuf extends Ingredient {
	
	public Boeuf(String nom, Kebab kebab){
		super(nom,kebab);
	}
	
    @Override
    public boolean isVegetarien() {
        return false;
    }
    @Override
    public boolean isPescetarien() {
        return false;
    }
    public void accept(VisiteurdeRegime v){
    	v.visit(this);
    }
}