public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course verbalGrade;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2= c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }
    void note(int note1,int note2,int note3){
        if (note1 >= 0 && note1 <= 100){
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100){
            c3.note = note3;
        }
    }

    void verbalGrade(int grade1,int grade2,int grade3){
        c1.verbalGrade = grade1;
        c2.verbalGrade = grade2;
        c3.verbalGrade = grade3;
    }

    void isPass(){
        double average = (c1.note + c2.note + c3.note) / 3.0;
        if (average>55){
            System.out.println("Hadi yine iyisin bu senelik yırttın.!");
        }else {
            System.out.println("Geçmiş olsun.Üzülme seneye tekrar denersin:(");
        }
    }

    void printNote(){
        System.out.println("Öğrenci Adı ve Soyadı: " +this.name);
        System.out.println(this.c1.name + " Notu: " + c1.note + " -->Sözlü Notu: " + c1.verbalGrade);
        System.out.println(this.c2.name + " Notu: " + c2.note + " -->Sözlü Notu :" + c2.verbalGrade);
        System.out.println(this.c3.name + " Notu: " + c3.note  + " -->Sözlü Notu :" + c3.verbalGrade);

        System.out.println("Ortalaman:" + ((c1.note*0.80) + (c1.verbalGrade*0.20)+(c2.note*0.80) + (c2.verbalGrade*0.20)+(c3.note*0.80) + (c3.verbalGrade*0.20)) / 3.0);
        isPass();
    }

}
