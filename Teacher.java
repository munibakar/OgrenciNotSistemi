import javax.xml.namespace.QName;

public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name,String branch,String mpno){
        this.name = name;

        this.branch = branch;

        this.mpno = mpno;
    }

    void print(){
        System.out.println("AD VE SOYAD: "+this.name);
        System.out.println("BRANŞ: "+this.branch);
        System.out.println("TELEFON: "+this.mpno);
    }
}
