import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test4 {

    public static void main(String[] args) {
        INDArray t1 = Nd4j.ones(2,2);
        INDArray t2 = Nd4j.pad(t1, new int[]{2,2}, Nd4j.PadMode.CONSTANT);
        System.out.println(t1);
        System.out.println("-------------------------------");
        System.out.println(t2);
        System.out.println("-------------------------------");
    }
}
