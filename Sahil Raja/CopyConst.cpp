

#include<iostream>
using namespace std;

class Student 
{ 
    public:
  
   
   string name ;
   int Roll;
   string field;

//PC
Student(string n, int r, string f)
{
    name = n ;
    Roll = r;
    field = f;
    
}

//CC
Student (const Student &s)
{
    name = s.name;
    Roll = s.Roll;
    field = s.field;
}

void display ()
{
    cout<<"Name:"<<name<<endl;
    cout<<"Roll Number:"<<Roll<<endl;
    cout<<"Field:"<<field<<endl;
    
  }
    
};

int main()
{
    
  Student s1("Sahil",151,"IT");
  
  Student s2(s1);
  
  cout<<"Student 1:"<<endl; 
  s1.display();
  
   cout<<"Student 2:"<<endl; 
  s2.display();
  
  return 0;
  
}