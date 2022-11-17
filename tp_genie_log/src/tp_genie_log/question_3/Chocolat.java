package tp_genie_log.question_3;

public class Chocolat extends Ingredient {
	private Boisson boisson;
	
    public Chocolat(Boisson boisson){ super(boisson); }
    
    public String getDescription(){ return this.getBoisson().getDescription() + " avec du chocolat"; }

    public double cout(){ return this.getBoisson().cout() + 2.5; }
}
