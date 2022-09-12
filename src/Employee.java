public class Employee {
    private String name;
    private String surname;
    private String geburstdatum;
    private char geschlecht;
    private int alter;
    private double gewicht ;
    private String abteilung ;
    private double gehalt;
    private int dienstjahre;
    private String besonderheiten;

    public Employee(String name, String vorname, String geburtsdatum, char geschlecht, int alter, double gewicht, String abteilung, double gehalt, int dienstjahre, String besonderheiten){
        this.name = name;
        this.surname = vorname;
        this.geburstdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.gewicht = gewicht;
        this.abteilung = abteilung;
        this.gehalt = gehalt;
        this.dienstjahre = dienstjahre;
        this.besonderheiten = besonderheiten;
    }
}
