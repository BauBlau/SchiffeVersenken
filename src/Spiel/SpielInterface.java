package Spiel;

public interface SpielInterface {
    void Spielfeld();
    void Schiff(int zeile, int spalte, int dir, int art);
    void Getroffen(int zeile, int spalte);
    void lost();

}
