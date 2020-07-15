import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choix;
        int nbreServiceEmploye=0;
        Employe serviceEmploye[]=new Employe[10];
        Scanner clavier=new Scanner(System.in);
        Services Ser=new Services();

        do {

            System.out.println("----MENU----");
        System.out.println("----1 Ajouter service----");
        System.out.println("----2 Lister service----");
        System.out.println("----3 Affecter employe dans un service----");
        System.out.println("----4 Lister les employes d'un service----");
        System.out.println("----5 Afficher les Employés qui doivent partir en retraite cette année ----");
        System.out.println("----6 Quitter----");
        System.out.println("faites votre choix");
        choix=clavier.nextLine();

        switch (choix) {
            case "1":
            System.out.println("Saisissez le libelle du service");
            String libelle=clavier.nextLine();
            Service service=new Service(libelle);
            Ser.ajouterService(service);


                
                break;

                case "2":

                Ser.listerService();

                
                break;


                case "3":
                System.out.println("Saisissez le nom complet de l'employé");
                String nomComplet=clavier.nextLine();
                System.out.println("Saisissez la date d'embauche :");
                String dateEmbauche=clavier.nextLine();
                Employe employe=new Employe(nomComplet,dateEmbauche);
                Ser.ajouterEmploye(employe);
                Ser.listerService();
                System.out.println("Choisissez le service que vous voulez affecté l'employé :");
                int idService=clavier.nextInt();
                serviceEmploye[nbreServiceEmploye]=employe;
                nbreServiceEmploye++;



                
                break;

                case "4":
                Ser.listerEmployeService();
                
                break;

                case "5":
                
                break;
        
            default:
                break;


        }


            
        } while (choix != "6" );
        
        



    }
    
}