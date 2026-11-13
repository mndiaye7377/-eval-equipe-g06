package EvalG06;

public class CompteMarchant Compte{
  private String enseigne;

  public CompteMarchant(String numero,String titulaire ,String enseigne){
    super(numero,titulaire);
    this.enseigne=enseigne;
  }
  public String getEnseigne(){
    return enseigne;
  }

  @override 
  public long frais(long montant){
    montant * TAUX_FRAIS / 2000;
  }

  @override
  public long plafond(){
    return 5*super.plafond();
  }

  @override
  public String type(){
    return "MAR";
  }

  @override
  public String toString(){
    super.toString()+" ("+enseigne+")";
  }

}
