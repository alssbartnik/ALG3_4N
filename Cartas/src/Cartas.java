import java.util.Random;


public class Cartas {
	
	Random n = new Random();
    int[] j1 = new int[5];
    int[] j2 = new int[5];
    int[] j3 = new int[5];
    int[] j4 = new int[5];
    {
    
    for(int i = 0 ; i < 5 ; i++){
        j1[i] = n.nextInt(13)+1;
        j2[i] = n.nextInt(13)+1;
        j3[i] = n.nextInt(13)+1;
        j4[i] = n.nextInt(13)+1;
    }      
    System.out.println("Jogador 1: "+j1[0]+" "+j1[1]+" "+j1[2]+" "+j1[3]+" "+j1[4]);
    System.out.println("Jogador 2: "+j2[0]+" "+j2[1]+" "+j2[2]+" "+j2[3]+" "+j2[4]);
    System.out.println("Jogador 3: "+j3[0]+" "+j3[1]+" "+j3[2]+" "+j3[3]+" "+j3[4]);
    System.out.println("Jogador 4: "+j4[0]+" "+j4[1]+" "+j4[2]+" "+j4[3]+" "+j4[4]);

}
}
