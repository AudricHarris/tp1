public class Cryptomonnaie 
{
	private String nom;
	private int valeurDeJeton;

	public Cryptomonnaie(String nom, int valeurDeJeton)
	{
		this.nom = nom;
		this.valeurDeJeton = valeurDeJeton;
	}

	public String getNom()
	{
		return nom;
	}

	public int getValeurDeJeton()
	{
		return valeurDeJeton;
	}

	public String toString()
	{
		return String.format("%5s",nom) + ":" + String.format("%10.1f",valeurDeJeton);
    }
}