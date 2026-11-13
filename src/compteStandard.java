package EvalG06;

public class compteStandard extends Compte{

  @override
  public long frais(long montant){
    montant × TAUX_FRAIS / 1000;
  }

  @override
  public String type(){
    return "STD";
  }

}
