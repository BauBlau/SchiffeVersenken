package Spiel;

public class SpielImpl implements SpielInterface {

    private int[][] hitmatrix = new int[10][10];
    private int[][] ownmatrix = new int[10][10];


    public void Spielfeld() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                hitmatrix[i][j] = 0;
                ownmatrix[i][j] = 0;
            }
        }
    }


    @Override
    public void Schiff(int zeile, int spalte, int art, int dir) {
        int länge;

        switch (art) {
            case 5:
                länge = 5;
                break;

            case 4:
                länge = 4;
                break;

            case 3:
                länge = 3;
                break;

            case 2:
                länge = 2;
                break;

        }
        if (dir == 'u') {
            for (int i = (spalte - 1); i < länge; i++) {
                ownmatrix[zeile][i] = 1;
            }

        } else if (dir == 'r') {
            for (int i = (zeile - 1); i < länge; i++) {
                ownmatrix[i][spalte] = 1;
            }
        }
    }


    @Override
    public void lost(boolean Ergebnis) {
         Ergebnis = false;
        int anz = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (ownmatrix[i][j] == 1) {
                    anz++;
                }
            }
        }
        if (anz==30) {
            Ergebnis = true;
        }
    }





}