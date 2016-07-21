// goto loop example
#include <iostream>
#include <math.h>
using namespace std;
int main ()
{
long double
long double
long double
long double

a;
b;
c;
x;

cout << "a : ";
cin >> a;
cout << "b : ";
cin >> b;
cout << "c : ";
cin >> c;
// -b (+-) sqrt((b*b) - 4*a*c)/(2*a)
cout << "
-b (+-) sqrt((b*b) - 4*a*c)" << endl;
cout << "x = --------------------------" << endl;
cout << "
(2*a)" << endl << endl;
cout << "
-" << b << " (+-) sqrt((" << b << "*" << b << ") - 4*" << a << "
*" << c << "))" << endl;
cout << "x = --------------------------" << endl;
cout << "
(2*" << a << ")" << endl << endl;
cout << "
-" << b << " (+-) sqrt(" << b*b << -4*a*c << ")" << endl;
cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "
-" << b << " (+-) sqrt(" << (b*b) - 4*a*c << ")" << endl;
cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "Some solutions may appear here without the numbers being square roote
d." << endl << endl;
cout << "
-" << b << " (+-) " << sqrt((b*b) -4*a*c) << endl;
cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "A Positive Solution." << endl << endl;
cout << "
-" << b << "+ " << sqrt((b*b) -4*a*c) << endl;
cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "
" << -b + sqrt((b*b) - 4*a*c) << endl;
cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "x = " << (-b + sqrt((b*b) - (4*a*c)))/(2*a) << endl << endl;
cout << "A Negative Solution." << endl << endl;
cout << "

-" << b << "- " << sqrt((b*b) -4*a*c) << endl;

cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "
" << -b - sqrt((b*b) - 4*a*c) << endl;
cout << "x = --------------------------" << endl;
cout << "
" << 2*a << endl << endl;
cout << "x = " << (-b - sqrt((b*b) - (4*a*c)))/(2*a) << endl << endl;
cout << "Two possible solutions are " << (-b + sqrt((b*b) - (4*a*c)))/(2*a) <<
" and " << (-b - sqrt((b*b) - (4*a*c)))/(2*a) << endl;
}


