
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlockChainTest {

    @Test
    void emptyBlockchainShouldBeValid() {
        BlockChain chain = new BlockChain();

        assertTrue(chain.isValid());
    }

    @Test
    void addingOneBlockShouldBeValid() {
        BlockChain chain = new BlockChain();

        assertTrue(chain.addBlock("Shud", 20));
        assertTrue(chain.isValid());
    }

    @Test
    void addingMultipleBlocksShouldBeValid() {
        BlockChain chain = new BlockChain();

        chain.addBlock("Shud", 20);
        chain.addBlock("Alice", 25);
        chain.addBlock("Bob", 30);

        assertTrue(chain.isValid());
    }

    @Test
    void blocksShouldBeAddedInOrder() {
        BlockChain chain = new BlockChain();

        assertTrue(chain.addBlock("Shud", 20));
        assertTrue(chain.addBlock("Alice", 25));

        assertTrue(chain.isValid());
    }
}
