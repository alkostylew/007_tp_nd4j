import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.impl.accum.Sum;
import org.nd4j.linalg.api.ops.impl.transforms.Sigmoid;
import org.nd4j.linalg.factory.Nd4j;

public class Test6 {

    public static void main(String[] args) {
        INDArray t1 = Nd4j.zeros(3,4).add(10);
        INDArray t2 = Nd4j.ones(3,4);
        System.out.println(t1);
        INDArray t3 = t1.addi (20);
        System.out.println("-----------------------------");
        System.out.println(t1);
        System.out.println("-----------------------------");
        System.out.println(t3);
        System.out.println("-----------------------------");

        INDArray t4 = Nd4j.create(new double[][]{{8,6666},{9,6},{4,9}});
        System.out.println("-----------------------------");
        System.out.println(t4);

        Accumulation acc = Nd4j.getExecutioner().execAndReturn(new Sum(t4));
        System.out.println("-----------------------------");
        System.out.println(acc);
        System.out.println("Somme="+acc.getFinalResult().doubleValue());
        System.out.println("-----------------------------");
        System.out.println(t4.sum(0)); // soma dimensão 0
        System.out.println(t4.sum(1)); // soma dimensão 1
        System.out.println("-----------------------------");
        System.out.println(t4.argMax(0));
        System.out.println("-----------------------------");
        System.out.println(t4.argMax(1));
        
        INDArray t5 = Nd4j.getExecutioner().execAndReturn(new Sigmoid(t4));
        System.out.println("-----------------------------");
        System.out.println(t5);
    }
}
