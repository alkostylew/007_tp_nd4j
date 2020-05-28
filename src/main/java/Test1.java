import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.exception.ND4JArraySizeException;
import org.nd4j.linalg.factory.Nd4j;

public class Test1 {

    public static void main(String[] args) {
        INDArray t1 = Nd4j.ones(3, 4);
        INDArray t2 = Nd4j.zeros(3, 4);
        INDArray t3 = Nd4j.create(new double[]{6,9,4,0,5,12}, new int[]{2,3});
        INDArray t4 = Nd4j.create(new double[][]{{1,2,3}, {3,4,5}});
        INDArray t5 = Nd4j.zeros(3, 4).add(10);

        System.out.println(t1);
        System.out.println("-------------------------");
        System.out.println(t2);
        System.out.println("Shape of t1:");
        System.out.println(t1.shapeInfoToString());
        System.out.println("-------------------------");
        System.out.println(t3);
        System.out.println("-------------------------");
        System.out.println(t4);
        System.out.println("-------------------------");
        System.out.println(t5);
    }
}
