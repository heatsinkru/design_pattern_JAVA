package tp_genie_log.question_3;

public class Chantilly extends Ingredient {
	private Boisson boisson;
	
    public Chantilly(Boisson boisson){ super(boisson); }
    
    public String getDescription() { return this.getBoisson().getDescription() + " avec de la chantilly"; }

    public double cout() { return this.getBoisson().cout() + 1.5; }
}
