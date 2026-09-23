package Day2;

public class Arrayprop {
static int[] arr = {1,2,3,4,5,6,7,8,9,10};
public static  class student {
    String name;
    int ages;
    student(String name , int age){
        this.name =name;
        this.ages = age;
    }
}
static student[] st = new student[5];
public static void main(String[] args) {

    // first prop
    st[0] =new student("rajmani", 20);
    st[1] =new student("raj", 30);
    st[2] =new student("mani", 40);
    st[3] =new student("ritik", 50);
    st[4] =new student("ritika", 10);
    for (int i = 0; i<st.length;i++){
        System.out.println(st[i].name + " " + st[i].ages);
    }


   

}
}
