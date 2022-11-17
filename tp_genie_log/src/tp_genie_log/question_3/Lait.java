package tp_genie_log.question_3;

public class Lait extends Ingredient {
	private Boisson boisson;
	
    public Lait(Boisson boisson){ super(boisson); }
    
    public String getDescription() { return this.getBoisson().getDescription()+" avec du lait"; }

    public double cout() { return this.getBoisson().cout() + 2; }
}
