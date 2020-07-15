public class Service implements IEmploye{

    int id;
    String libelle;

    static int  nombreService=0;

    public Service(String libelle){
        this.id=nombreService;
        nombreService++;

        this.libelle=libelle;

    }






    public int getId(){
        return this.id;

    }
    public void setId(int id){
        this.id=id;
    }

    public String getLibelle(){
        return this.libelle;
    }

    public void setLibelle(String libelle){
        this.libelle=libelle;
    }

    public String affiche(){
        return "0";
    }

    public int compare(){
        return 0;
    }
    
}