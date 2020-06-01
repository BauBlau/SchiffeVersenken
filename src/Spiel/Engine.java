package Spiel;




public class Engine implements Sender, Empfänger{

    private Status state;


    public Engine(){
        this.state = Status.Spielstart;
        Spielfeld();
    }

    //Empfangen
    @Override
    public void empfWürfel(int random){
        if(random == this.sendWürfeln()){
            state=Status.Spielstart;

        }else if(random > this.sendWürfeln()){
            state=Status.Versenken_E;

        }else{
            state=Status.Versenken_S;
        }
    }

    @Override
    public void empfff(){
        this.state=Status.SpielBeenden;
    }


    //Senden
    @Override
    public void sendWürfel(int random){
        random = (int) Math.random()*(10);

        this.state = Status.
    }


    @Override
    public void sendff(boolean Ergebnis){
        if(Ergebnis == true){
            this.state=Status.SpielBeenden;
        }
    }


}
