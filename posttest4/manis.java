package com.mycompany.posttest4;

/**
 *
 * @author ASUS
 */
public class manis extends Martabak{
    private String toping;
    private String rasa;

    public void setToping(String toping) {
        this.toping = toping;
    }

    public void setRasa(String Rasa) {
        this.rasa = Rasa;
    }

    public String getToping() {
        return toping;
    }

    public String getRasa() {
        return rasa;
    }

    public manis(String toping, String jenis, String rasa, int harga) {
        super(jenis, harga);
        this.toping = toping;
        this.rasa = rasa;
    }

    @Override
    public void display(){
        System.out.println("Rasa : " + this.rasa);
        System.out.println("Toping : " + this.toping);
        super.display();
    }
    
    public void display(String martabak){
        if (martabak.equals("semua")){
            display();
            super.display(true);
        }
    }
}
