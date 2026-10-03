#include <iostream>
#include <string>
using namespace std ;

class Student
{
    public:
    
    string name;
    int RollNo;
    string Dept;




    Student(string n , int r, string d)
    {
        name  =n;
        RollNo = r;
        Dept = d;
    }
    
    void display()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"Roll Number: "<<RollNo<<endl;
        cout<<"Department: "<<Dept<<endl;
        
    }
    
};

int main()
{
    Student s1("Sahil",151,"BCA");
    // s1.name = "Sahil Raja";
    // s1.RollNo = 151;
    // s1.Dept = "BCA";
    
    s1.display();
    
    return 0;
}