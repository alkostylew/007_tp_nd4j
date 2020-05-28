import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test3 {

    public static void main(String[] args) {
        INDArray t1 = Nd4j.ones(3,4);
        INDArray t2 = Nd4j.zeros(3,4);
        INDArray t3 = Nd4j.hstack(t1,t2);
        INDArray t4 = Nd4j.vstack(t1,t2);

        System.out.println(t1);
        System.out.println("-------------------------------");
        System.out.println(t2);
        System.out.println("-------------------------------");
        System.out.println(t3);
        System.out.println("-------------------------------");
        System.out.println(t4);
        System.out.println("-------------------------------");
    }
}
