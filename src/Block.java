import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Block {
    private String Name;
    private int Age;
    public int PrevHash;
    public int CurrHash;

    public Block()
    {
        this.Age = 0;
        this.Name = "";
        this.PrevHash = 0;
        this.CurrHash = this.hashCode();
    }
    public Block(String Name, int Age, int Hash)
    {
        this.Age = Age;
        this.Name = Name;
        this.PrevHash = Hash;
        this.CurrHash = this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;
        return Age == block.Age && Objects.equals(Name, block.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }
}


class BlockChain
{
    public List<Block> chain = new ArrayList<>();
    public int prevHash = 0;

    public BlockChain()
    {
        chain.add(new Block());
    }

    public boolean addBlock(String Name, int age)
    {
        if(this.isValid() == false) return false;

        Block newBlock = new Block(Name, age, prevHash);
        prevHash = newBlock.CurrHash;

        chain.add(newBlock);
        return true;
    }

    public boolean isValid()
    {
        int n = chain.size();
        for(int i = 1; i < n; i++)
        {
            int curr = chain.get(i).PrevHash;
            int prev = chain.get(i - 1).CurrHash;
            if (curr != prev) return false;
        }
        return true;
    }
}
