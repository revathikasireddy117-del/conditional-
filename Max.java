public class Max {
    public static void main(String[] args){
        int a =20;
        int b =12;
        int c = 15;

        if(a>b && a>c){
            System.out.println(a+ "is a maximum");
            if(b>a && b>c){
                System.out.println(b+ "is a  maximum");
            }
            else{
                System.out.println(c+ "is a  maximum");
            }
        }
        else{
            System.out.println(a+ b+ c+ "is a  maximum");
        }


    }
}
