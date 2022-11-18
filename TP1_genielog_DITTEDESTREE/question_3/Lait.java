package tp_genie_log.question_3;

public class Lait extends Ingredient {
	private Boisson boisson;
	
    public Lait(Boisson boisson){ super(boisson); this.boisson = boisson; }
    
    public String getDescription() { return this.boisson.getDescription() + " avec du lait"; }

    public double cout() { return this.boisson.cout() + 2; }
}
