class Login{
    public static void main(String[] args){
        String id = "admin";
        int password =123;
        if(id.equals("admin")){
            System.out.println("User id is valid");
            if(password == 123){
                System.out.println("password valid");
                System.out.println("login successfully 😀😊");
            }
            else{
                System.out.println("password is inavlid");
                System.out.println("login failed 😔");
            }
        }
            else{
                System.out.println("user id is invalid");
                System.out.println("login is unsuccesfully");
            }
     }
}