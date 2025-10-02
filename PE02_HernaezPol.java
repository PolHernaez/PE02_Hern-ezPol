import java.util.Scanner;
class jocfutbol {
    public static void main(String[] args) {
    Scanner primer = new Scanner (System.in);
    String protestar;
    String passarPilota, passarPilota2;
    String falta, falta2;
    int golLocal;
    int golRival;
    String guanyatPerdut;
    String porter, xutar;
    boolean groga;
    golRival = 1;
    golLocal = 1;
    System.out.println("Estàs jugant un partit de futbol vas empat 1-1, queden 6 minuts i et fan una falta amb una entrada forta i l'àrbitre no pita falta, vols portestar? (si/no)");
    protestar = primer.nextLine();
   if (protestar.equals("si")) {
    System.out.println("Protestes la jugada. L'àrbitre para el partit i et mostra targeta groga.");
    groga = true;
    System.out.println("Els rivals treuen ràpid i a la següent jugada marquen gol.");
    System.out.println("El partit segueix i ara aneu perdent 1-2.");
    golRival = (golRival + 1);
    System.out.println("Tens un contraatac");
    System.out.println("A que vols fer amb la pilota?");
    System.out.println("A) Passar-la al jugador de la dreta");
    System.out.println("B) Passar-la al jugador de l'esquerra");
    System.out.println("C) Xutar des de fora l'àrea");
    System.out.println("(a/b/c)");
    passarPilota = primer.nextLine();

    if (passarPilota.equals ("a")){
        System.out.println("Pases la pilota al jugador de la dreta.");
        System.out.println("El teu company corre, xuta i fa gol!");
        golLocal = (golLocal + 1);
    }
    else if (passarPilota.equals("b")) {
            System.out.println("Pases la pilota al jugador de l'esquerra.");
            System.out.println("El teu company controla, centra a l'àrea...");
            System.out.println("La pilota impacte en un rival i... GOOOOL en pròpia porta del rival!");
            golLocal = (golLocal + 1);
    }
    else if (passarPilota.equals("c")) {
            System.out.println("Decideixes xutar des de fora l'àrea.");
            System.out.println("Rellisques i la pilota se'n va per damunt de la porteria.");
    }
    else {
        System.out.println("Resposta no vàlida");
        System.exit(0);
    }

    System.out.println("Queda un minut de partit.");
        System.out.println("Els rivals fan una bona jugada i el jugador que està al teu davant té la pilota.");
        System.out.println("Què fas?");
        System.out.println("A) Fer falta");
        System.out.println("B) No fer falta");
        System.out.print("(a/b): ");
        falta = primer.nextLine();
        if (falta.equals("a")) {
            System.out.println("Fas falta al rival i l'arbitre et mostra targeta groga");
            if (groga) {
                System.out.println("Et treuen la segona groga i t'expulsen!");
                            
            } 
            else {
                System.out.println("Com que es la primera targeta no passa res");
            }
        } else if (falta.equals("b")) {
            System.out.println("Decideixes no fer falta.");
            System.out.println("El davanter rival xuta i la pilota impacta al pal!");
            System.out.println("El lateral del teu equip allunya la pilota.");
            System.out.println("Quan entres a l'àrea rival et fan penal!");
            System.out.println("Com xutes el penal?");
            System.out.println("A) Xutar al mig");
            System.out.println("B) Xutar a la dreta");
            System.out.println("C) Xutar a l'esquerra");
            System.out.print("(a/b/c): ");
            String penal = primer.nextLine();
            if (penal.equals("a")) {
                System.out.println("Xutes al mig i el porter no es mou. GOOOL!");
                golLocal = (golLocal + 1);
            } else if (penal.equals("b")) {
                System.out.println("Xutes a la dreta i el porter l'atura.");
            } else if (penal.equals("c")) {
                System.out.println("Xutes a l'esquerra i marques un gran gol!");
                golLocal = (golLocal + 1);
            } else {
                System.out.println("Opció no vàlida.");
            }
        } else {
            System.out.println("Resposta no vàlida");
            System.exit(0);
        }
       
}
else if (protestar.equals("no")) {
System.out.println("Decideixes callar i el partit segueix.");
System.out.println("Com que no has fet falta, el teu defensa es veu obligat a provocar un penal.");
System.out.println("Abans que es xuti, veus que el llançador jugava al teu equip l'any passat i creus saber on xutarà.");
System.out.println("Què li dius al porter?");
System.out.println("A) Que es tiri a la dreta");
System.out.println("B) Que es quedi al mig");
System.out.println("C) Que es tiri a l'esquerra");
System.out.print("(a/b/c): ");
porter = primer.nextLine();
if (porter.equals ("a")) {
    System.out.println("Li dius al porter que es llenci a la dreta.");
    System.out.println("El xutador xuta al mig i marca gol pels rivals!");
    golRival = (golRival + 1);
}
else if (porter.equals ("b")) {
    System.out.println("Li dius al porter que es quedi al mig.");
    System.out.println("El xutador xuta al mig i el porter atura la pilota!");
}
else if (porter.equals ("c")) {
    System.out.println("Li dius al porter que es llenci a l'esquerra.");
    System.out.println("El xutador xuta al mig i marca gol pels rivals!");
    golRival = (golRival + 1);
}
System.out.println("El partit segueix i queda un minut.");
System.out.println("Els rivals fan una bona jugada i el jugador que està al teu davant té la pilota.");
System.out.println("Què fas?");
System.out.println("A) Fer falta");
System.out.println("B) No fer falta");
System.out.print("(a/b): ");
falta2 = primer.nextLine();
if (falta2.equals("a")){
    System.out.println("Fas falta i et mostren targeta groga, però com que és la primera no t'expulsen.");
    groga = true;
    System.out.println("Els rivals treuen ràpid, però s'equivoquen i robes la pilota.");
    System.out.println("Et quedes sol contra el porter que s'avança cap a tu.");
    System.out.println("Com xutes?");
    System.out.println("A) Intentar picar la pilota per sobre del porter");
    System.out.println("B) Xutar rasa al primer pal");
    System.out.println("C) Xutar entre les cames del porter");
    System.out.print("(a/b/c): ");
    xutar = primer.nextLine();
    if (xutar.equals("a")){
        System.out.println("Intentes picar la pilota per sobre del porter.");
        System.out.println("El porter no s'ho espera i marques gol!");
        golLocal = (golLocal + 1);
        System.out.println("El partit s'acaba.");
    }
    else if (xutar.equals("b")){
        System.out.println("Xutes rasa al primer pal.");
        System.out.println("El porter fa una estirada increïble i atura la pilota.");
        System.out.println("El partit s'acaba.");
    }
    else if (xutar.equals("c")) {
        System.out.println("Xutes entre les cames del porter.");
        System.out.println("El sorprens i la pilota li passa per sota... GOL!");
        golLocal = (golLocal + 1);
        System.out.println("El partit s'acaba.");
    }
    else {
            System.out.println("Resposta no vàlida");
            System.exit(0);
    }
    }
    else if (falta2.equals("b")){
        System.out.println("Decideixes no fer falta.");
        System.out.println("El rival et dribla i fa un golàs des de fora l'àrea!");
        System.out.println("Traieu ràpid mentre els rivals encara celebren.");
        System.out.println("Tens la pilota i només hi ha un defensa rival.");
        System.out.println("Què fas?");
        System.out.println("A) Passar-la al jugador de la dreta");
        System.out.println("B) Passar-la al jugador de l'esquerra");
        System.out.println("C) Xutar des de fora l'àrea");
        System.out.print("(a/b/c): ");
        passarPilota2 = primer.nextLine();
        if (passarPilota2.equals("a")){
            System.out.println("Pases al jugador de la dreta.");
            System.out.println("El teu company corre, però el defensor encara més i li pren la pilota.");
            System.out.println("El partit s'acaba.");
        }
        else if (passarPilota2.equals("b")){
            System.out.println("Pases al jugador de l'esquerra.");
            System.out.println("El teu company et torna la pilota i al primer toc marques un golàs!");
            golLocal = (golLocal + 1);
            System.out.println("El partit s'acaba.");
        }
        else if (passarPilota2.equals("c")) {
            System.out.println("Decideixes xutar des de fora l'àrea.");
            System.out.println("La pilota impacta al travesser, rebota a l'esquena del porter i entra!");
            golLocal = (golLocal + 1);
            System.out.println("GOOOL! El partit s'acaba.");
        }
        else {
            System.out.println("Resposta no vàlida");
            System.exit(0);
        }
    }

} else {
    System.out.println("Resposta no vàlida");
    System.exit(0);
}
if (golLocal<golRival){
            guanyatPerdut = "perdut";
        }
        else if (golLocal>golRival){
            guanyatPerdut = "guanyat";
        }
        else {
            guanyatPerdut = "empatat";
        }
        System.out.println("Acava el partit, has " + guanyatPerdut + ": " + golLocal + "-" + golRival);

    }
}
