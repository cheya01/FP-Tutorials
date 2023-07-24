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

  def main(args: Array[String]): Unit = {
    val plainText = "I love UOC!"
    val shift = 1

    val encryptedText = encrypt(plainText, shift)
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = decrypt(encryptedText, shift)
    println(s"Decrypted Text: $decryptedText")
  }
}
