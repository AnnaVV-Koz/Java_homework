package ua.intita.qa;

public class Student {
    private int id;
    private String surname;
    private  String  name;
    private String otchestvo;
    private int birthday;
    private String adress;
    private  int telephone;
    private String Facult;
    private  int cource;
    private String group;

    public Student
            (
              int id,
              String surname,
              String name,
              String otchestvo,
              int birthday,
              String adress,
              int telephone,
              String Facult,
              int cource,
              String group
            )
     {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.birthday = birthday;
        this.adress = adress;
        this.telephone = telephone;
        this.Facult = Facult;
        this.cource = cource;
        this.group = group;
    }

    public Student (int id){
        this.id = id;
    }
    public int getId() { return id;  }

    public void setId(int id) {  this.id = id; }

    public String getSurname() {  return surname;  }

    public void setSurname(String surname) {  this.surname = surname;  }

    public String getName() {      return name;  }

    public void setName(String name) {     this.name = name;  }

    public String getOtchestvo() {      return otchestvo;  }

    public void setOtchestvo(String otchestvo) {  this.otchestvo = otchestvo;  }

    public int getBirthday() {   return birthday;  }

    public void setBirthday(int birthday) {  this.birthday = birthday; }

    public String getAdress() {    return adress;}

    public void setAdress(String adress) { this.adress = adress; }

    public int getTelephone() {    return telephone; }

    public void setTelephone(int telephone) {   this.telephone = telephone;  }

    public String getFacult() {    return Facult; }

    public void setFacult(String facult) {   Facult = facult;  }

    public int getCource() {   return cource;   }

    public void setCource(int cource) {  this.cource = cource;   }

    public String getGroup() {    return group;  }

    public void setGroup(String group) {     this.group = group;   }

    public static void listOfStudentsFaculty(Student[] persons,String faculty){
        for (int i=0;i<persons.length;i++){
            if(faculty.equals(persons[i].Facult)){
                System.out.println(persons[i].name + " " + persons[i].surname + " " + persons[i].otchestvo);
            }
        }
    }
    public static void listOfStudentsAllFacultiesCourse(Student[] person,String faculty,int cource){
        //System.out.println(faculty);
        for (int i=0;i<person.length;i++){
            if (faculty.equals(person[i].Facult) && (cource==person[i].cource))
            {
                System.out.println(person[i].name + " " + person[i].surname + " " + person[i].otchestvo);
            }
        }
    }

    public static void studentsBornAfterYear(Student[] people,int year){
        System.out.println("Born after " + year);
        for (int i=0;i<people.length;i++){
            if(people[i].birthday > year){
                System.out.println(people[i].name + " " + people[i].surname);
            }
        }
    }

    public static void listOfStudyGroup(Student[] students,String group){
        System.out.println("Group " + group);
        for (int i=0;i<students.length;i++){
            if(students[i].group.equals(group)){
                System.out.println(students[i].name + " " + students[i].surname);
            }
        }
    }
}
