 class nestedif
 {
    public static void main(String[] args)
    {
        int a=5;

        if(a<=10) {
            System.out.println("a is lesser than");

            if(a==5) {
            System.out.println("a is equal to  5");
            } else {
            System.out.println("a is lesser or equal than 5");
            }
        
        else {
            System.out.println("a is not validated");
        }
        }
    }
 }