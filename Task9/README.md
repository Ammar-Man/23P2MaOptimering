# Password Strength Testing System (TSP)

In this project, I am planning to implement the Traveling Salesman Problem (TSP) as a linear programming technique with a brute force approach to create a password strength testing system. The method I am employing involves brute force password cracking in different phases. The first phase is a brute force attack on passwords with a length less than 5 characters. The second method involves using a brute force dictionary approach, checking if the user's password is similar to any of the 200,000 stored passwords in the dictionary. The final test involves comparing the password with a text document. I iterate through the document, checking if the password resembles any words in the document to determine if it is a commonly used word.

After obtaining the results, we can decide whether the password is strong. If it is not, we will recommend a generated password as a replacement in case the original password is deemed weak.


1. Password Generation:
def generate_strong_password(length=12):
This function generates a strong password of the specified length by combining uppercase letters, lowercase letters, and digits.

2. Reading Passwords from Text Files:
def read_passwords(file_path, password_list, word_list, encoding='utf-8'):
This function reads passwords from a text file and stores them in a list (password_list). Additionally, it extracts individual words from the lines and stores them in another list (word_list).

3. Dictionary Creation:
Here, you're populating motivation_passwords and motivation_words lists by reading passwords and words from a file named "motivation sweden .txt."

4. Importing Password Lists:
You're importing passwords from three different files and storing them in separate lists.

5. Brute Force Password Crack Function:
def brute_force_password_crack(target_password):
This function attempts to crack a password using a brute force technique. It checks for the presence of punctuation in the target password and its length. If the password length is greater than 5, it assumes the password is strong.

6. Brute Force Dictionary Attack Function:
def dictionary_attack(target_password, dictionary):
This function performs a dictionary attack, checking if the target password matches any entry in a provided dictionary.

7. Checking Password Strength:
def check_password_strength(target_password):
This function checks the strength of the target password using the brute force and dictionary attack functions. It provides recommendations based on the results. If the password is deemed weak, it suggests a strong password as a replacement.

8. 1.  Example Usage:
This section demonstrates how to use the check_password_strength function with a specific target password.

# Example usage
# user_password = input("Enter your target_password: ")
user_password = "ammar!"
strength = check_password_strength(user_password)
print("------------------------------------------------------")
user_password = "ammar"
strength = check_password_strength(user_password)
print("------------------------------------------------------")
user_password = "JESUS998!"
strength = check_password_strength(user_password)
print("------------------------------------------------------")
user_password = "12asdfasdf3456"
strength = check_password_strength(user_password)

8. 2.  output:
Your password is good: 
  Your password:ammar!
------------------------------------------------------
Brute force attack: 
  The target_password has been cracked! Your password: ammar
  Here is a recommended strong target_password you can use: XSOal32ycH04RCoY
------------------------------------------------------
Dictionary attack: 
  The target_password has been cracked! Your password:JESUS998!
  Here is a recommended strong target_password you can use: Yo5KEqYY3KD8oSUL
------------------------------------------------------
Your password is good: 
  Your password:12asdfasdf3456


That brute force attacks and dictionary attacks are common methods used by attackers, and it's essential to encourage users to use strong, unique passwords.


