import org.nd4j.linalg.api.iter.NdIndexIterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test5 {

    public static void main(String[] args) {
        INDArray t1 = Nd4j.eye(4);
        System.out.println(t1);
        System.out.println("-------------------------------");
        INDArray t2 = Nd4j.linspace(0,50,9).reshape(new int[]{3,3});
        System.out.println(t2);

        NdIndexIterator iterator = new NdIndexIterator(new int[]{3,3});
        while (iterator.hasNext()) {
            long[] index = iterator.next();
            System.out.println(t2.getDouble(index));
        }
    }
}
