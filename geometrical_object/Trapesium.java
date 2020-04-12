package geometrical_object;

public class Trapesium extends SegiEmpat {
    private int sisi_miring;

    public Trapesium(String color,String filled_color,int sisi1,int sisi2,int sisi_miring){
        super(color,filled_color,sisi1,sisi2);
        this.sisi_miring = sisi_miring;
    }

    public double calculateArea(){
        int sisi_panjang = ((this.sisi1 >= this.sisi2) ? this.sisi1 : this.sisi2);
        int phytagoras = (Math.abs(this.sisi1-this.sisi2) / 2) * (Math.abs(this.sisi1-this.sisi2) / 2) + (this.sisi_miring) * (this.sisi_miring);
        return sisi_panjang * (Math.sqrt(phytagoras)) / 2;
    }

    public double calculateKeliling(){
        return super.calculateKeliling() + this.sisi_miring + this.sisi_miring;
    }

}