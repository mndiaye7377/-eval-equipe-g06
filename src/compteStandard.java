package EvalG06;

public class CompteStandard extends Compte{

  public CompteStandard(String numero,String titulaire){
    super(numero,titulaire);
  }
  
  @override
  public long frais(long montant){
    montant × TAUX_FRAIS / 1000;
  }

  @override
  public String type(){
    return "STD";
  }

}
