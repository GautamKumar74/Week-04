package multileveluniversitycoursemanagementsystem;

class Course<T extends CourseType> {
    private String name;
    T type;
    Course(T type, String name){
        this.type= type;
        this.name= name;
    }

    public void display(){
        System.out.println(type.getCourseType());
        System.out.println(name);
    }
}
