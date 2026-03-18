# Blockchain in Java

A simple blockchain implementation using Java. This project demonstrates how blocks are created and connected using hashes.

## Features

- Create new blocks with Name and Age.
- Each block stores the hash of the previous block.
- Automatically generates a hash for every block.
- Validates the blockchain to check whether the blocks are properly connected.
- Starts with an initial block (Genesis Block).

## How It Works

1. The blockchain starts with an initial block.
2. New blocks can be added with data.
3. Each new block stores the previous block's hash.
4. The blockchain can be checked using `isValid()`.

## Run

```bash
javac Main.java
java Main
```
