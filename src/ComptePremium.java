package EvalG06;

public class ComptePremium extends CompteStandard{

  public ComptePremium(String numero, String titulaire){
    super(numero,titulaire);
  }
  @override
  public long frais(long montant){
    if (montant <= SEUIL_PREMIUM){
      return 0;
    else{ 
        frais standard / 2;
        }
  }
  @override
  public long plafond(){

  }

}
