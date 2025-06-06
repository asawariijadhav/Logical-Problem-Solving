/*
\nimport java.util.*;\n\npublic class Program119 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Write a program which accepts string from user and check whether it contains vowels in it or not.

Input:
"marvellous" → true
"Demo" → true
"xyz" → false

*/







boolean ChkVowel(char *str)
{
  while (*str != '\0')
  {
    if (*str == 'A' || *str == 'E' || *str == 'I' || *str == 'O' || *str == 'U' ||
        *str == 'a' || *str == 'e' || *str == 'i' || *str == 'o' || *str == 'u')
    {
      return true;
    }
    str++;
  }
  return false;
}

public static void main(String[] args)
{
  char arr[20];
  boolean bRet = false;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  bRet = ChkVowel(arr);

  if (bRet == true)
  {
    System.out.println("Contains Vowel");
  }
  else
  {
    System.out.println("There is no Vowel");
  }

  
}

}
