package FP_tutorials.FP_Tutorials_21002061.tutorial_6

object T6_question_1 {
  // Encryption function
  def encrypt(text: String, shift: Int): String = {
    val alphabetSize = 26 // Number of letters in the English alphabet
    val encryptedText = text.map { char =>
      if (char.isLetter) {
        val isUpperCase = char.isUpper
        val shiftedChar = (char.toLower.toInt + shift - 'a'.toInt) % alphabetSize + 'a'.toInt
        if (isUpperCase) shiftedChar.toChar.toUpper else shiftedChar.toChar
      } else {
        char // Non-alphabetic characters remain unchanged
      }
    }
    return encryptedText
  }

  // Decryption function
  def decrypt(text: String, shift: Int): String = {
    encrypt(text, -shift) // Decryption is simply encryption with a negative shift
  }

  // Cipher function to process data using Encryption or Decryption
  def cipher(data: String, shift: Int, process: (String, Int) => String): String = {
    process(data, shift)
  }

  def main(args: Array[String]): Unit = {
    val plainText1 = "ABC-XYZ"
    val plainText2 = "I love UOC!"
    val shift = 1

    val encryptedText1 = cipher(plainText1, shift, encrypt)
    println(s"Encrypted Text: $encryptedText1")

    val decryptedText1 = cipher(encryptedText1, shift, decrypt)
    println(s"Decrypted Text: $decryptedText1")

    println("")

    val encryptedText2 = cipher(plainText2, shift, encrypt)
    println(s"Encrypted Text: $encryptedText2")

    val decryptedText2 = cipher(encryptedText2, shift, decrypt)
    println(s"Decrypted Text: $decryptedText2")
  }
}
