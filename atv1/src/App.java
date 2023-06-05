public class App {
    public static void main(String[] args) throws Exception {
        instrumentos[] instrumentos = new instrumentos[5];
        instrumentos[0] = new Sopro();
        instrumentos[1] = new Percussao();
        instrumentos[2] = new SoproMetal();
        instrumentos[3] = new SoproMadeira();
        instrumentos[4] = new Corda();

        sinfonia(instrumentos);
    }
    public static void sinfonia(instrumentos[] instrumentos){
        for(instrumentos i : instrumentos){
            i.tocar();
            i.nome();
            i.afinar();
        }
    }
}
