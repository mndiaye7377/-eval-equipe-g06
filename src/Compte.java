package EvalG06;

public abstract class Compte {

    private String numero;
    private String titulaire;
    private long solde;

    private static int nombreCrees = 0;

    public Compte(String numero, String titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = 0;
        nombreCrees++;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public long getSolde() {
        return solde;
    }

    public static int getNombreCrees() {
        return nombreCrees;
    }

    public boolean deposer(long montant) {
        if (montant <= 0) {
            return false;
        }
        solde += montant;
        return true;
    }
    public boolean retirer(long montant){
        if (montant <= 0 || montant > plafond() || montant + frais(montant) > solde) {
            return false;
        }
        solde -= montant+frais(montant);
        return true;
    }

    public abstract long frais(long montant);

    public abstract long plafond();

    public abstract String type();

    // À compléter :
    // 1. retirer(long montant)
    // 2. toString()
    // 3. equals(Object obj)
    // 4. hashCode()
}
