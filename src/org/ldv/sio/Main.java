package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Client c = new Client("Dijsktra", "Edsger");
    Adresse a = new Adresse("Dijkstra", "3 rue du clocher", "Melun", "77000");
    Client c2 = new Client("Kernighan", "Brian");
    Adresse a2 = new Adresse("Kernighan","2 rue du cimetiere", "Paris", "75001");
    System.out.println(c.toString() + a.toAdresse());
    System.out.println(c2.toString() + a2.toAdresse());
  }
}
