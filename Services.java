public class Services {

    final int  TAILLE=10;

    Service [] tabService;
    Employe [] tabEmploye;

    private int nbreService=0;
    private int nbreEmp=0;

    public Services(){
        tabService=new Service[TAILLE];
        tabEmploye=new Employe[TAILLE];


    }

    public  void ajouterService(final Service ser) {
        tabService[nbreService] = ser;
        nbreService++;
    }

    public void listerService() {
        for (final Service s : tabService) {
            if (s != null) {
                System.out.println("id :" + s.getId() + "libelle:" + s.getLibelle());
            }

        }

    }

    public void ajouterEmploye(final Employe em) {
        tabEmploye[nbreEmp] = em;
        nbreEmp++;
    }

    public void listerEmployeService() {
        for (final Employe e : tabEmploye) {
            if (e != null) {
                if (employeIsExist(e)) {
                    System.out.println("id :" + e.getId() + "nomComplet:" + e.getNomComplet() + "date d'embauche:"
                            + e.getDateEmbauche());
                }

            }

        }

    }

    public boolean employeIsExist(final Employe em) {
        boolean isExist = false;
        for (final Employe e : tabEmploye) {
            if (e.getId()==em.getId()) {
                isExist=true;
            }

           
             
         }

         return isExist;

    }

    

    }