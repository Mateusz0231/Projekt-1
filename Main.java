import java.util.Random;
class Main {
  public static void main(String[] args) {
      Random los = new Random();
        // utworzy tablicę dwuwymiarową 6x6
        int[][] A = new int[6][6]; 
        int ileParzystych = 0;
        int ileNieparzystych = 0;
        int sumaParzystych = 0;
        int sumaNieparzystych = 0;
         
        for(int i=0; i<A.length; i++){ 
            for(int j=0;j<A[i].length;j++){
                // wypełni ją losowymi liczbami całkowitymi z przedziału [0,9]
                A[i][j] = los.nextInt(10);
                 
                System.out.format("%4d",A[i][j]);
                 
                if(A[i][j] % 2 == 0){
                    ileParzystych++; // ilości liczb parzystych
                    sumaParzystych += A[i][j]; // policzy sumę liczb parzystych
                }else{
                    ileNieparzystych++; // ilości liczb nieparzystych
                    sumaNieparzystych += A[i][j];
                }               
            }
            System.out.println();
        }
 
        System.out.println("Liczb parzystych: " + ileParzystych);
        System.out.println("Liczb nieparzystych: " + ileNieparzystych);
        System.out.println("Suma liczb parzystych: " + sumaParzystych);
        System.out.println("Średnia liczb nieparzystych: " + (double)(sumaNieparzystych / ileNieparzystych));
    }
}
