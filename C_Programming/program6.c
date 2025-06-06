/*
start
    Accept percentage from user
      If percentage is less than 0 and grater than 100
        Display as invalid input
      If percentage is greater than 0 and less than 35
        Display as fail
     If percentage is greater than 35 and less than 50
        Display as fail
        If percentage is greater than 50 and less than 60
        Display as fail
     If percentage is greater than 60 and less than 70
        Display as fail
     If percentage is greater than 70 and less than 100
        Display as first class with distinction
stop
*/

#include <stdio.h>

void DisplayClass(float fPerc)
{
  if ((fPerc < 0.0f) || (fPerc > 100.0f))
  {
    printf("unabled to proceed as input is invalid\n");
    return;
  }

  if ((fPerc >= 0.0f) && (fPerc < 35.0f))
  {
    printf(" sorry your fail\n");
  }
  else if ((fPerc >= 35.0f)&&(fPerc < 50.0f))
  {
    printf("pass class");
  }
  else if ((fPerc >= 50.0f)&&(fPerc < 60.0f))
  {
    printf("second class");
  }
  else if ((fPerc >= 60.0f)&&(fPerc < 70.0f))
  {
    printf("first class");
  }
  else if ((fPerc >= 70.0f)&&(fPerc <= 100.0f))
  {
    printf("first class with distinction");
  }
}
int main()
{

  float fValue = 0.0f;

  printf("please enter your percentagr :\n");
  scanf("%d", &fValue);

  DisplayClass(fValue);

  return 0;
}