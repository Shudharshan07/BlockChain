import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        BlockChain chain = new BlockChain();

        chain.addBlock("Shud", 20);

        System.out.print(chain.isValid());
    }
}
