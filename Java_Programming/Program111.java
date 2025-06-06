/*
\npublic class Program111 {
/*
1. Display ASCII table (0 to 255) with Decimal, Hex, Octal, and Symbol

*/



public static void DisplayASCII()
{
  int i = 0;

  System.out.println("Decimal\tHex\tOctal\tCharacter");
  for (int i = 0; i <= 255; i++)
  {
    System.out.println(String.format("%d\t%X\t%o\t%c", i, i, i, i));
  }
}

public static void main(String[] args)
{
  DisplayASCII();
  
}

}
