package mediateka;

public class Ebook {
    private String Titulli;
    private String Autori;
    private String Zhanri;
    private String Kategoria;
    private String Kompania;

    public Ebook(String t, String a, String z, String k, String ko){
        this.Titulli=t;
        this.Autori=a;
        this.Zhanri=z;
        this.Kategoria=k;
        this.Kompania=ko;
    }
    public void hyrja(){
        System.out.println("Faqja e pare e mediatekes");
    }
    public String getTitulli(){
        return Titulli;
    }
    public String getAutori(){
        return Autori;
    }
    public String getZhanri(){
        return Zhanri;
    }
    public String getKategoria(){
        return Kategoria;
    }
    public String getKompania(){
        return Kompania;
    }

}
