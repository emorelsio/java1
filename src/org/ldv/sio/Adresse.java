package org.ldv.sio;

import java.util.Objects;

public class Adresse {

    private String nom;
    private String rue;
    private String ville;
    private String codePostal;

    public Adresse(String nom, String rue, String ville, String codePostal) {
        this.nom = nom;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return Objects.equals(nom, adresse.nom) &&
                Objects.equals(rue, adresse.rue) &&
                Objects.equals(ville, adresse.ville) &&
                Objects.equals(codePostal, adresse.codePostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, rue, ville, codePostal);
    }

    public String toAdresse() {
        return "Adresse : {" +
                "nom='" + nom + '\'' +
                ", rue='" + rue + '\'' +
                ", code postal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
