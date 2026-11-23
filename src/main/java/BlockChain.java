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
