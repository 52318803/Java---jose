public class Peso_e_Altura {
    
    public static void main(String[] args) {
        

        pessoa p1 = new pessoa();
        p1.setAltura(163);
        p1.setSexo("F");
        System.out.println(p1.getPeso_ideal());


        pessoa p2 = new pessoa();
        p2.setAltura(170);
        p2.setSexo("M");
        System.out.println(p2.getPeso_ideal());

    }

}
