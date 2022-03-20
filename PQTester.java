import java.util.Random;

public class PQTester {
    public static void main( String[] args ) {

        Random random = new Random();
        PQheap heap = new PQheap();

        for( int i = 0; i < 100; i++) {
            Element temp = new Element( random.nextInt( 1000 ), new Object() );
            heap.insert(temp);
        }

        heap.insert( new Element( 34 , new Object() ));
        heap.insert( new Element( 645 , new Object() ));
        heap.insert( new Element( -45 , new Object() ));

        for(int i = 0; i < 103; i++) {
            System.out.print( heap.extractMin().getKey() + ", ");
        }


    }
}
