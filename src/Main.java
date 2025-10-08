import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() throws InterruptedException {

        System.out.println("Espera 8 segundos...");
        long rondas = 10000;

        long sumatorio_tiempo_selection = 0;
        long sumatorio_tiempo_merge = 0;
        long sumatorio_tiempo_bubble = 0;


        int contador = 0;
        while(contador<rondas){
            Selection s = new Selection();
            Merge m = new Merge();
            Bubble b = new Bubble();

            contador+=1;
            long empiezaS = System.nanoTime();
            s.start();
            s.join();
            long finS = System.nanoTime();
            long ResultadoS = (finS-empiezaS)/1000;
            sumatorio_tiempo_selection = sumatorio_tiempo_selection + ResultadoS;

            long empiezaM = System.nanoTime();
            m.start();
            m.join();
            long finM = System.nanoTime();
            long ResultadoM = (finM-empiezaM)/1000;
            sumatorio_tiempo_merge = sumatorio_tiempo_merge + ResultadoM;

            long empiezaB = System.nanoTime();
            b.start();
            b.join();
            long finB = System.nanoTime();
            long ResultadoB = (finB-empiezaB)/1000;
            sumatorio_tiempo_bubble=sumatorio_tiempo_bubble+ ResultadoB;
        }

        long promedioS = sumatorio_tiempo_selection/rondas;
        long promedioM = sumatorio_tiempo_merge/rondas;
        long promedioB = sumatorio_tiempo_bubble/rondas;

        System.out.println("Tiempo Selection: " + promedioS + " ms" +
        "\nTiempo Merge: " + promedioM + " ms" +
        "\nTiempo Bubble: " + promedioB + " ms");






    }

}
