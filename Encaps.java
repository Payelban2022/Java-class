public class Encaps {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public static void main(String[] args){
        Encaps myObj = new Encaps();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}
