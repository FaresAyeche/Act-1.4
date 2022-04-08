public class voile{
    public int largeur;
    private int longeur ;
    private int epaisseur ;
    protected String couleur ;
    private boolean enroule;
    private boolean deroule;
final int ide=4;
    
//constructeur vide
voile(){

this.largeur=0;
this.longeur=0;
this.epaisseur=0;
this.couleur="";
this.enroule=false;
this.deroule=false;

}
//constructeur
voile(int largeur, int longeur,int epaisseur,String couleur ,boolean enroule,boolean deroule) {

this.largeur=largeur;
this.longeur=longeur;
this.epaisseur=epaisseur;
this.couleur=couleur;
this.enroule=enroule;
this.deroule=deroule;
}
boolean enrouler(){
boolean a =!enroule;
return a;
}
 
boolean derouler(){
boolean b =!enroule;
return b ;
}
}
