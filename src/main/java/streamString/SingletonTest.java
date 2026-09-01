package streamString;

  class DatabaseCon{

    private static DatabaseCon databaseCon=null;
    public String message;
    private DatabaseCon(){
        message="message from singleton class";

    }
    static DatabaseCon getDatabaseCon(){
        if(databaseCon==null) {
            databaseCon = new DatabaseCon();
        }
            return databaseCon;

    }
}






public class SingletonTest {
    public static void main(String[] args) {

        DatabaseCon obj= DatabaseCon.getDatabaseCon();
        System.out.println(obj.message +" haseCode"+ obj.hashCode());
        DatabaseCon obj2= DatabaseCon.getDatabaseCon();
        System.out.println(obj.message +" haseCode"+ obj2.hashCode());
        DatabaseCon obj3= DatabaseCon.getDatabaseCon();
        System.out.println(obj.message +" haseCode"+ obj3.hashCode());

        SingletonEnum.INSTANCE.show();

    }
}
