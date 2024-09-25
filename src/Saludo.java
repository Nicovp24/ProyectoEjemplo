// src/Saludo.java
public class Saludo {
    public void saludar() {
        System.out.println("¡Hola, mundo!");
    }

    public void despedir() {
        System.out.println("¡Adiós, mundo!");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        saludo.saludar();
        saludo.despedir();  // Llamar al método despedir
    }
}