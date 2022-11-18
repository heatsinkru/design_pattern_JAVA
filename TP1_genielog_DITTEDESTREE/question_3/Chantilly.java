package tp_genie_log.question_3;

public class Chantilly extends Ingredient {
	private Boisson boisson;
	
    public Chantilly(Boisson boisson){ super(boisson); this.boisson = boisson;  }
    
    public String getDescription() { return this.boisson.getDescription() + " avec de la chantilly"; }

    public double cout() { return this.boisson.cout() + 1.5; }
}
