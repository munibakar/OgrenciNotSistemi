public class Course {
    Teacher teacher;    // class ları birbiri içinde bu şekilde tanımlayabilir ve çağırabiliriz.
    String name;
    String code;
    String prefix;
    int note;
    int verbalGrade;

    Course(String name,String code,String prefix){
        this.name = name;

        this.code = code;

        this.prefix = prefix;

        this.note =0;

        this.verbalGrade = 0;
    }

    void printinfo(){
        System.out.println("----------------");
        System.out.println("DERS ADI: " + this.name);
        System.out.println("DERS KODU: " + this.code);
        System.out.println("DERS ÖN EK : " + this.prefix);
        teacher.print();

    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Branş uyuşmazlığı lütfen bilgilerinizi kontrol ediniz.");
        }
    }
}
