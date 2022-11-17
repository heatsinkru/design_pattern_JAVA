package tp_genie_log.question_3;

public class Caramel extends Ingredient {
	private Boisson boisson;
	
    public Caramel(Boisson boisson){ super(boisson); }
    
    public String getDescription() { return this.getBoisson().getDescription() + " avec du caramel"; }

    public double cout() { return this.getBoisson().cout() + 3.5; }
}
