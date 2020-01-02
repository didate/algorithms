public class Main {

    public static void main(String[] args) throws Exception {
        Natural natural = new Natural();

        System.out.println(natural.pgcdBySubstract(3456,2648));

        System.out.println(natural.pgcdByDE(2648,3456));

        System.out.println(natural.ppcm(4,6));
    }
}
