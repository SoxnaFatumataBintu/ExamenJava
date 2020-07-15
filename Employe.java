import java.time.LocalDate;

public class Employe implements IEmploye {

    int id;
    String nomComplet;
    String dateEmbauche; 

    static int  nombreEmploye=0;


    public Employe(String nomComplet, String dateEmbauche) {

        this.id=nombreEmploye;
        nombreEmploye++;
        this.nomComplet=nomComplet;
        this.dateEmbauche=dateEmbauche;


    }

    public int getId(){
        return this.id;

    }
    public void setId(int id){
        this.id=id;
    }

    public String getNomComplet(){
        return this.nomComplet;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet=nomComplet;
    }

    public String getDateEmbauche(){
        return this.dateEmbauche;

    }


    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche=dateEmbauche;
    }


    @Override
    public String affiche() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int compare() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int anciennete(){

        return 0;
    }




    
}