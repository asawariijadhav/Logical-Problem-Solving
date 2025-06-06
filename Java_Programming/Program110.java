/*
\nimport java.util.*;\n\npublic class Program110 {\n    public static Scanner scanner = new Scanner(System.in);
/*
 5. Accept division and display exam timing based on division (A/B/C/D)

Input: C
Output : Your exam at 9.20 AM

Input: d
Output :Your exam at 10.30 AM

*/






boolean DisplaySchedule(char chDiv)
{
  if (chDiv == 'A' || chDiv == 'a')
    System.out.println("Your exam at 7.00 AM");
  else if (chDiv == 'B' || chDiv == 'b')
    System.out.println("Your exam at 8.30 AM");
  else if (chDiv == 'C' || chDiv == 'c')
    System.out.println("Your exam at 9.20 AM");
  else if (chDiv == 'D' || chDiv == 'd')
    System.out.println("Your exam at 10.30 AM");
  else
    System.out.println("Invalid Division");

  return true;
}

public static void main(String[] args)
{
  char cValue = '\0';
  boolean bRet = false;

  System.out.print("Enter your division: ");
  cValue = scanner.nextInt();

  bRet = DisplaySchedule(cValue);

  
}

}
