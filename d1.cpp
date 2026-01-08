#include<iostream>
using namespace std;
class TV{
    private:

    bool isON;
    public:
    void control(bool x){
        isON = x;
    }
    void getsystemstatus(){
        if(isON){
            cout<<"TV is ON"<<endl;
        }
        else{
            cout<<"TV is OFF"<<endl;
        }
    }
    class Remote{
        public:
        void controlTV(TV &a, bool x){//c++ implements message passing by innebling us to conttol one object from another by passing messages or values
            a.control(x);
        }
    };
    int main(){
        TV t1;
        Remote r1;
        r1.controlTV(t1,true);
        t1.getsystemstatus();
    }
    

};