package Prototype;
public class Main
{
    public static void main(String[] args)
    {
         GestorEnemigo objGP = new GestorEnemigo();
        // Obtenemos el Guerrero original
         Enemigo g1 = objGP.getEnemigo("Warrior1");
        System.out.println("==============================");
        // Mostramos su datos
        System.out.println("El Guerrero original se llama [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        // Obtener un segundo Guerrero (clon del anterior)
         Enemigo g2 = objGP.getClon("Warrior1");
        // Mostrar los datos  (ambos tienen datos similares)
        System.out.println("Clon del Guerrero creado:");
        System.out.println("Su nombre es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero clonado
        g2.setNombre("Warrior2");
        g2.setArma("HACHA");
        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Tras modificar el clon, ahora se llama [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]\n");
        System.out.println("El nombre del Guerrero original es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero original
        g1.setNombre("Warrior-1");
        g1.setArma("MAZA");
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
    }
}
