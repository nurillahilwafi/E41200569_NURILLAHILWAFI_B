
package managingpeople;

class person {
    String Name;
    int Age;
    
    public void set(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }

}
public class ManagingPeople {
    public static void main(String[] args) {
        
        person p1 = new person();
        p1.set("Arial", 37);
        person p2 = new person();
        p2.set("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getAge()+" "+"is the same age as"+ p2.getName());
        }
        else{
            System.out.println(p1.getName()+" "+"is not the same age as"+ p2.getName());
        }
    }
    
}
