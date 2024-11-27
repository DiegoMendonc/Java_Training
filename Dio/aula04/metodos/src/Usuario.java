public class Usuario {
    public static void main(String[] args) {
        String s = "-";
        SmartTv smartTv = new SmartTv();

        System.out.println("\n" + s.repeat(50));
        System.out.println("STATUS SMART TV: \n");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("\nCanal atual: " + smartTv.canal);
        System.out.println("\nVolume atual: " + smartTv.volume);
        System.out.println(s.repeat(50) + "\n");

        smartTv.ligar();
        System.out.println("Novo status -> TV LIGADA? " + smartTv.ligada + "\n");
    }
}
