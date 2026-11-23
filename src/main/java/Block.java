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
