import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test2 {

    public static void main(String[] args) {
        INDArray t1 = Nd4j.create(new double[]{7,4,9,6,1,90}, new int[]{2,3});
        INDArray t2 = Nd4j.create(new double[][]{{1,3},{4,5},{8,9}});
        INDArray t3 = t1.mmul(t2);
        System.out.println(t1);
        System.out.println("-------------------------------");
        System.out.println(t2);
        System.out.println("-------------------------------");
        System.out.println(t3);
        System.out.println("-------------------------------");
    }
}
