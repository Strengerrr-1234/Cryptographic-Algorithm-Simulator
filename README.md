# Step-by-Step Guide to Configure, Understand, and Run the Cryptographic Algorithm Simulator


## Step 1: Understand the Project
  ### What Does the Simulator Do?
   1. It allows the user to select between two cryptographic algorithms:
       * **RSA**: Asymmetric encryption using a public-private key pair.
       * **AES**: Symmetric encryption using a shared secret key.
   2. Each algorithm demonstrates:
       * Generating keys.
       * Encrypting a message.
       * Decrypting the message.
   Structure of the Project
   * **Main.java**: The entry point where the user chooses the algorithm.
   * **RSAExample.java**: Handles RSA encryption and decryption.
   * **AESExample.java**: Handles AES encryption and decryption.


## Step 2: Prerequisites
 ### Tools Required:
 1. ### Java Development Kit (JDK):
     * Install the latest version of the JDK (e.g., OpenJDK or Oracle JDK).
     * Verify installation:
 ```
    java -version
    javac -version
 ```
 2. ### Text Editor/IDE:
     * Use an IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code.
     * Alternatively, use a text editor like Notepad++ or Vim.
 3. ### Command Line/Terminal:
    * Ensure you can execute commands like `javac` and `java`.


## Step 3: Directory Structure:
```
CryptoSimulator/
├── Main.java
├── RSAExample.java
└── AESExample.java
```


## Step 4: Compile the Code
  1. Open the terminal or command prompt.
  2. Navigate to the project directory:
    ```
    cd CryptoSimulator
    ```
  3. Compile all `.java` files:
    ```
    javac Main.java RSAExample.java AESExample.java
    ```
  * If there are no errors, .class files will be generated in the same directory.


## Step 5: Run the Program
  1. Execute the program:
  ```
  java Main
  ```
  2. You will see a prompt to select an algorithm:
  ```
  Select the cryptographic algorithm:
  1. RSA
  2. AES
  ```
  3. Enter `1` for RSA or `2` for AES.
  4. Follow the output to see the encryption and decryption in action.


## Step 6: What the Source Code Does
### 1. Main.java:
  * Prompts the user to choose between RSA and AES.
  * Invokes the corresponding class (either `RSAExample` or `AESExample`) to demonstrate the algorithm.
### 2. RSAExample.java:
  * Generates an RSA key pair (public and private keys).
  * Encrypts a sample message using the public key.
  * Decrypts the encrypted message using the private key.
  * Uses the `Cipher` class from Java's `javax.crypto` package.
  ### Key Points:
   * RSA is asymmetric encryption.
   * Public key is used for encryption, and the private key is used for decryption.
### 3. AESExample.java:
  * **Generates a symmetric key** using the AES algorithm.
  * Encrypts a sample message using the key.
  * Decrypts the encrypted message using the same key.
  * Uses the `Cipher` class and `KeyGenerator` from Java's `javax.crypto` package.
  ### Key Points:
   * AES is **symmetric** encryption.
   * The same key is used for encryption and decryption.


## Step 7: Verify the Output
When you run the program, the output should look similar to:
For RSA:
```
Select the cryptographic algorithm:
1. RSA
2. AES
1
Original Text: Hello RSA!
Encrypted Text: <Some Encrypted String>
Decrypted Text: Hello RSA!
```
For AES:
```
Select the cryptographic algorithm:
1. RSA
2. AES
2
Original Text: Hello AES!
Encrypted Text: <Some Encrypted String>
Decrypted Text: Hello AES!
```
