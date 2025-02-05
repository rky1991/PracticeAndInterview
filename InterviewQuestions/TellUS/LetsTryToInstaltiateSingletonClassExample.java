package TellUS;


 
// A normal class where we will try to instantiate class SingletonClassExample
class LetsTryToInstaltiateSingletonClassExample
{
    public static void main(String args[])
    {
        // instantiating Singleton class first time
    	SingletonClassExample first= SingletonClassExample.getInstanceOfSingletonClassExample();
 
        // instantiating Singleton class second time
    	SingletonClassExample second= SingletonClassExample.getInstanceOfSingletonClassExample();
 
       

    }
}