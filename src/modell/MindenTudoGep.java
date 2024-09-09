package modell;

import java.util.Scanner;

public class MindenTudoGep {

    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    Scanner sc = new Scanner(System.in);

    public MindenTudoGep() {
        this(new String[0]);
    }

    public MindenTudoGep(String dal) {
        this(new String[]{dal});
    }

    public MindenTudoGep(String[] dalok) {
        this.ujraIndit();
        this.lottoSzelveny = new int[5];
        this.totoSzelveny = "";
        dallalFeltolt();
        if (!(dalok == null || dalok.length == 0 || dalok[0].isBlank())) {
            dalokFelvesz(dalok);
        }
    }

    public void ujraIndit() {
        generalLottoSzelveny();
        generalTotoSzelveny();
        dallalFeltolt();
    }

    public void generalLottoSzelveny() {
        int[] lottoSzelveny = new int[5];
        for (int i = 0; i < 5; i++) {
            int rSzam = (int) (Math.random() * 91 + 1);
            lottoSzelveny[i] = rSzam;
        }

        this.lottoSzelveny = lottoSzelveny;
    }

    public String kerLottoSzelvenyt() {
        String szoveg = "";
        szoveg = sc.nextLine();
        return szoveg;
    }

    public String generalTotoSzelveny() {
        String szoveg = "";
        for (int i = 0; i < 15; i++) {
            int rSzam = (int) (Math.random() * 4 + 1);
            if (rSzam == 1 && !(i == 15) && !(i == 0)) {
                szoveg += "1,";
            }   
            if (rSzam == 2 && !(i == 15) && !(i == 0)) {
                szoveg += "2,";
            }
            if (rSzam == 3 && !(i == 15) && !(i == 0)) {
                szoveg += "x,";
            }
        }
        return szoveg;
    }

    public String kerTotoSzelveny() {
        String szoveg = "";
        szoveg = sc.nextLine();
        return szoveg;
    }

    public String kerDal() {
        String szoveg = "";
        szoveg = sc.nextLine();
        return szoveg;
    }

    public void ujDal(String dal) {
    }

    private void dallalFeltolt() {
        this.dalok = new String[3];
        dalok[0] = "Sabaton:Last Standing";
        dalok[1] = "Marton5:Sugar";
        dalok[2] = "Happy";
    }

    private void dalokFelvesz(String[] dalok) {

    }
}
