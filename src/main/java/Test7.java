import java.io.IOException;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.impl.accum.Sum;
import org.nd4j.linalg.api.ops.impl.transforms.Sigmoid;
import org.nd4j.linalg.factory.Nd4j;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;

public class Test7 {

    public static void main(String[] args) throws IOException {
        INDArray t1 = Nd4j.create(new double[] {9,3,67,12,78,4}, new int[] {3,2});
        System.out.println(t1);
        Nd4j.writeTxt(t1, "data.txt");
        
        INDArray t2 = Nd4j.readTxt("data.txt");
        System.out.println("--------------------------");
        System.out.println(t2);
        
        INDArray t3 = Nd4j.readNumpy("inputData.txt",",");
        System.out.println("--------------------------");
        System.out.println(t3);
    }
}
