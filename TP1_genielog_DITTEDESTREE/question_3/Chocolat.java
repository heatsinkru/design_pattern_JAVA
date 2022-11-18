package tp_genie_log.question_3;

public class Chocolat extends Ingredient {
	private Boisson boisson;
	
    public Chocolat(Boisson boisson){ super(boisson); this.boisson = boisson;  }
    
    public String getDescription(){ return this.boisson.getDescription() + " avec du chocolat"; }

    public double cout(){ return this.boisson.cout() + 2.5; }
}
