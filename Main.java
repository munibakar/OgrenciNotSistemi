public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Yıldırım","TRH","4444");
        Teacher t2 = new Teacher("Melek Şahin","MATH","5555");
        Teacher t3 = new Teacher("Aziz Sancar","FZK","6666");

        Course tarih = new Course("Tarih","101","TRH");
        Course matematik = new Course("Matematik","102","MATH");
        Course fizik = new Course("Fizik","103","FZK");


        tarih.addTeacher(t1);
        matematik.addTeacher(t2);
        fizik.addTeacher(t3);



        Student ali = new Student("Ali Avcı","505","4",tarih,matematik,fizik);
        ali.note(100,100,100);
        ali.verbalGrade(100,100,100);
        ali.printNote();

    }
}
