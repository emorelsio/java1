package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Client c = new Client("Dijsktra", "Edsger");
    Adresse a = new Adresse("Dijkstra", "3 rue du clocher", "Melun", "77000");
    adresseLivraison al = new adresseLivraison("", "", "", "");
    System.out.println(c.toString());
    System.out.println("Adresse de domicile: " + a.toAdresse());
    if (al.toAdresseLiv().equals("") == false) {
      System.out.println("Adresse de livraison: " + a.toAdresse());
    } else {
      System.out.println("Adresse de livraison: " + al.toAdresseLiv());
    }
  }
}
